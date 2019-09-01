
package asianpaints_stockmanagementsystem;

import com.asianpaint.login.DbConnection;

/**
 *
 * @author Mathuragini
 */
public class AsianPaints_StockManagementSystem {
    public static void main(String[] args) {
        DbConnection checkConnection = new DbConnection();
        checkConnection.dbconnect();
    }
    
}
