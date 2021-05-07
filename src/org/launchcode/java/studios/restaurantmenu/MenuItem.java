package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private Date dateAdded = new Date();

  public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
  }

    public Date getDateAdded() {
        return dateAdded;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }

    public Date setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
        return dateAdded;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
