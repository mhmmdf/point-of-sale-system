package com.pos.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class PurchaseForm extends javax.swing.JInternalFrame {

    public PurchaseForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtOrderNo = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        lblItemName = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        lblSellingPrice = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtSupplierCode = new javax.swing.JTextField();
        btnDisplay = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchases = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 51, 204));

        jLabel2.setText("Order No.");
        jLabel3.setText("Item Code");

        lbl1.setText("Item Name");
        lbl2.setText("Purchase Price");
        lbl3.setText("Selling Price");
        lbl4.setText("Total Stock");

        txtItemCode.addCaretListener(evt -> txtItemCodeCaretUpdate(evt));

        lblItemName.setText(" ");
        lblPurchasePrice.setText(" ");
        lblSellingPrice.setText(" ");
        lblStock.setText(" ");

        jLabel8.setText("Order Qty");
        jLabel9.setText("Order Date");
        jLabel10.setText("Supplier Code");
        label5.setText("Supplier Name");

        txtSupplierCode.addCaretListener(evt -> txtSupplierCodeCaretUpdate(evt));

        btnDisplay.setText("DISPLAY");

        txtSearch.addActionListener(evt -> btnDisplayActionPerformed(evt));

        lblSupplierName.setText(" ");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));

        btnSave.setText("SAVE");
        btnSave.addActionListener(evt -> btnSaveActionPerformed(evt));

        btnClose.setText("CLOSE");
        btnClose.addActionListener(evt -> btnCloseActionPerformed(evt));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("PURCHASE DATA FORM");

        tblPurchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String[] { "ID", "Order No", "Item Code", "Qty", "Date", "Supplier" }
        ));
        jScrollPane1.setViewportView(tblPurchases);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        txtItemCode.setText("");
        lblItemName.setText("");
        lblPurchasePrice.setText("");
        lblSellingPrice.setText("");
        lblStock.setText("");
        txtQty.setText("");
        txtDate.setDate(null);
        txtSupplierCode.setText("");
        lblSupplierName.setText("");
        txtOrderNo.requestFocus();
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    private void txtSupplierCodeCaretUpdate(javax.swing.event.CaretEvent evt) {
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM suppliers WHERE code = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtSupplierCode.getText().trim());
            ResultSet r = p.executeQuery();
            while (r.next()) {
                lblSupplierName.setText(r.getString("name"));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.Date orderDate = txtDate.getDate();
        String orderNo = txtOrderNo.getText().trim();
        String itemCode = txtItemCode.getText().trim();
        String supplierCode = txtSupplierCode.getText().trim();
        String qtyText = txtQty.getText().trim();

        if (orderNo.isEmpty()) { JOptionPane.showMessageDialog(this, "Order No. cannot be empty!"); return; }
        if (itemCode.isEmpty()) { JOptionPane.showMessageDialog(this, "Item Code cannot be empty!"); return; }
        if (qtyText.isEmpty()) { JOptionPane.showMessageDialog(this, "Order Qty cannot be empty!"); return; }
        if (supplierCode.isEmpty()) { JOptionPane.showMessageDialog(this, "Supplier Code cannot be empty!"); return; }

        try {
            int qty = Integer.parseInt(qtyText);
            int currentStock = Integer.parseInt(lblStock.getText());
            int purchasePrice = Integer.parseInt(lblPurchasePrice.getText());

            int newStock = currentStock + qty;
            int equity = newStock * purchasePrice;
            int totalPurchase = qty * purchasePrice;

            lblStock.setText(Integer.toString(newStock));

            Connection c = DatabaseConnection.getConnection();

            String sql = "INSERT INTO purchase_orders (order_number, item_code, quantity, order_date, supplier_code) VALUES (?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, orderNo);
            p.setString(2, itemCode);
            p.setInt(3, qty);
            p.setDate(4, orderDate != null ? new java.sql.Date(orderDate.getTime()) : new java.sql.Date(new java.util.Date().getTime()));
            p.setString(5, supplierCode);
            p.executeUpdate();
            p.close();

            String updateSql = "UPDATE items SET stock=?, equity=? WHERE code=?";
            PreparedStatement p2 = c.prepareStatement(updateSql);
            p2.setInt(1, newStock);
            p2.setInt(2, equity);
            p2.setString(3, itemCode);
            p2.executeUpdate();
            p2.close();

            JOptionPane.showMessageDialog(this, "Purchase recorded successfully");

            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT id, order_number, item_code, quantity, order_date, supplier_code FROM purchase_orders");
            tblPurchases.setModel(DbUtils.resultSetToTableModel(r));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void txtItemCodeCaretUpdate(javax.swing.event.CaretEvent evt) {
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM items WHERE code = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtItemCode.getText().trim());
            ResultSet r = p.executeQuery();
            while (r.next()) {
                lblItemName.setText(r.getString("name"));
                lblPurchasePrice.setText(r.getString("purchase_price"));
                lblSellingPrice.setText(r.getString("selling_price"));
                lblStock.setText(r.getString("stock"));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("order_number");
        model.addColumn("item_code");
        model.addColumn("quantity");
        model.addColumn("order_date");
        model.addColumn("supplier_code");

        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM purchase_orders WHERE order_number LIKE ? OR item_code LIKE ? OR supplier_code LIKE ? OR quantity LIKE ?";
            PreparedStatement p = c.prepareStatement(sql);
            String pattern = "%" + txtSearch.getText().trim() + "%";
            p.setString(1, pattern);
            p.setString(2, pattern);
            p.setString(3, pattern);
            p.setString(4, pattern);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                model.addRow(new Object[]{
                    r.getString("order_number"), r.getString("item_code"),
                    r.getString("quantity"), r.getString("order_date"),
                    r.getString("supplier_code")
                });
            }
            tblPurchases.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblSellingPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtSupplierCode;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JTextField txtOrderNo;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tblPurchases;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
}
