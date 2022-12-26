package com.cs320.PHARM.api;

import com.cs320.PHARM.model.UserAccount;
import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserAccountAPITest {
    @Autowired
    UserAccountAPI userAccountAPI;
    UserAccount temp;
    @BeforeEach
    @AfterEach
    void removeAll(){
        userAccountAPI.removeAll();
    }

    @Test
    void insertUserAccount() {

        temp=new UserAccount();
        temp.setUsername("admin");
        temp.setPassword("admin");
        temp.setId(1);
        temp.setType(1);

        userAccountAPI.insertUserAccount("admin","admin",1,1);
        UserAccount test=userAccountAPI.findUserAccountByName("admin");
        assertEquals(test.getId(),temp.getId());
        assertEquals(test.getUsername(),temp.getUsername());
        assertEquals(test.getPassword(),temp.getPassword());
        assertEquals(test.getType(),temp.getType());


    }

    @Test
    void findUserAccountByName() {

        temp=new UserAccount();
        temp.setUsername("admin");
        temp.setPassword("admin");
        temp.setId(1);
        temp.setType(1);

        userAccountAPI.insertUserAccount("admin","admin",1,1);
        assertEquals(temp.getId()      ,userAccountAPI.findUserAccountByName(temp.getUsername()).getId());
        assertEquals(temp.getUsername(),userAccountAPI.findUserAccountByName(temp.getUsername()).getUsername());
        assertEquals(temp.getPassword(),userAccountAPI.findUserAccountByName(temp.getUsername()).getPassword());
        assertEquals(temp.getType()    ,userAccountAPI.findUserAccountByName(temp.getUsername()).getType());
    }

    @Test
    void updatePassword() {

        temp=new UserAccount();
        temp.setUsername("admin");
        temp.setPassword("admin");
        temp.setId(1);
        temp.setType(1);

        userAccountAPI.insertUserAccount("admin","admin",1,1);
        assertEquals(temp.getPassword(),userAccountAPI.findUserAccountByName(temp.getUsername()).getPassword());

        temp.setPassword("abc");
        userAccountAPI.updatePassword(temp.getUsername(),temp.getPassword());
        assertEquals(temp.getPassword(),userAccountAPI.findUserAccountByName(temp.getUsername()).getPassword());
    }


    @Test
    void deleteUserAccount() {
        temp=new UserAccount();
        temp.setUsername("admin");
        temp.setPassword("admin");
        temp.setId(1);
        temp.setType(1);

        userAccountAPI.insertUserAccount("admin","admin",1,1);
        UserAccount test=userAccountAPI.findUserAccountByName("admin");
        assertEquals(test.getId(),temp.getId());
        assertEquals(test.getUsername(),temp.getUsername());
        assertEquals(test.getPassword(),temp.getPassword());
        assertEquals(test.getType(),temp.getType());

        userAccountAPI.deleteUserAccount(temp.getUsername());

        UserAccount empty=userAccountAPI.findUserAccountByName(temp.getUsername());
        assertNotEquals(userAccountAPI.findUserAccountByName(temp.getUsername()).getId(),temp.getId());

    }


}