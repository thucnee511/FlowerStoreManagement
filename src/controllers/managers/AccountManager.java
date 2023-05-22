/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.managers;

import java.util.ArrayList;
import java.util.HashSet;
import models.Account;
import tools.FileHandle;

/**
 *
 * @author Administrator
 */
public class AccountManager extends HashSet<Account>{

    public AccountManager(String path) {
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String lineSplit[] = line.trim().split(",");
            this.add(new Account(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3]));
        }
    }
    
    public int authenticate(String id , String pass){
        for(Account account : this){
            String _id = account.getId() ;
                String  _pass = account.getPassword() ;
                if (id.equals(_id) && pass.equals(_pass)){
                    return account.getRole().equals("DEV") ? 1 : 0 ;
                }
        }
        return -1;
    }
}
