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

@Component
public class UserAccountAPI {
    @Autowired
    UserAccountDao userAccountDao;


    @RequestMapping
    public UserAccount findUserAccountByName(String username){
        return userAccountDao.findUserAccountByName(username);
    }
    @PostMapping
    public void insertUserAccount(String username,String password,int type){
        userAccountDao.insertUserAccount(username,password,type);
    }
    @DeleteMapping
    public void deleteUserAccount(String username){
        userAccountDao.deleteUserAccount(username);
    }
    @PutMapping
    public void updatePassword(String username,String password){
        userAccountDao.updatePassword(username,password);
    }

}
