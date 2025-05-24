
package Daw;

import entity.Category;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JComboBox;
import pos.util.DatabaseUtil;


public class PurchaseDao {
    
    DatabaseUtil util = new DatabaseUtil();
    
    PreparedStatement ps;
    String sql;
    
    CategoryDao categoryDao = new  CategoryDao();
    
    public void loadCategory(JComboBox<String>categoryList){
    
       categoryList.removeAllItems();
       
        List<Category> catList = categoryDao.getAllCategory();
        
    }
    
}
