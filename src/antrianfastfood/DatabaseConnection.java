package antrianfastfood;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static Connection antrianfastfood;
    public static Connection GetConnection ()throws SQLException{
        
        if (antrianfastfood == null){
            new Driver();
            antrianfastfood = DriverManager.getConnection("jdbc:mysql://localhost:3306/AntrianFastFood","root","");
        }
        return antrianfastfood;
    }
}

