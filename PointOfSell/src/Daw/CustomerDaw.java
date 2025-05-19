
package Daw;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.util.DatabaseUtil;


public class CustomerDaw {
    
     DatabaseUtil util = new DatabaseUtil();
     
     PreparedStatement ps;
     
     public void saveCustomer(String name, String email, String cell, String address){
     
     String sql ="insert into customer(name,cell,email,address)values(?,?,?,?)";
     
         try {
             ps = util.getCon().prepareStatement(sql);
             
             ps.setString(1, name);
             ps.setString(2, cell);
             ps.setString(3, email);
             ps.setString(4, address);
             
             ps.executeUpdate();
             
             ps.close();
             
             util.getCon().close();
             
             JOptionPane.showMessageDialog(null, "Customer Details Save Successfully");
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Customer Details do not Save Successfully");
             Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }
    
}
