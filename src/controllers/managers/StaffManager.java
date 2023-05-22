/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.managers;

import java.util.ArrayList;
import java.util.HashSet;
import models.Staff;
import tools.FileHandle;

/**
 *
 * @author Administrator
 */
public class StaffManager extends HashSet<Staff>{

    public StaffManager(String path) {
        ArrayList<String> dta = FileHandle.readFromFile(path);
        for (String line : dta) {
            String strSplit[] = line.trim().split(",");
            this.add(new Staff(strSplit[0],
                    strSplit[1],
                    strSplit[2],
                    strSplit[3]));
        }
    }
}
