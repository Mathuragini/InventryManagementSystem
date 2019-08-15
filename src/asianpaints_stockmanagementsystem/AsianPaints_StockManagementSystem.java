/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asianpaints_stockmanagementsystem;

import com.asianpaint.login.DbConnection;

/**
 *
 * @author Mathuragini
 */
public class AsianPaints_StockManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DbConnection checkConnection = new DbConnection();
        checkConnection.dbconnect();
    }
    
}
