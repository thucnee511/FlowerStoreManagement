/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change menu license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit menu template
 */
package controllers;

import view.Menu;

/**
 *
 * @author Administrator
 */
public class UserMenu {
    Menu menu = new Menu("USER MENU:");

    public UserMenu() {
        menu.addOption("Update profile");
        menu.addOption("View flower list");
        menu.addOption("Add flower to cart");
        menu.addOption("View order");
        menu.addOption("Cancle order");
        menu.addOption("Quit");
    }
    
}
