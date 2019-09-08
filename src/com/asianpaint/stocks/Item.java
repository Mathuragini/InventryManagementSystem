package com.asianpaint.stocks;

public class Item {

    private int itemId;
    private String productName;
    private String itemName;
    private int priceRange;
    private String finish;
    private int washability;
    private String shadeRange;
    private String warranty;

    public Item(int itemId, String productName, String itemName, int priceRange, String finish, int washability, String shadeRange, String warranty) {
        this.itemId = itemId;
        this.productName = productName;
        this.itemName = itemName;
        this.priceRange = priceRange;
        this.finish = finish;
        this.washability = washability;
        this.shadeRange = shadeRange;
        this.warranty = warranty;
    }

    public int getItemId() {
        return itemId;
    }

    public String getProductName() {
        return productName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public String getFinish() {
        return finish;
    }

    public int getWashability() {
        return washability;
    }

    public String getShadeRange() {
        return shadeRange;
    }

    public String getWarranty() {
        return warranty;
    }

}
