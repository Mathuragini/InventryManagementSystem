package com.asianpaint.stocks;

/**
 *
 * @author Mathuragini
 */
public class Item {
    
    private int itemId;
    private int productId;
    private String itemName;
    private int priceRange;
    private String finish;
    private int washability;
    private String coverage;
    private String shadeRange;
    private String warranty;

    public Item(int itemId, int productId, String itemName, int priceRange, String finish, int washability, String coverage, String shadeRange, String warranty) {
        this.itemId = itemId;
        this.productId = productId;
        this.itemName = itemName;
        this.priceRange = priceRange;
        this.finish = finish;
        this.washability = washability;
        this.coverage = coverage;
        this.shadeRange = shadeRange;
        this.warranty = warranty;
    }

    public int getItemId() {
        return itemId;
    }

    public int getProductId() {
        return productId;
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

    public String getCoverage() {
        return coverage;
    }

    public String getShadeRange() {
        return shadeRange;
    }

    public String getWarranty() {
        return warranty;
    }
    
    
}
