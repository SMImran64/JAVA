/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pos.util.DatabaseUtil;

/**
 *
 * @author USER
 */
public class ReportDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public void purchaseReportByDate(Date from, Date to, JTable jt) {

        String[] ColumnName = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};

        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
        jt.setModel(tableModel);

        sql = "select * from purchase where date between ? and ?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setDate(1, from);
            ps.setDate(2, to);
            rs = ps.executeQuery();

            while (rs.next()) {

                String productName = rs.getString("productName");
                String category = rs.getString("category");
                String supplier = rs.getString("supplier");
                float unitPrice = rs.getFloat("unitPrice");
                float quantity = rs.getFloat("quantity");
                float totalPrice = rs.getFloat("totalPrice");
                Date date = rs.getDate("date");
                
                 Object[] rowData = {productName,unitPrice,quantity,totalPrice,category,supplier,date};

                tableModel.addRow(rowData);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
