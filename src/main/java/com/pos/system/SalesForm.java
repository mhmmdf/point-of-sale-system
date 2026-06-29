package com.pos.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SalesForm extends javax.swing.JInternalFrame {

    public SalesForm() {
        initComponents();
        btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SALES DATA FORM");

        jLabel4.setText("Item Code");

        txtItemCode.addCaretListener(evt -> txtItemCodeCaretUpdate(evt));

        jLabel5.setText("Item Name");
        jLabel6.setText("Price");
        jLabel7.setText("Stock");

        jLabel8.setText("Qty");
        jLabel9.setText("Date");
        jLabel10.setText("Total");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));

        btnSave.setText("SAVE");
        btnSave.addActionListener(evt -> btnSaveActionPerformed(evt));

        btnClose.setText("CLOSE");
        btnClose.addActionListener(evt -> btnCloseActionPerformed(evt));

        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String[] { "ID", "Item Code", "Qty", "Total", "Date", "Profit" }
        ));
        jScrollPane1.setViewportView(tblSales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        txtItemCode.setText("");
        lblItemName.setText("");
        lblPrice.setText("");
        lblStock.setText("");
        txtQty.setText("");
        lblTotal.setText("");
        txtItemCode.requestFocus();
        btnSave.setEnabled(false);
        btnAdd.setEnabled(true);
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
                lblPrice.setText(r.getString("selling_price"));
                lblStock.setText(r.getString("stock"));
            }
            r.close();
            p.close();
            btnSave.setEnabled(true);
            btnAdd.setEnabled(false);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.Date saleDate = txtDate.getDate();
        String itemCode = txtItemCode.getText().trim();
        String qtyText = txtQty.getText().trim();

        if (itemCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item Code cannot be empty!");
            return;
        }
        if (qtyText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Qty cannot be empty!");
            return;
        }

        try {
            int qty = Integer.parseInt(qtyText);
            int price = Integer.parseInt(lblPrice.getText());
            int stock = Integer.parseInt(lblStock.getText());
            int purchasePrice = Integer.parseInt(lblPrice.getText());

            int newStock = stock - qty;
            int total = price * qty;
            int profit = total - (purchasePrice * qty);

            lblStock.setText(Integer.toString(newStock));
            lblTotal.setText(Integer.toString(total));

            Connection c = DatabaseConnection.getConnection();

            // Insert sale record
            String sql = "INSERT INTO sales (item_code, quantity, total, sale_date, profit) VALUES (?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, itemCode);
            p.setInt(2, qty);
            p.setInt(3, total);
            p.setDate(4, saleDate != null ? new java.sql.Date(saleDate.getTime()) : new java.sql.Date(new java.util.Date().getTime()));
            p.setInt(5, profit);
            p.executeUpdate();
            p.close();

            // Update item stock
            int equity = newStock * purchasePrice;
            String updateSql = "UPDATE items SET stock=?, equity=? WHERE code=?";
            PreparedStatement p2 = c.prepareStatement(updateSql);
            p2.setInt(1, newStock);
            p2.setInt(2, equity);
            p2.setString(3, itemCode);
            p2.executeUpdate();
            p2.close();

            JOptionPane.showMessageDialog(this, "Sale recorded successfully");
            loadSalesTable();
            btnSave.setEnabled(false);
            btnAdd.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void loadSalesTable() {
        try {
            Connection c = DatabaseConnection.getConnection();
            java.sql.Statement s = c.createStatement();
            String sql = "SELECT id, item_code, quantity, total, sale_date, profit FROM sales";
            ResultSet r = s.executeQuery(sql);
            tblSales.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JTable tblSales;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel lblStock;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
}
