package Daw;

import entity.Category;
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

public class CategoryDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;

    public void saveCategory(String name, JTable jt) {

        String sql = "insert into category (name)  values (?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);

            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Details Save Successfully");
            showAllCategory(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category Details do not Save Successfully");
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllCategory(JTable jt) {

        String[] ColumnName = {"ID", "Name"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        String sql = "select * from category";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");

                // add row to table model
                Object[] rowData = {id, name,};

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

    public void deleteCategory(int id, JTable jt) {

        String sql = "delete from category where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Details delete Successfully");
            showAllCategory(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editCategory(int id, String name, JTable jt) {

        String sql = " update category set name = ? where id = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            ps.close();

            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Details Updated Successfully");
            showAllCategory(jt);

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaw.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void search(int id, JTable jt) {
        String sql = "select * from category where id=?";
        try {
            String[] ColumnName = {"ID", "Name"};

            DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
            jt.setModel(tableModel);
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id1 = rs.getInt("id");
                String name = rs.getString("name");

                // add row to table model
                Object[] rowData = {id1, name};

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

    public List<Category> getAllCategory() {

        List<Category> categoryList = new ArrayList<>();

        String sql = "select * from category";

        try {
            ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");

                String name = rs.getString("name");

                categoryList.add(new Category(id, name));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categoryList;
    }

}
