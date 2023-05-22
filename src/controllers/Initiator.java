/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import models.*;
import tools.FileHandle;
import tools.InputHandle;

/**
 *
 * @author Administrator
 */
public class Initiator {

    public static Set<Flower> initFlower(String path) {
        Set<Flower> ret = new HashSet<>();
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            ret.add(new Flower(strSplit[0],
                    strSplit[1],
                    Double.parseDouble(strSplit[2]),
                    InputHandle.toDate(strSplit[3], "yyyy/MM/dd")));
        }
        return ret;
    }
    
    public static Set<Customer> initCustomer(String path) {
        Set<Customer> ret = new HashSet<>();
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            ret.add(new Customer(strSplit[0],
                    strSplit[1],
                    strSplit[2],
                    strSplit[3]));
        }
        return ret;
    }
    
    public static Set<Staff> initStaff(String path) {
        Set<Staff> ret = new HashSet<>();
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            ret.add(new Staff(strSplit[0],
                    strSplit[1],
                    strSplit[2],
                    strSplit[3]));
        }
        return ret;
    }
    
    public static Set<Account> initAccount(String path) {
        Set<Account> ret = new HashSet<>();
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            ret.add(new Account(strSplit[0],
                    strSplit[1],
                    strSplit[2],
                    strSplit[3]));
        }
        return ret;
    }
    
    public static Set<Order> initOrder(String path) {
        Set<Order> ret = new HashSet<>();
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            Order o = new Order(strSplit[0] , InputHandle.toDate(strSplit[1], "yyyy/MM/dd") , strSplit[3]) ;
            int count = 0 ;
            for(String str : strSplit){
                if (count >= 4){
                    String f[] = str.split(":") ;
                    o.addFlower(, count);
                }   
                count++ ;
            }
            ret.add(o) ;
        }
        return ret;
    }
}
