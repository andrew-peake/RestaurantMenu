package com.company.restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

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
}
