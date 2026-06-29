package com.pos.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ItemForm extends javax.swing.JInternalFrame {

    public ItemForm() {
        initComponents();
        loadTableData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtSellingPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20));
        jLabel1.setText("ITEM DATA FORM");

        jLabel2.setText("ITEM CODE");
        jLabel3.setText("ITEM NAME");
        jLabel4.setText("PURCHASE PRICE");
        jLabel5.setText("SELLING PRICE");
        jLabel6.setText("STOCK");

        txtItemCode.addCaretListener(evt -> txtItemCodeCaretUpdate(evt));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));

        btnSave.setText("SAVE");
        btnSave.addActionListener(evt -> btnSaveActionPerformed(evt));

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(evt -> btnEditActionPerformed(evt));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(evt -> btnDeleteActionPerformed(evt));

        btnClose.setText("CLOSE");
        btnClose.addActionListener(evt -> btnCloseActionPerformed(evt));

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String[] { "Code", "Name", "Purchase Price", "Selling Price", "Stock", "Equity" }
        ));
        jScrollPane1.setViewportView(tblItems);

        txtSearch.addCaretListener(evt -> txtSearchCaretUpdate(evt));

        btnSearch.setText("SEARCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtItemCode)
                            .addComponent(txtItemName)
                            .addComponent(txtPurchasePrice)
                            .addComponent(txtSellingPrice)
                            .addComponent(txtStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void loadTableData() {
        try {
            Connection c = DatabaseConnection.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT code, name, purchase_price, selling_price, stock, equity FROM items";
            ResultSet r = s.executeQuery(sql);
            tblItems.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtItemCode.getText().trim();
        String name = txtItemName.getText().trim();
        String purchasePrice = txtPurchasePrice.getText().trim();
        String sellingPrice = txtSellingPrice.getText().trim();
        String stock = txtStock.getText().trim();

        if (code.isEmpty()) { JOptionPane.showMessageDialog(this, "Item Code cannot be empty!"); return; }
        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Item Name cannot be empty!"); return; }
        if (purchasePrice.isEmpty()) { JOptionPane.showMessageDialog(this, "Purchase Price cannot be empty!"); return; }
        if (sellingPrice.isEmpty()) { JOptionPane.showMessageDialog(this, "Selling Price cannot be empty!"); return; }
        if (stock.isEmpty()) { JOptionPane.showMessageDialog(this, "Stock cannot be empty!"); return; }

        try {
            int stok = Integer.parseInt(stock);
            int hBeli = Integer.parseInt(purchasePrice);
            int equity = stok * hBeli;

            Connection c = DatabaseConnection.getConnection();
            String sql = "INSERT INTO items VALUES (?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, code);
            p.setString(2, name);
            p.setString(3, purchasePrice);
            p.setString(4, sellingPrice);
            p.setString(5, stock);
            p.setInt(6, equity);
            p.executeUpdate();
            p.close();

            JOptionPane.showMessageDialog(this, "Data saved successfully");
            loadTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        txtItemCode.setText("");
        txtItemName.setText("");
        txtSellingPrice.setText("");
        txtPurchasePrice.setText("");
        txtStock.setText("");
        txtItemCode.requestFocus();
    }

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtItemCode.getText().trim();
        String name = txtItemName.getText().trim();
        String purchasePrice = txtPurchasePrice.getText().trim();
        String sellingPrice = txtSellingPrice.getText().trim();
        String stock = txtStock.getText().trim();

        if (code.isEmpty()) { JOptionPane.showMessageDialog(this, "Item Code cannot be empty!"); return; }
        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Item Name cannot be empty!"); return; }
        if (purchasePrice.isEmpty()) { JOptionPane.showMessageDialog(this, "Purchase Price cannot be empty!"); return; }
        if (sellingPrice.isEmpty()) { JOptionPane.showMessageDialog(this, "Selling Price cannot be empty!"); return; }
        if (stock.isEmpty()) { JOptionPane.showMessageDialog(this, "Stock cannot be empty!"); return; }

        try {
            int stok = Integer.parseInt(stock);
            int hBeli = Integer.parseInt(purchasePrice);
            int equity = stok * hBeli;

            Connection c = DatabaseConnection.getConnection();
            String sql = "UPDATE items SET name=?, purchase_price=?, selling_price=?, stock=?, equity=? WHERE code=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, purchasePrice);
            p.setString(3, sellingPrice);
            p.setString(4, stock);
            p.setInt(5, equity);
            p.setString(6, code);
            p.executeUpdate();
            p.close();

            JOptionPane.showMessageDialog(this, "Data updated successfully");
            loadTableData();
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
                txtItemName.setText(r.getString("name"));
                txtPurchasePrice.setText(r.getString("purchase_price"));
                txtSellingPrice.setText(r.getString("selling_price"));
                txtStock.setText(r.getString("stock"));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtItemCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select an item to delete first!");
            return;
        }
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "DELETE FROM items WHERE code = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, code);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Data deleted successfully");
            loadTableData();
            btnAddActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM items WHERE code LIKE ? OR name LIKE ? OR purchase_price LIKE ? OR selling_price LIKE ? OR stock LIKE ?";
            PreparedStatement p = c.prepareStatement(sql);
            String searchPattern = "%" + txtSearch.getText().trim() + "%";
            p.setString(1, searchPattern);
            p.setString(2, searchPattern);
            p.setString(3, searchPattern);
            p.setString(4, searchPattern);
            p.setString(5, searchPattern);
            ResultSet r = p.executeQuery();
            tblItems.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtStock;
}
