/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pointofsell.View;

import Daw.CategoryDao;
import Daw.CustomerDaw;
import Daw.ProductDao;
import Daw.PurchaseDao;
import Daw.ReportDao;
import Daw.SalesDao;
import Daw.StockDao;
import Daw.SupplierDao;
import Daw.UserDao;
import entity.Sales;
import entity.Stock;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pos.util.DatabaseUtil;
import pos.util.DateConvert;

/**
 *
 * @author USER
 */
public class PosView extends javax.swing.JFrame {

    private String userRole;
    DatabaseUtil util = new DatabaseUtil();

    CustomerDaw customerDaw = new CustomerDaw();
    CategoryDao categoryDao = new CategoryDao();
    SupplierDao supplierDao = new SupplierDao();
    PurchaseDao purchaseDao = new PurchaseDao();
    StockDao stockDao = new StockDao();
    ProductDao productDao = new ProductDao();
    ReportDao reportDao = new ReportDao();
    DateConvert dateConvert = new DateConvert();
    SalesDao salesDao = new SalesDao();

    /**
     * Creates new form PosView
     */
    public PosView() {
        initComponents();
        productDao.showAllProduct(tblProduct);
        customerDaw.showAllCustomer(tblCustomer);
        categoryDao.showAllCategory(tblCategory);
        supplierDao.showAllSupplier(tblSupplier);
        purchaseDao.loadCategory(comboPurchaseCategory);
        customerDaw.showAllCustomerInSales(ComboSalesCustomerName);
        supplierDao.showAllSupplierToPurchaseComboBox(comboPurchaseSupplierName);
        productDao.loadCategoryToProductCombo(txtProductComboBox);

        salesDao.loadCategory(ComboSalesCategory);

        stockDao.getAllStock(tblStock);

        comboPurchaseCategory.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                String categoryName = comboPurchaseCategory.getSelectedItem().toString();

                purchaseDao.loadProduct(comboPurchaseProductName, categoryName);
                //  System.out.println(categoryName);
            }
        });
        ComboSalesCategory.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED && ComboSalesCategory.getSelectedItem() != null) {

                String categoryName = ComboSalesCategory.getSelectedItem().toString();

                salesDao.loadProduct(ComboSalesProductName, categoryName);

            }

        });

        ComboSalesProductName.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED && ComboSalesCategory.getSelectedItem() != null) {
                String productName = ComboSalesProductName.getSelectedItem().toString();

                float quantity = stockDao.getStockQuantityByProductName(productName);
                txtSalesStockQuantity.setText(String.valueOf(quantity));

            }

        });

//        comboPurchaseProductName.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        });
    }

    public void setUserName(String userRole) {
        this.userRole = userRole;

        if (userRole.equalsIgnoreCase("manager")) {

            btnPurchase.setVisible(false);

        } else if (userRole.equalsIgnoreCase("cashier")) {

            btnSupplier.setVisible(false);
            btnPurchase.setVisible(false);
            btnStock.setVisible(false);

        } else {

            this.setVisible(false);
            Login l = new Login();
            l.setVisible(true);

        }

    }

    //Reset product field
    public void resetProduct() {

        txtProductId.setText("");
        txtProductProductName.setText("");
        btnProductSave.setVisible(true);

    }

    // Reset customer text fields
    public void resetCustomer() {

        txtCustomerId.setText("");
        txtCustomerName.setText("");
        txtCustomerEmail.setText("");
        txtCustomerCell.setText("");
        txtCustomerAddress.setText("");
        btnCustomerSave.setVisible(true);

    }
    //Reset Category text file  

    public void resetCategory() {

        txtCategoryId1.setText("");
        txtCategoryName1.setText("");
        btnCategorySave.setVisible(true);

    }

    //Reset Supplier text file  
    public void resetSupplier() {

        txtSupplierId.setText("");
        txtSupplierName1.setText("");
        txtSupplierEmail.setText("");
        txtSupplierCell.setText("");
        txtSupplierAddress.setText("");
        txtSupplierContractPerson.setText("");
        btnSupplierSave.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnCustomer = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        tapMain = new javax.swing.JTabbedPane();
        tapHome = new javax.swing.JTabbedPane();
        tapCustomer = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCustomerCell = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        btnCustomerEdit = new javax.swing.JButton();
        btnCustomerSave = new javax.swing.JButton();
        btnCustomerReset = new javax.swing.JButton();
        btnCustomerDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnCustomerSearch = new javax.swing.JButton();
        tapSupplier = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        txtSupplierId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSupplierEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSupplierCell = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSupplierAddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSupplierContractPerson = new javax.swing.JTextField();
        txtSupplierName1 = new javax.swing.JTextField();
        btnSupplierSave = new javax.swing.JButton();
        btnSupplierEdit = new javax.swing.JButton();
        btnSupplierDelete = new javax.swing.JButton();
        btnSupplierReset = new javax.swing.JButton();
        btnSupplierSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        tapCategory = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtCategoryId = new javax.swing.JLabel();
        txtCategoryId1 = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JLabel();
        txtCategoryName1 = new javax.swing.JTextField();
        btnCategorySave = new javax.swing.JButton();
        btnCategoryEdit = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        btnCategoryReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        btnCategorySearch = new javax.swing.JButton();
        tapPurchase = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        comboPurchaseCategory = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        comboPurchaseProductName = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        comboPurchaseSupplierName = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtPurchaseUnitPrice = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPurchaseQuantity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPurchaseTotalPrice = new javax.swing.JTextField();
        btnPurchaseConfirm = new javax.swing.JButton();
        btnPurchaseReset = new javax.swing.JButton();
        tapSales = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtSalesStockQuantity = new javax.swing.JTextField();
        ComboSalesCategory = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        ComboSalesProductName = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ComboSalesCustomerName = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtSalesUnitPrice = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtSalesQuantity = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtSalesTotalPrice = new javax.swing.JTextField();
        btnSalesSave = new javax.swing.JButton();
        btnSalesReset = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtSalesDiscountRate = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtSalesActualPrice = new javax.swing.JTextField();
        tapStock = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        tapReport = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnReportPurchase = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        JdateReportFrom = new com.toedter.calendar.JDateChooser();
        JdateReportTo = new com.toedter.calendar.JDateChooser();
        tapProduct = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtProductComboBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtProductProductName = new javax.swing.JTextField();
        btnProductSave = new javax.swing.JButton();
        btnProductReset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 872, -1, 100));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, -1));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Point Of Sell");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 90));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        btnCustomer.setBackground(new java.awt.Color(51, 0, 204));
        btnCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("Customer");
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
        });
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(51, 0, 204));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnCategory.setBackground(new java.awt.Color(51, 0, 204));
        btnCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnCategory.setText("Category");
        btnCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryMouseClicked(evt);
            }
        });

        btnSupplier.setBackground(new java.awt.Color(51, 0, 204));
        btnSupplier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setText("Supplier");
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnStock.setBackground(new java.awt.Color(51, 0, 204));
        btnStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStock.setForeground(new java.awt.Color(255, 255, 255));
        btnStock.setText("Stock");
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(51, 0, 204));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });

        btnSales.setBackground(new java.awt.Color(51, 0, 204));
        btnSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSales.setForeground(new java.awt.Color(255, 255, 255));
        btnSales.setText("Sales");
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesMouseClicked(evt);
            }
        });

        btnPurchase.setBackground(new java.awt.Color(51, 0, 204));
        btnPurchase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(255, 255, 255));
        btnPurchase.setText("Purchase");
        btnPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseClicked(evt);
            }
        });
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnProduct.setBackground(new java.awt.Color(51, 0, 204));
        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnProduct.setText("Product");
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnPurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnSales, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(812, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 880));

        tapMain.setEnabled(false);
        tapMain.addTab("tab1", tapHome);

        jPanel15.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customers");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setText("Id No. ");

        jLabel11.setText("Name");

        jLabel12.setText("Address");

        jLabel13.setText("Cell Number");

        jLabel14.setText("Email Address");

        btnCustomerEdit.setBackground(new java.awt.Color(255, 255, 0));
        btnCustomerEdit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCustomerEdit.setText("Edit");
        btnCustomerEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerEditMouseClicked(evt);
            }
        });

        btnCustomerSave.setBackground(new java.awt.Color(0, 153, 51));
        btnCustomerSave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCustomerSave.setText("Save");
        btnCustomerSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSaveMouseClicked(evt);
            }
        });

        btnCustomerReset.setBackground(new java.awt.Color(255, 153, 0));
        btnCustomerReset.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCustomerReset.setText("Reset");
        btnCustomerReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerResetMouseClicked(evt);
            }
        });

        btnCustomerDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnCustomerDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCustomerDelete.setText("Delete");
        btnCustomerDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerDeleteMouseClicked(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnCustomerSearch.setText("Search");
        btnCustomerSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnCustomerSave)
                .addGap(157, 157, 157)
                .addComponent(btnCustomerEdit)
                .addGap(182, 182, 182)
                .addComponent(btnCustomerDelete)
                .addGap(161, 161, 161)
                .addComponent(btnCustomerReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerId)))
                        .addGap(43, 43, 43)
                        .addComponent(btnCustomerSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerCell, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerEmail)))))
                .addGap(71, 71, 71))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerCell, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tapCustomer.addTab("tab1", jPanel8);

        tapMain.addTab("tab2", tapCustomer);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Suppliers");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));

        b.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b.setText("Id No. :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Name :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Cell      : ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Address    :");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("ContractPerson");

        btnSupplierSave.setBackground(new java.awt.Color(51, 153, 0));
        btnSupplierSave.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSupplierSave.setText("Save");
        btnSupplierSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierSaveMouseClicked(evt);
            }
        });

        btnSupplierEdit.setBackground(new java.awt.Color(255, 255, 0));
        btnSupplierEdit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSupplierEdit.setText("Edit");
        btnSupplierEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierEditMouseClicked(evt);
            }
        });

        btnSupplierDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnSupplierDelete.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSupplierDelete.setText("Delete");
        btnSupplierDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierDeleteMouseClicked(evt);
            }
        });

        btnSupplierReset.setBackground(new java.awt.Color(0, 153, 255));
        btnSupplierReset.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSupplierReset.setText("Reset");
        btnSupplierReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierResetMouseClicked(evt);
            }
        });

        btnSupplierSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSupplierSearch.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSupplierSearch.setText("Search");

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSupplier);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(btnSupplierSave)
                                        .addGap(85, 85, 85)
                                        .addComponent(btnSupplierEdit))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(txtSupplierCell)
                                        .addGap(39, 39, 39)))))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupplierDelete)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSupplierName1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtSupplierAddress))
                                .addGap(57, 57, 57)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(253, 253, 253)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                        .addComponent(btnSupplierReset)
                                        .addGap(85, 85, 85)))
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSupplierSearch)
                                    .addComponent(txtSupplierContractPerson))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSupplierCell, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSupplierContractPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSupplierDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupplierSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupplierEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupplierReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupplierSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1170, 830));

        tapSupplier.addTab("tab1", jPanel9);

        tapMain.addTab("tab3", tapSupplier);

        jPanel10.setPreferredSize(new java.awt.Dimension(1333, 700));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(0, 51, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Category");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jPanel21.setBackground(new java.awt.Color(153, 255, 153));

        txtCategoryId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCategoryId.setText("Id No");

        txtCategoryName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCategoryName.setText("Name");

        btnCategorySave.setBackground(new java.awt.Color(51, 0, 204));
        btnCategorySave.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCategorySave.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorySave.setText("Save");
        btnCategorySave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategorySaveMouseClicked(evt);
            }
        });

        btnCategoryEdit.setBackground(new java.awt.Color(255, 255, 0));
        btnCategoryEdit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCategoryEdit.setText("Edit");
        btnCategoryEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryEditMouseClicked(evt);
            }
        });

        btnCategoryDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnCategoryDelete.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCategoryDelete.setText("Delete");
        btnCategoryDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryDeleteMouseClicked(evt);
            }
        });

        btnCategoryReset.setBackground(new java.awt.Color(255, 153, 51));
        btnCategoryReset.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCategoryReset.setText("Reset");
        btnCategoryReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryResetMouseClicked(evt);
            }
        });

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCategory);

        btnCategorySearch.setBackground(new java.awt.Color(102, 102, 255));
        btnCategorySearch.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCategorySearch.setText("Search");
        btnCategorySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategorySearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCategoryId1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCategoryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnCategoryDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCategoryReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCategoryId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCategoryId1)
                                .addComponent(txtCategoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        jPanel10.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 820));

        tapCategory.addTab("tab1", jPanel10);

        tapMain.addTab("tab4", tapCategory);

        tapPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tapPurchaseMouseClicked(evt);
            }
        });

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Purchase");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jPanel23.setBackground(new java.awt.Color(153, 153, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Category :");

        comboPurchaseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setText("Product Name :");

        comboPurchaseProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setText("Supplier Name :");

        comboPurchaseSupplierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setText("Unit Price : ");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setText("Quantity  :");

        txtPurchaseQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPurchaseQuantityFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setText("Total Price :");

        btnPurchaseConfirm.setText("Confirm");
        btnPurchaseConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseConfirmMouseClicked(evt);
            }
        });

        btnPurchaseReset.setText("Reset");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPurchaseCategory, 0, 184, Short.MAX_VALUE)
                            .addComponent(txtPurchaseUnitPrice))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnPurchaseConfirm))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPurchaseProductName, 0, 186, Short.MAX_VALUE)
                            .addComponent(txtPurchaseQuantity))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPurchaseSupplierName, 0, 217, Short.MAX_VALUE)
                            .addComponent(txtPurchaseTotalPrice)))
                    .addComponent(btnPurchaseReset))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchaseUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchaseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchaseTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchaseConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchaseReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(607, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 820));

        tapPurchase.addTab("tab1", jPanel11);

        tapMain.addTab("tab5", tapPurchase);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(102, 0, 102));

        jLabel7.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sales Details");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        jLabel31.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        jLabel31.setText("Category : ");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 96, 110, 30));
        jPanel12.add(txtSalesStockQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 170, 30));

        ComboSalesCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(ComboSalesCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 30));

        jLabel32.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        jLabel32.setText("Product Name: ");
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 160, 30));

        ComboSalesProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(ComboSalesProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 190, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel33.setText("Stock Quantity");
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 140, 30));
        jLabel33.getAccessibleContext().setAccessibleName("Stock Quantity :");

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel34.setText("Customer Name : ");
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 166, -1, 30));

        ComboSalesCustomerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(ComboSalesCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel35.setText("Unit Price : ");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 166, 100, 30));
        jPanel12.add(txtSalesUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel36.setText("Quantity : ");
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 90, 30));

        txtSalesQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesQuantityFocusLost(evt);
            }
        });
        jPanel12.add(txtSalesQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 170, 110, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel37.setText("Total Price :");
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 120, 30));
        jPanel12.add(txtSalesTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 170, 30));

        btnSalesSave.setText("Sales");
        btnSalesSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesSaveMouseClicked(evt);
            }
        });
        jPanel12.add(btnSalesSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 120, 30));

        btnSalesReset.setText("Reset");
        jPanel12.add(btnSalesReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 110, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel38.setText("Discount Rate :");
        jPanel12.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 30));

        txtSalesDiscountRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesDiscountRateFocusLost(evt);
            }
        });
        jPanel12.add(txtSalesDiscountRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel39.setText("Actual Price : ");
        jPanel12.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 120, 30));
        jPanel12.add(txtSalesActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 140, 30));

        tapSales.addTab("tab1", jPanel12);

        tapMain.addTab("tab6", tapSales);

        tapStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tapStockMouseClicked(evt);
            }
        });

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(102, 0, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Stock Detials");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel28.setBackground(new java.awt.Color(204, 255, 153));

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblStock);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)
                        .addGap(175, 175, 175)
                        .addComponent(jButton2)
                        .addGap(205, 205, 205)
                        .addComponent(jButton3)
                        .addGap(198, 198, 198)
                        .addComponent(jButton4))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(107, 107, 107)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 810));

        tapStock.addTab("tab1", jPanel13);

        tapMain.addTab("tab7", tapStock);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(51, 0, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reports");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        jPanel30.setBackground(new java.awt.Color(0, 153, 153));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 102, 0));
        jLabel29.setText("From");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 102, 0));
        jLabel30.setText("To");

        btnReportPurchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReportPurchase.setForeground(new java.awt.Color(51, 255, 51));
        btnReportPurchase.setText("Purchase");
        btnReportPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportPurchaseMouseClicked(evt);
            }
        });

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblReport);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReportPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JdateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JdateReportTo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JdateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JdateReportTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(62, 62, 62)
                .addComponent(btnReportPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 810));

        tapReport.addTab("tab1", jPanel14);

        tapMain.addTab("tab8", tapReport);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(102, 102, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        jPanel25.setBackground(new java.awt.Color(204, 204, 0));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("ID No :");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel27.setText("Category :");

        txtProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel28.setText("Product Name :");

        btnProductSave.setText("Save");
        btnProductSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductSaveMouseClicked(evt);
            }
        });

        btnProductReset.setText("Reset");
        btnProductReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductResetMouseClicked(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblProduct);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(btnProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnProductReset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProductProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtProductProductName)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 810));

        tapProduct.addTab("tab1", jPanel7);

        tapMain.addTab("tab9", tapProduct);

        getContentPane().add(tapMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 1170, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

        tapMain.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked

        tapMain.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseClicked

        tapMain.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoryMouseClicked

    private void btnPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseClicked

        tapMain.setSelectedIndex(4);
        // purchaseDao.loadCategory(comboPurchaseCategory);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchaseMouseClicked

    private void btnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseClicked
        tapMain.setSelectedIndex(5);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalesMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        tapMain.setSelectedIndex(6);
         stockDao.getAllStock(tblStock);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        tapMain.setSelectedIndex(7);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportMouseClicked

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed

        tapMain.setSelectedIndex(1);

// TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseClicked
        // TODO add your handling code here:
        tapMain.setSelectedIndex(8);
    }//GEN-LAST:event_btnProductMouseClicked

    private void tapPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapPurchaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tapPurchaseMouseClicked

    private void btnPurchaseConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseConfirmMouseClicked
        // TODO add your handling code here:

        String category = comboPurchaseCategory.getSelectedItem().toString().trim();
        String productName = comboPurchaseProductName.getSelectedItem().toString().trim();
        String supplierName = comboPurchaseSupplierName.getSelectedItem().toString().trim();

        float unitPrice = Float.parseFloat(txtPurchaseUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtPurchaseQuantity.getText().trim());
        float totalPrice = Float.parseFloat(txtPurchaseTotalPrice.getText().trim());

        purchaseDao.savePurchase(productName, unitPrice, quantity, totalPrice, category, supplierName);

        // for stock update
        List<Stock> sList = stockDao.getProductByCategory(category);
        boolean status = false;

        for (Stock stock : sList) {

            if (productName.equals(stock.getProductName())) {

                status = true;
                break;

            }
        }

        if (status) {

            stockDao.updateStockQuantityByProductName(productName, quantity);

        }

        stockDao.getAllStock(tblStock);

    }//GEN-LAST:event_btnPurchaseConfirmMouseClicked

    private void txtPurchaseQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPurchaseQuantityFocusLost
        // TODO add your handling code here:

        float unitPrice = Float.parseFloat(txtPurchaseUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtPurchaseQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        txtPurchaseTotalPrice.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_txtPurchaseQuantityFocusLost

    private void btnCategorySearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategorySearchMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCategoryId1.getText());
        categoryDao.search(id, tblCategory);
    }//GEN-LAST:event_btnCategorySearchMouseClicked

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        // TODO add your handling code here:

        btnCategorySave.setVisible(false);
        int rowIndex = tblCategory.getSelectedRow();
        String id = tblCategory.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblCategory.getModel().getValueAt(rowIndex, 1).toString();

        txtCategoryId1.setText(id);
        txtCategoryName1.setText(name);
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void btnCategoryResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryResetMouseClicked
        // TODO add your handling code here:
        resetCategory();
    }//GEN-LAST:event_btnCategoryResetMouseClicked

    private void btnCategoryDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryDeleteMouseClicked
        // TODO add your handling code here:

        int id = Integer.parseInt(txtCategoryId1.getText().trim());
        categoryDao.deleteCategory(id, tblCategory);
        resetCategory();
        btnCategorySave.setVisible(true);
    }//GEN-LAST:event_btnCategoryDeleteMouseClicked

    private void btnCategoryEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryEditMouseClicked
        // TODO add your handling code here:
        String name = txtCategoryName1.getText().trim();
        int id = Integer.parseInt(txtCategoryId1.getText().trim());

        categoryDao.editCategory(id, name, tblCategory);
        btnCategorySave.setVisible(true);
        resetCategory();
        categoryDao.showAllCategory(tblCategory);
    }//GEN-LAST:event_btnCategoryEditMouseClicked

    private void btnCategorySaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategorySaveMouseClicked
        // TODO add your handling code here:
        String name = txtCategoryName1.getText().trim();

        categoryDao.saveCategory(name, tblCategory);

        resetCategory();
    }//GEN-LAST:event_btnCategorySaveMouseClicked

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // TODO add your handling code here:

        btnSupplierSave.setVisible(false);
        int rowIndex = tblSupplier.getSelectedRow();
        String id = tblSupplier.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblSupplier.getModel().getValueAt(rowIndex, 1).toString();
        String address = tblSupplier.getModel().getValueAt(rowIndex, 2).toString();
        String cell = tblSupplier.getModel().getValueAt(rowIndex, 3).toString();
        String email = tblSupplier.getModel().getValueAt(rowIndex, 4).toString();
        String contractPerson = tblSupplier.getModel().getValueAt(rowIndex, 5).toString();

        txtSupplierId.setText(id);
        txtSupplierName1.setText(name);
        txtSupplierAddress.setText(address);
        txtSupplierCell.setText(cell);
        txtSupplierEmail.setText(email);
        txtSupplierContractPerson.setText(contractPerson);
    }//GEN-LAST:event_tblSupplierMouseClicked

    private void btnSupplierResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierResetMouseClicked
        // TODO add your handling code here:
        resetSupplier();
    }//GEN-LAST:event_btnSupplierResetMouseClicked

    private void btnSupplierDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierDeleteMouseClicked
        // TODO add your handling code here:

        int id = Integer.parseInt(txtSupplierId.getText().trim());
        supplierDao.deleteSupplier(id, tblSupplier);

        resetSupplier();

        btnSupplierSave.setVisible(true);
    }//GEN-LAST:event_btnSupplierDeleteMouseClicked

    private void btnSupplierEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierEditMouseClicked
        // TODO add your handling code here:
        String name = txtSupplierName1.getText().trim();
        String address = txtSupplierAddress.getText().trim();
        String cell = txtSupplierCell.getText().trim();
        String email = txtSupplierEmail.getText().trim();
        String contractPerson = txtSupplierContractPerson.getText().trim();
        int id = Integer.parseInt(txtSupplierId.getText());

        supplierDao.editSupplier(id, name, address, cell, email, contractPerson, tblCategory);

        btnSupplierSave.setVisible(true);
        resetSupplier();
        supplierDao.showAllSupplier(tblSupplier);
    }//GEN-LAST:event_btnSupplierEditMouseClicked

    private void btnSupplierSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierSaveMouseClicked
        // TODO add your handling code here:

        String name = txtSupplierName1.getText().trim();
        String address = txtSupplierAddress.getText().trim();
        String cell = txtSupplierCell.getText().trim();
        String email = txtSupplierEmail.getText().trim();
        String contractPerson = txtSupplierContractPerson.getText().trim();

        supplierDao.saveSupplier(name, address, cell, email, contractPerson, tblSupplier);

        resetSupplier();
    }//GEN-LAST:event_btnSupplierSaveMouseClicked

    private void btnCustomerSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSearchMouseClicked
        // TODO add your handling code here:

        int id = Integer.parseInt(txtCustomerId.getText());
        //
        //        Object[]customers = customerDaw.findCustomerById(id);
        //
        //
        //        txtCustomerId.setText(customers[0].toString());
        //        txtCustomerName.setText(name);
        //        txtCustomerEmail.setText(email);
        //        txtCustomerCell.setText(cell);
        //        txtCustomerAddress.setText(address);
        customerDaw.search(id, tblCustomer);
    }//GEN-LAST:event_btnCustomerSearchMouseClicked

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked

        btnCustomerSave.setVisible(false);
        int rowIndex = tblCustomer.getSelectedRow();
        String id = tblCustomer.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblCustomer.getModel().getValueAt(rowIndex, 1).toString();
        String email = tblCustomer.getModel().getValueAt(rowIndex, 2).toString();
        String cell = tblCustomer.getModel().getValueAt(rowIndex, 3).toString();
        String address = tblCustomer.getModel().getValueAt(rowIndex, 4).toString();

        txtCustomerId.setText(id);
        txtCustomerName.setText(name);
        txtCustomerEmail.setText(email);
        txtCustomerCell.setText(cell);
        txtCustomerAddress.setText(address);
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnCustomerDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerDeleteMouseClicked

        int id = Integer.parseInt(txtCustomerId.getText());
        customerDaw.deleteCustomer(id, tblCustomer);

        resetCustomer();

        btnCustomerSave.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerDeleteMouseClicked

    private void btnCustomerResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerResetMouseClicked

        resetCustomer();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerResetMouseClicked

    private void btnCustomerSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSaveMouseClicked

        String name = txtCustomerName.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String address = txtCustomerAddress.getText().trim();

        customerDaw.saveCustomer(name, email, cell, address, tblCustomer);
        resetCustomer();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerSaveMouseClicked

    private void btnCustomerEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerEditMouseClicked
        // TODO add your handling code here:
        String name = txtCustomerName.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String address = txtCustomerAddress.getText().trim();
        int id = Integer.parseInt(txtCustomerId.getText().trim());
        customerDaw.editCustomer(id, name, email, cell, address, tblCustomer);
        resetCustomer();
        btnCustomerSave.setVisible(true);
    }//GEN-LAST:event_btnCustomerEditMouseClicked

    private void btnProductSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductSaveMouseClicked
        // TODO add your handling code here:

        String productName = txtProductProductName.getText().trim();
        String category = txtProductComboBox.getSelectedItem().toString();

        productDao.saveProduct(category, productName);
        resetProduct();
        productDao.showAllProduct(tblProduct);
        stockDao.saveStock(productName, 0, category);
    }//GEN-LAST:event_btnProductSaveMouseClicked

    private void btnProductResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductResetMouseClicked
        // TODO add your handling code here:

        resetProduct();
    }//GEN-LAST:event_btnProductResetMouseClicked

    private void btnReportPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportPurchaseMouseClicked
        // TODO add your handling code here:

        Date fromDate = JdateReportFrom.getDate();
        Date toDate = JdateReportTo.getDate();

        java.sql.Date from = dateConvert.utilDateToSqlDate(fromDate);
        java.sql.Date to = dateConvert.utilDateToSqlDate(toDate);

        // reportDao.purchaseReportByDate(from, to, tblReport);
        reportDao.generatePDFReoportForPurchase(from, to, tblReport);

    }//GEN-LAST:event_btnReportPurchaseMouseClicked

    private void txtSalesQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesQuantityFocusLost
        // TODO add your handling code here:

        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        txtSalesTotalPrice.setText(String.valueOf(totalPrice));

    }//GEN-LAST:event_txtSalesQuantityFocusLost

    private void txtSalesDiscountRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesDiscountRateFocusLost
        // TODO add your handling code here:
        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        float discount = Float.parseFloat(txtSalesDiscountRate.getText().trim());

        float actualAmount = (float) Math.ceil(totalPrice - (totalPrice * (discount / 100)));

        txtSalesActualPrice.setText(String.valueOf(actualAmount));

    }//GEN-LAST:event_txtSalesDiscountRateFocusLost

    private void btnSalesSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesSaveMouseClicked
        // TODO add your handling code here:
        
        String category = ComboSalesCategory.getSelectedItem().toString();
        String productName = ComboSalesProductName.getSelectedItem().toString();
        String customerName = ComboSalesCustomerName.getSelectedItem().toString();
        float quantity = Float.parseFloat(txtSalesStockQuantity.getText().trim());
        float unitprice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float totalPrice = Float.parseFloat(txtSalesTotalPrice.getText().trim());
        float discountRate = Float.parseFloat(txtSalesDiscountRate.getText().trim());
        float actualPrice = Float.parseFloat(txtSalesActualPrice.getText().trim());
        
        Sales s = new Sales(category, productName, customerName, unitprice, quantity, discountRate, totalPrice, actualPrice);
        
        salesDao.saveSales(s);
        
        System.out.println(quantity);
        
        stockDao.updateStockQuantityByProductNameSales(productName, quantity);
       
    }//GEN-LAST:event_btnSalesSaveMouseClicked

    private void tblStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStockMouseClicked

    private void tapStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tapStockMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSalesCategory;
    private javax.swing.JComboBox<String> ComboSalesCustomerName;
    private javax.swing.JComboBox<String> ComboSalesProductName;
    private com.toedter.calendar.JDateChooser JdateReportFrom;
    private com.toedter.calendar.JDateChooser JdateReportTo;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnCategoryDelete;
    private javax.swing.JButton btnCategoryEdit;
    private javax.swing.JButton btnCategoryReset;
    private javax.swing.JButton btnCategorySave;
    private javax.swing.JButton btnCategorySearch;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnCustomerDelete;
    private javax.swing.JButton btnCustomerEdit;
    private javax.swing.JButton btnCustomerReset;
    private javax.swing.JButton btnCustomerSave;
    private javax.swing.JButton btnCustomerSearch;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProductReset;
    private javax.swing.JButton btnProductSave;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnPurchaseConfirm;
    private javax.swing.JButton btnPurchaseReset;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReportPurchase;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSalesReset;
    private javax.swing.JButton btnSalesSave;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnSupplierDelete;
    private javax.swing.JButton btnSupplierEdit;
    private javax.swing.JButton btnSupplierReset;
    private javax.swing.JButton btnSupplierSave;
    private javax.swing.JButton btnSupplierSearch;
    private javax.swing.JComboBox<String> comboPurchaseCategory;
    private javax.swing.JComboBox<String> comboPurchaseProductName;
    private javax.swing.JComboBox<String> comboPurchaseSupplierName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane tapCategory;
    private javax.swing.JTabbedPane tapCustomer;
    private javax.swing.JTabbedPane tapHome;
    private javax.swing.JTabbedPane tapMain;
    private javax.swing.JTabbedPane tapProduct;
    private javax.swing.JTabbedPane tapPurchase;
    private javax.swing.JTabbedPane tapReport;
    private javax.swing.JTabbedPane tapSales;
    private javax.swing.JTabbedPane tapStock;
    private javax.swing.JTabbedPane tapSupplier;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblReport;
    private javax.swing.JTable tblStock;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JLabel txtCategoryId;
    private javax.swing.JTextField txtCategoryId1;
    private javax.swing.JLabel txtCategoryName;
    private javax.swing.JTextField txtCategoryName1;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerCell;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JComboBox<String> txtProductComboBox;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductProductName;
    private javax.swing.JTextField txtPurchaseQuantity;
    private javax.swing.JTextField txtPurchaseTotalPrice;
    private javax.swing.JTextField txtPurchaseUnitPrice;
    private javax.swing.JTextField txtSalesActualPrice;
    private javax.swing.JTextField txtSalesDiscountRate;
    private javax.swing.JTextField txtSalesQuantity;
    private javax.swing.JTextField txtSalesStockQuantity;
    private javax.swing.JTextField txtSalesTotalPrice;
    private javax.swing.JTextField txtSalesUnitPrice;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierCell;
    private javax.swing.JTextField txtSupplierContractPerson;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierId;
    private javax.swing.JTextField txtSupplierName1;
    // End of variables declaration//GEN-END:variables
}
