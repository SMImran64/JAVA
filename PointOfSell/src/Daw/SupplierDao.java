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

public class SupplierDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;

    public void saveSupplier(String name, String address, String cell, String email, String contractPerson, JTable jt) {

        String sql = "insert into suppliers(name,address,cell,email,contractPerson)values(?,?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, cell);
            ps.setString(4, email);
            ps.setString(5, contractPerson);

            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Supplier Details Save Successfully");
            showAllSupplier(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Details do not Save Successfully");
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllSupplier(JTable jt) {

        String[] ColumnName = {"ID", "Name", "Address", "Cell", "Email", "ContractPerson"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        String sql = "select * from suppliers";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String contractPerson = rs.getString("contractPerson");

                // add row to table model
                Object[] rowData = {id, name, address, cell, email, contractPerson};

                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();

            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteSupplier(int id, JTable jt) {

        String sql = "delete from suppliers where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Supplier Details delete Successfully");
            showAllSupplier(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editSupplier(int id, String name, String email, String cell, String address, String contractPerson, JTable jt) {

        String sql = " update suppliers set name = ?,address = ?,cell = ?,email = ?,contractPerson = ? where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, cell);
            ps.setString(4, email);
            ps.setString(5, contractPerson);

            ps.setInt(6, id);

            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Supplier Details Updated Successfully");
            showAllSupplier(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//         
}
