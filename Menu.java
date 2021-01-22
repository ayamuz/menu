package org.launchcode.java.MenuFood;


import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //class variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;
    //constructor

    public Menu(){
        this.lastUpdated = new Date();
    }

    //methods

    public ArrayList getMenuItems() { return menuItems;}

    public void setMenuItems(ArrayList menuItems){ this.menuItems = menuItems;}

    public Date getIsUpdated() { return lastUpdated; }

    public void setIsUpdated(Date isUpdated) { this.lastUpdated = lastUpdated; }

}