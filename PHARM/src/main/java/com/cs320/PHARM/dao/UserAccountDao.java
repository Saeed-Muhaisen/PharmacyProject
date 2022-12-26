package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserAccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final RowMapper<UserAccount> userAccountRowMapper = (resultSet, i) -> new UserAccount()
            .UserName(resultSet.getString("UserName"))
            .Password(resultSet.getString("Password"))
            .Type(resultSet.getInt("type"))
            .id(resultSet.getInt("id"));


    public UserAccount findUserAccountByName(String username){
        return jdbcTemplate.queryForObject("Select * from useraccounts where username=?",new Object[]{username},userAccountRowMapper);
    }
    public void insertUserAccount(String username,String password,int type,int id){
        jdbcTemplate.update("insert into useraccounts(username, password, type,id) values (?,?,?,?)",new Object[]{username,password,type,id});
    }
    public void deleteUserAccount(String username){
        jdbcTemplate.update("delete from useraccounts where username=?",username);
    }
    public void updatePassword(String username,String password){
        jdbcTemplate.update("Update useraccounts set password=? where username=?",password,username);
    }

    public void removeAll() {
        jdbcTemplate.update("Delete from useraccounts");
    }

    public void updateUserNameById(int id, String name) {
        jdbcTemplate.update("Update useraccounts set username=? where id=?",id,name);
    }
}
