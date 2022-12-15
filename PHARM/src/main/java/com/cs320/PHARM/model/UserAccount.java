package com.cs320.PHARM.model;

public class UserAccount {
    private String Username;
    private String password;
    private int type;
    private int id;

    public UserAccount id(int id){
        this.id=id;
        return this;
    }
    public UserAccount UserName(String username){
        this.Username=username;
        return this;
    }
    public UserAccount Password(String password){
        this.password=password;
        return this;
    }
    public UserAccount Type(int type){
        this.type=type;
        return  this;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
