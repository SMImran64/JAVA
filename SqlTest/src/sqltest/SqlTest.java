package sqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlTest {
    
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "1234");
            PreparedStatement ps = connection.prepareStatement("Select * from students ");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                System.out.println(rs.getInt("id")+ " " + rs.getString("name" )+ " " + rs.getString("email"));
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SqlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
