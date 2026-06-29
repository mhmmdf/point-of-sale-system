package com.pos.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SupplierForm extends javax.swing.JInternalFrame {

    public SupplierForm() {
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
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("SUPPLIER CODE");
        jLabel2.setText("SUPPLIER NAME");
        jLabel3.setText("ADDRESS");
        jLabel4.setText("PHONE");

        txtCode.addCaretListener(evt -> txtCodeCaretUpdate(evt));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25));
        jLabel5.setText("SUPPLIER DATA FORM");

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

        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String[] { "Code", "Name", "Address", "Phone" }
        ));
        jScrollPane2.setViewportView(tblSuppliers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnClose))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void loadTableData() {
        try {
            Connection c = DatabaseConnection.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT code, name, address, phone FROM suppliers";
            ResultSet r = s.executeQuery(sql);
            tblSuppliers.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        txtCode.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtCode.requestFocus();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtCode.getText().trim();
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();

        if (code.isEmpty()) { JOptionPane.showMessageDialog(this, "Supplier Code cannot be empty!"); return; }
        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Supplier Name cannot be empty!"); return; }
        if (address.isEmpty()) { JOptionPane.showMessageDialog(this, "Address cannot be empty!"); return; }
        if (phone.isEmpty()) { JOptionPane.showMessageDialog(this, "Phone cannot be empty!"); return; }

        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "INSERT INTO suppliers VALUES (?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, code);
            p.setString(2, name);
            p.setString(3, address);
            p.setString(4, phone);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Data saved successfully");
            loadTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void txtCodeCaretUpdate(javax.swing.event.CaretEvent evt) {
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM suppliers WHERE code = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtCode.getText().trim());
            ResultSet r = p.executeQuery();
            while (r.next()) {
                txtName.setText(r.getString("name"));
                txtAddress.setText(r.getString("address"));
                txtPhone.setText(r.getString("phone"));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtCode.getText().trim();
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();

        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Supplier Name cannot be empty!"); return; }
        if (address.isEmpty()) { JOptionPane.showMessageDialog(this, "Address cannot be empty!"); return; }
        if (phone.isEmpty()) { JOptionPane.showMessageDialog(this, "Phone cannot be empty!"); return; }

        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "UPDATE suppliers SET name=?, address=?, phone=? WHERE code=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, address);
            p.setString(3, phone);
            p.setString(4, code);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Data updated successfully");
            loadTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a supplier to delete first!");
            return;
        }
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "DELETE FROM suppliers WHERE code = ?";
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
}
