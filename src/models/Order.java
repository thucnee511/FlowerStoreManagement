/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Order {
    private String id ;
    private Date date ;
    private double total ;
    private HashMap<String,Integer> oList = new HashMap<>() ;

    public Order(String id, Date date) {
        this.id = id;
        this.date = date;
        this.total = 0 ;
    }   
    
    public void addFlower(String flowerId , int quantity , Set<Flower> fList){
        for(Flower f : fList){
            if (f.getId().equals(flowerId)){
                total += f.getPrice() * quantity ;
                break ;
            }
        }
        if (oList.containsKey(flowerId)){
            Integer quan = oList.get(flowerId) ;
            oList.remove(flowerId);
            quantity += quan ;
        }
        oList.put(flowerId , quantity) ;
    }
    
    
}
