/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asianpaint.stocks;

import java.sql.Date;

/**
 *
 * @author Mathuragini
 */
public class Stock {
    private int stockId;
    private String type;
    private int itemId;
    private int Qty;
    private Date updatedDate;

    public Stock(int stockId, String type, int itemId, int Qty, Date updatedDate) {
        this.stockId = stockId;
        this.type = type;
        this.itemId = itemId;
        this.Qty = Qty;
        this.updatedDate = updatedDate;
    }

    public int getStockId() {
        return stockId;
    }

    public String getType() {
        return type;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQty() {
        return Qty;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }
    
    
    
}
