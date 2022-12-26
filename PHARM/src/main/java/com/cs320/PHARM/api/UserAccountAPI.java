package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.UserAccountDao;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.PreUpdate;
import java.awt.*;

@Component
public class UserAccountAPI {
    @Autowired
    UserAccountDao userAccountDao;


    @RequestMapping
    public UserAccount findUserAccountByName(String username){
        return userAccountDao.findUserAccountByName(username);
    }
    @PostMapping
    public void insertUserAccount(String username,String password,int type,int id){
        userAccountDao.insertUserAccount(username,password,type,id);
    }
    @DeleteMapping
    public void deleteUserAccount(String username){
        userAccountDao.deleteUserAccount(username);
    }
    @PutMapping
    public void updatePassword(String username,String password){
        userAccountDao.updatePassword(username,password);
    }

    public void removeAll() {
        userAccountDao.removeAll();
    }

    public void updateUserNameById(int id, String name) {
        userAccountDao.updateUserNameById(id,name);
    }
}
