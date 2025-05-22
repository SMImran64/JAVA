package Daw;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.util.DatabaseUtil;

public class CustomerDaw {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;

    public void saveCustomer(String name, String email, String cell, String address, JTable jt) {

        String sql = "insert into customers(name,cell,email,address)values(?,?,?,?)";

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
            showAllCustomer(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Details do not Save Successfully");
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllCustomer(JTable jt) {

        String[] ColumnName = {"ID", "Name", "Email", "Cell", "Address"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        String sql = "select * from customers";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");

                // add row to table model
                Object[] rowData = {id, name, email, cell, address};

                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();

            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteCustomer(int id, JTable jt) {

        String sql = "delete from customers where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Details delete Successfully");
            showAllCustomer(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editCustomer(int id, String name, String email, String cell, String address, JTable jt) {

        String sql = " update customers set name = ?,cell = ?,email = ?, address = ? where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
            showAllCustomer(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public void search(int id, JTable jt) {
        String sql = "select * from customers where id=?";
        try {
            String[] ColumnName = {"ID", "Name", "Email", "Cell", "Address"};

            DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
            jt.setModel(tableModel);
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");

                // add row to table model
                Object[] rowData = {id1, name, email, cell, address};

                tableModel.addRow(rowData);
            }            
           
            rs.close();
            ps.close();

            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
