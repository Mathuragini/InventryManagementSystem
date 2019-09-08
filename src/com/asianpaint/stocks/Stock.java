package com.asianpaint.stocks;

import java.sql.Date;

public class Stock {

    private int stockId;
    private String type;
    private String itemName;
    private int Qty;
    private Date updatedDate;

    public Stock(int stockId, String type, String itemName, int Qty, Date updatedDate) {
        this.stockId = stockId;
        this.type = type;
        this.itemName = itemName;
        this.Qty = Qty;
        this.updatedDate = updatedDate;
    }

    public int getStockId() {
        return stockId;
    }

    public String getType() {
        return type;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQty() {
        return Qty;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    

}
