
package sqltest2;

import databaseSelf.util.SelfUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SqlTest2 {

    
    public static void main(String[] args) {
        
        SelfUtil  su = new SelfUtil();
        
        String sql = "insert into javaround64(id, name, subject, email, address)values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = su.getCon().prepareStatement(sql);
            
            ps.setString(1, "2");
            ps.setString(2, "Atik");
            ps.setString(3, "jee");
            ps.setString(4, "aatik@gmail.com");
            ps.setString(5, "Muhammadpur");
            
            ps.executeUpdate();
            
            ps.close();            
            su.getCon().close();
            System.out.println("Done");
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql1 = "select * from javaround64";
        try {
            PreparedStatement ps = su.getCon().prepareStatement(sql1);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                String id = rs.getString("id");
                String name = rs.getString("name");
                String subject = rs.getString("subject");
                String email = rs.getString("email");
                String address = rs.getString("address");
                
                System.out.println("id: "+id+"name: "+name+"Subject: "+subject+"email: "+email+"Address: "+address);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
