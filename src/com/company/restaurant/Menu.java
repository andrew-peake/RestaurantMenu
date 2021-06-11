package com.company.restaurant;

import java.util.ArrayList;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Menu {
    private ArrayList<MenuItem> currentMenuItem;

    File file1 = new File("src/com/company/restaurant/Menu.java");
    long time1 = file1.lastModified();
    DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

    public Menu (){
        this.currentMenuItem = new ArrayList<MenuItem>();
    }


    public void addMenuItem(MenuItem newItem) {
    if(!currentMenuItem.contains(newItem)) {
        currentMenuItem.add(newItem);
    } else {
        System.out.println("Error: Duplicate of existing menu item.");
    }
    }

    public void removeMenuItem(MenuItem oldItem) {
        this.currentMenuItem.remove(oldItem);
    }

    public void isNewItem(MenuItem currentItem) {
        if (currentItem.getNewItem()) {
            System.out.println("Yup, the " + currentItem.getDescription() + " is new.");
        } else {
            System.out.println("Yikes... looks like the " + currentItem.getDescription() + " is old as heck!");
        }
    }

    public void printFullMenu() {
        System.out.println("Fake Restaurant's Fresh New Menu!");
        for(MenuItem item : currentMenuItem) {
            System.out.println(item);
        }
    }

    public void printItem(MenuItem item) {
        System.out.println("Details on selected menu item: " + item);
    }

    public void lastUpdate() {
        System.out.println("Menu was last updated on: " + sdf.format(time1));
    }




}
