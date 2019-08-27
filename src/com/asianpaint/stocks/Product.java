/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asianpaint.stocks;

/**
 *
 * @author Mathuragini
 */
public class Product {
    
    //Varaiables
    private int productId;
    private String name;
    private String description;
    private String applyTo;

    //Generate parameterized constructor
    public Product(int productId, String name, String description,String applyTo) {
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
