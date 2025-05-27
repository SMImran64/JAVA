package Daw;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JComboBox;
import pos.util.DatabaseUtil;

public class PurchaseDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;

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
        
        for(Stock s : stockList){
        
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

}
