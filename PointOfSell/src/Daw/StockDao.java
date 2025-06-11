package Daw;

import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.util.DatabaseUtil;

public class StockDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;

    ResultSet rs;

    public List<Stock> getProductByCategory(String category) {

        List<Stock> stockList = new ArrayList<>();
        sql = "select * from stock where category = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, category);

            rs = ps.executeQuery();

            while (rs.next()) {

                Stock s = new Stock(rs.getInt("id"),
                        rs.getString("productName"),
                        rs.getFloat("quantity"),
                        rs.getString("category"));

                stockList.add(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return stockList;
    }

    public void saveStock(String productName, float quantity, String category) {

        sql = "insert into stock (productName,quantity,category)"
                + "values(?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, productName);
            ps.setFloat(2, quantity);
            ps.setString(3, category);

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Stock Stored Successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Stock didn't Store");

            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateStockQuantityByProductName(String productName, float quantity) {

        sql = "update stock set quantity = quantity + ? where productName = ?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setFloat(1, quantity);
            ps.setString(2, productName);

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            //JOptionPane.showMessageDialog(null, "Purchase Details Save Successfully");
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Purchase doesn't Save");

            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getAllStock(JTable jt) {

        String[] ColumnName = {"ID", "Product Name", "Quantity", "Category"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        String sql = "select * from stock order by productName";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String productName = rs.getString("productName");
                float quantity = rs.getFloat("quantity");
                String category = rs.getString("category");

                // add row to table model
                Object[] rowData = {id, productName, quantity, category};

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

    public float getStockQuantityByProductName(String productName) {

        sql = "select quantity from stock where productName = ?";
        float quantity = 0;
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, productName);

            rs = ps.executeQuery();

            while (rs.next()) {

                quantity = rs.getFloat("quantity");

            }

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantity;
    }
}
