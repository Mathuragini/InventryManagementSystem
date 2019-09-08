
package com.asianpaint.stocks;

public class Product {

    //Varaiables
    private int productId;
    private String name;
    private String description;
    private String applyTo;

    //Generate parameterized constructor
    public Product(int productId, String name, String description, String applyTo) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.applyTo = applyTo;
    }

    //Generate getters for the variables
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getApplyTo() {
        return applyTo;
    }

}
