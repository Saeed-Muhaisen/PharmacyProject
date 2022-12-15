package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.UserAccountDao;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAccountAPI {
    @Autowired
    UserAccountDao userAccountDao;



    public UserAccount findUserAccountByName(String username){
        return userAccountDao.findUserAccountByName(username);
    }
    public void insertUserAccount(String username,String password,int type){
        userAccountDao.insertUserAccount(username,password,type);
    }
    public void deleteUserAccount(String username){
        userAccountDao.deleteUserAccount(username);
    }
    public void updatePassword(String username,String password){
        userAccountDao.updatePassword(username,password);
    }

}
