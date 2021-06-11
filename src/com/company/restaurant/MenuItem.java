package com.company.restaurant;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem (double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getNewItem() {
        return newItem;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setNewItem(boolean aNewItem) {
        this.newItem = aNewItem;
    }

    public String toString() {
        return "Category: " + this.category + " -- Description: " + this.description + " -- Price: " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return getDescription().equals(menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }
}
