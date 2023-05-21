/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Administrator
 */
public class DevMenu extends Menu{
    public DevMenu(){
        super("DEV MENU");
        this.addOption("Update profile");
        this.addOption("View flower list");
        this.addOption("Add flower ");
        this.addOption("Modify flower");
        this.addOption("Remove flower");
        this.addOption("View sorted order");
        this.addOption("Delete order");
        this.addOption("Quit");
    }
}
