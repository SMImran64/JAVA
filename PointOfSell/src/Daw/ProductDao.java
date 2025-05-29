/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.util.DatabaseUtil;

/**
 *
 * @author USER
 */
public class ProductDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;
    ResultSet rs;

    StockDao stockDao = new StockDao();

    CategoryDao categoryDao = new CategoryDao();

    public void loadCategoryToProductCombo(JComboBox<String> catList) {

        catList.removeAllItems();
        List<Category> categories = new ArrayList<>();

        categories = categoryDao.getAllCategory();

        for (Category c : categories) {

            catList.addItem(c.getName());

        }

    }

    public void saveProduct(String category, String productName) {

        sql = "insert into product (category, productName) values(?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, category);
            ps.setString(2, productName);

            ps.executeUpdate();
            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Product Added Successfully");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Product didn't Added");

            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void showAllProduct(JTable jt) {

        String[] ColumnName = {"ID", "Product Name","Category"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        String sql = "select * from product";

        try {
            PreparedStatement ps = util.getCon().prepareStatement( sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String productName = rs.getString("productName");
                String category = rs.getString("category");

                // add row to table model
                Object[] rowData = {id, productName,category};

                tableModel.addRow(rowData);
            }

            ps.executeQuery();
            rs.close();
            ps.close();

            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
