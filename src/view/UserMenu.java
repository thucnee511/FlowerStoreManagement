/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Administrator
 */
public class UserMenu extends Menu{
    public UserMenu(){
        super("USER MENU");
        this.addOption("Update profile");
        this.addOption("View flower list");
        this.addOption("Add flower to cart");
        this.addOption("View order");
        this.addOption("Cancle order");
        this.addOption("Quit");
    }
}
