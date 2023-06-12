package uk.axone.devintest.endofmoduleassignment.model;

import java.util.Objects;

public class Item {
    private int itemCode;
    private String itemName;
    private String itemDescription;
    private double price;

    public Item(int itemCode, String itemName, String itemDescription,double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    public int getItemCode() { return itemCode; }

    public void setItemCode(int itemCode) { this.itemCode = itemCode; }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemCode == item.itemCode &&
                Double.compare(item.price, price) == 0 &&
                itemName.equals(item.itemName) &&
                itemDescription.equals(item.itemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCode, itemName, itemDescription, price);
    }
}
