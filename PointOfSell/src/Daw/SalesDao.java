/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

import entity.Category;
import entity.Sales;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pos.util.DatabaseUtil;

/**
 *
 * @author USER
 */
public class SalesDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;
    ResultSet rs;
    CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao = new StockDao();

    public void loadProduct(JComboBox<String> ComboProductList, String category) {

        ComboProductList.removeAllItems();

        List<Stock> stockList = stockDao.getProductByCategory(category);

        // List<Stock> stockList = stockDao.getProductByCategory(category);
        if (stockList.isEmpty()) {

            System.out.println("No Product found!!!");
            return;

        }

        for (Stock s : stockList) {

            ComboProductList.addItem(s.getProductName());

        }

    }

    public void loadCategory(JComboBox<String> ComboCategoryList) {

        ComboCategoryList.removeAllItems();

        List<Category> catList = categoryDao.getAllCategory();

        //Check if the suppliers list is empty
        if (catList.isEmpty()) {

            System.out.println("No Category found!!!");
            return;
        }

        for (Category cat : catList) {

            ComboCategoryList.addItem(cat.getName());

        }

    }
    
    
    public void saveSales(Sales s){
    
        sql ="insert into sales(category,productName,customerName,unitPrice,quantity,totalPrice,discountRate,actualPrice,date)values(?,?,?,?,?,?,?,?,now())";
        
        try {
            ps = util.getCon().prepareStatement(sql);
            
            ps.setString(1, s.getCategory());
            ps.setString(2, s.getProductName());
            ps.setString(3, s.getCutomerName());
            ps.setFloat(4, s.getQuantity());
            ps.setFloat(5, s.getUnitPrice());
            ps.setFloat(6, s.getTotalPrice());
            ps.setFloat(7, s.getDiscountRate());
            ps.setFloat(8, s.getActualPrice());
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
                        JOptionPane.showMessageDialog(null, "Sales Save Successfully");

        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Sales didn't Save");

            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
