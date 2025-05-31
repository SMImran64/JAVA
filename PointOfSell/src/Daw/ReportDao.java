/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import static com.itextpdf.text.PageSize.A4;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entity.Product;
import entity.Purchase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

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

//    public void purchaseReportByDate(Date from, Date to, JTable jt) {
//
//        String[] ColumnName = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};
//
//        DefaultTableModel tableModel = new DefaultTableModel(ColumnName, 0);
//        jt.setModel(tableModel);
//
//        sql = "select * from purchase where date between ? and ?";
//
//        try {
//            ps = util.getCon().prepareStatement(sql);
//            ps.setDate(1, from);
//            ps.setDate(2, to);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                String productName = rs.getString("productName");
//                String category = rs.getString("category");
//                String supplier = rs.getString("supplier");
//                float unitPrice = rs.getFloat("unitPrice");
//                float quantity = rs.getFloat("quantity");
//                float totalPrice = rs.getFloat("totalPrice");
//                Date date = rs.getDate("date");
//
//                Object[] rowData = {productName, unitPrice, quantity, totalPrice, category, supplier, date};
//
//                tableModel.addRow(rowData);
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    // for Report to make pdf

    public List<Purchase> purchaseReportByDate2(Date from, Date to, JTable jt) {

        List<Purchase> purchaseList = new ArrayList<>();

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

                Purchase p = new Purchase(rs.getString("productName"),
                        rs.getFloat("unitPrice"),
                        rs.getFloat("quantity"),
                        rs.getFloat("totalPrice"),
                        rs.getDate("date"),
                        rs.getString("category"),
                        rs.getString("supplier"));

                purchaseList.add(p);

                Object[] rowData = {p.getProductName(), p.getUnitPrice(), p.getQuantity(), p.getTotalPrice(), p.getDate(), p.getCategory(), p.getSupplier()};

                tableModel.addRow(rowData);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchaseList;
    }

    public void generatePDFReoportForPurchase(Date from, Date to, JTable jt) {

        List<Purchase> purchases = purchaseReportByDate2(from, to, jt);

        // create a pdf
        
        //Add date and local time date  and multiple pdf generate
        
        long mil = System.currentTimeMillis();
        LocalDate currentDate = LocalDate.now();
        
        try {
            com.itextpdf.text.Document document = new com.itextpdf.text.Document(A4);

            String filePath = "Purchase_Report"+mil+".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            document.open();

            // Add title to the document
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Paragraph title = new Paragraph("Purchase Roport", titleFont);
            title.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(title);
            // Add subtitle
            
            Font subTitleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
            Paragraph subTitle = new Paragraph("Purchase Roport: "+currentDate, subTitleFont);
            subTitle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(subTitle);

            // Add line brack
            document.add(new Paragraph("\n"));

            //Add table headers
            PdfPTable table = new PdfPTable(7);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            // set table column widths
            float[] columnWidths = {2.5f, 2f, 2f, 2.5f, 2f, 2f, 2f};
            table.setWidths(columnWidths);

            String[] headers = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);

            for (String header : headers) {

                PdfPCell headerCell = new PdfPCell(new Phrase(header, headerFont));
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setBackgroundColor(BaseColor.BLACK.LIGHT_GRAY);
                table.addCell(headerCell);

            }

            Font dataFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);

            for (Purchase p : purchases) {

                table.addCell(new PdfPCell(new Phrase(p.getProductName(),dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getUnitPrice()),dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getQuantity()),dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotalPrice()),dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getCategory(),dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getSupplier(),dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getDate().toString(),dataFont)));

            }
            // Add table to the document

            document.add(table);

            document.close();
            JOptionPane.showMessageDialog(null, "Purchase Report Generated");

        } catch (FileNotFoundException ex) {
            
                        JOptionPane.showMessageDialog(null, "Purchase Report couldn't Generated ");

            
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
