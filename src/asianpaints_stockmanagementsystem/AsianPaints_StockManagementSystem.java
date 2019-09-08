
package asianpaints_stockmanagementsystem;
import com.asianpaint.login.DbConnection;
//Main Class
public class AsianPaints_StockManagementSystem {
    public static void main(String[] args) {
        
        //check the database connection
        DbConnection checkConnection = new DbConnection();
        checkConnection.dbconnect();
    }
    
}
