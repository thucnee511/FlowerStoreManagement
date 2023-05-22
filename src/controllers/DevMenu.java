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
public class DevMenu {
    Menu menu = new Menu("DEV MENU:");

    public DevMenu() {
        menu.addOption("Update profile");
        menu.addOption("View flower list");
        menu.addOption("Add flower ");
        menu.addOption("Modify flower");
        menu.addOption("Remove flower");
        menu.addOption("View sorted order");
        menu.addOption("Delete order");
        menu.addOption("Quit");
    }
    
    
}
