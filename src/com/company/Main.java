package com.company;

import com.company.restaurant.MenuItem;
import com.company.restaurant.Menu;

public class Main {

    public static void main(String[] args) {

        MenuItem soggySammy = new MenuItem(4.20, "Soggy Sandwich", "Main Course", false);
        MenuItem badSalad = new MenuItem(2.75, "Shrimp and Strawberry Salad", "Appetizer", true);
        MenuItem strangeOyster = new MenuItem(3.56, "Oysters in Red Gravy", "Appetizer", false);
        MenuItem oldPie = new MenuItem(3.14, "Apple-like Pie", "Dessert", false);
        MenuItem newPie = new MenuItem(6.28, "Pie-like Apple", "Dessert", true);
        MenuItem salmonella = new MenuItem(43.11, "Chicken Sushi", "Main Course", true);
        MenuItem specialOrder = new MenuItem(999.99, "Non-Deadly Meal", "Main Course", true);

        Menu currentMenu = new Menu();

        currentMenu.addMenuItem(badSalad);
        currentMenu.addMenuItem(strangeOyster);
        currentMenu.addMenuItem(soggySammy);
        currentMenu.addMenuItem(salmonella);
        currentMenu.addMenuItem(soggySammy);
        currentMenu.addMenuItem(oldPie);
        currentMenu.addMenuItem(newPie);

        currentMenu.printFullMenu();

        currentMenu.printItem(specialOrder);

        currentMenu.removeMenuItem(oldPie);
        currentMenu.addMenuItem(specialOrder);

        currentMenu.printFullMenu();
        currentMenu.isNewItem(salmonella);
        currentMenu.isNewItem(oldPie);

        currentMenu.lastUpdate();

    }
}
