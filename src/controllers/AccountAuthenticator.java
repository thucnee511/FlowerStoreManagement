/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class AccountAuthenticator {
    private Set<Account> accounts = new HashSet<>() ;
    public void init(String path){
        
    }
    
}

class Account{
    private String id ;
    private String role ;
    private String password ;
    private String pId ;

    public Account(String id, String role, String password, String pId) {
        this.id = id;
        this.role = role;
        this.password = password;
        this.pId = pId;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getpId() {
        return pId;
    }
}
