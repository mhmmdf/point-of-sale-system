package com.pos.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CustomerForm extends javax.swing.JInternalFrame {

    public CustomerForm() {
        initComponents();
        loadTableData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnGroupIdType = new javax.swing.ButtonGroup();
        btnGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdNumber = new javax.swing.JTextField();
        radioKtp = new javax.swing.JRadioButton();
        radioSim = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        jLabel2.setText("ID NUMBER");
        jLabel3.setText("NAME");
        jLabel4.setText("ADDRESS");
        jLabel5.setText("GENDER");
        jLabel6.setText("PHONE");
        jLabel7.setText("DATE");

        txtIdNumber.addCaretListener(evt -> txtIdNumberCaretUpdate(evt));

        btnGroupIdType.add(radioKtp);
        radioKtp.setText("KTP");
        btnGroupIdType.add(radioSim);
        radioSim.setText("SIM");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnGroupGender.add(radioMale);
        radioMale.setText("Male");
        btnGroupGender.add(radioFemale);
        radioFemale.setText("Female");

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

        txtSearch.addCaretListener(evt -> txtSearchCaretUpdate(evt));

        jLabel8.setText("SEARCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(txtName)
                    .addComponent(jScrollPane1)
                    .addComponent(txtPhone)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(radioSim, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioKtp)
                    .addComponent(radioSim)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnEdit)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] { "ID Number", "ID Type", "Name", "Address", "Gender", "Phone", "Date" }
        ));
        jScrollPane2.setViewportView(tblCustomers);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        // (layout kept from original for compatibility)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 800, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 600, Short.MAX_VALUE));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20));
        jLabel1.setText("CUSTOMER DATA FORM");

        getContentPane().add(jPanel1);
        pack();
    }

    private void loadTableData() {
        try {
            Connection c = DatabaseConnection.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT id_number, id_type, name, address, gender, phone, registration_date FROM customers";
            ResultSet r = s.executeQuery(sql);
            tblCustomers.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtDate.setDate(null);
        btnGroupIdType.clearSelection();
        btnGroupGender.clearSelection();
        txtIdNumber.setText("");
        txtIdNumber.requestFocus();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.Date date = txtDate.getDate();
        String idNumber = txtIdNumber.getText().trim();
        String name = txtName.getText().trim();
        String idType = radioKtp.isSelected() ? "KTP" : "SIM";
        String gender = radioMale.isSelected() ? "Male" : "Female";
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();

        if (idNumber.isEmpty()) { JOptionPane.showMessageDialog(this, "ID Number cannot be empty!"); return; }
        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Name cannot be empty!"); return; }
        if (address.isEmpty()) { JOptionPane.showMessageDialog(this, "Address cannot be empty!"); return; }
        if (phone.isEmpty()) { JOptionPane.showMessageDialog(this, "Phone cannot be empty!"); return; }

        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, idNumber);
            p.setString(2, idType);
            p.setString(3, name);
            p.setString(4, address);
            p.setString(5, gender);
            p.setString(6, phone);
            p.setDate(7, date != null ? new java.sql.Date(date.getTime()) : null);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Data saved successfully");
            loadTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void txtIdNumberCaretUpdate(javax.swing.event.CaretEvent evt) {
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM customers WHERE id_number = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtIdNumber.getText().trim());
            ResultSet r = p.executeQuery();
            while (r.next()) {
                txtName.setText(r.getString("name"));
                if ("KTP".equalsIgnoreCase(r.getString("id_type"))) {
                    radioKtp.setSelected(true);
                } else {
                    radioSim.setSelected(true);
                }
                if ("Male".equalsIgnoreCase(r.getString("gender"))) {
                    radioMale.setSelected(true);
                } else {
                    radioFemale.setSelected(true);
                }
                txtAddress.setText(r.getString("address"));
                txtDate.setDate(r.getDate("registration_date"));
                txtPhone.setText(r.getString("phone"));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.Date date = txtDate.getDate();
        String idNumber = txtIdNumber.getText().trim();
        String name = txtName.getText().trim();
        String idType = radioKtp.isSelected() ? "KTP" : "SIM";
        String gender = radioMale.isSelected() ? "Male" : "Female";
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();

        if (idNumber.isEmpty()) { JOptionPane.showMessageDialog(this, "ID Number cannot be empty!"); return; }
        if (name.isEmpty()) { JOptionPane.showMessageDialog(this, "Name cannot be empty!"); return; }
        if (address.isEmpty()) { JOptionPane.showMessageDialog(this, "Address cannot be empty!"); return; }
        if (phone.isEmpty()) { JOptionPane.showMessageDialog(this, "Phone cannot be empty!"); return; }

        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "UPDATE customers SET id_type=?, name=?, address=?, gender=?, phone=?, registration_date=? WHERE id_number=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, idType);
            p.setString(2, name);
            p.setString(3, address);
            p.setString(4, gender);
            p.setString(5, phone);
            p.setDate(6, date != null ? new java.sql.Date(date.getTime()) : null);
            p.setString(7, idNumber);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Data updated successfully");
            loadTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String idNumber = txtIdNumber.getText().trim();
        if (idNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a customer to delete first!");
            return;
        }
        try {
            Connection c = DatabaseConnection.getConnection();
            String sql = "DELETE FROM customers WHERE id_number = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, idNumber);
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
            String sql = "SELECT * FROM customers WHERE id_number LIKE ? OR id_type LIKE ? OR name LIKE ? OR address LIKE ? OR phone LIKE ? OR gender LIKE ?";
            PreparedStatement p = c.prepareStatement(sql);
            String pattern = "%" + txtSearch.getText().trim() + "%";
            for (int i = 1; i <= 6; i++) p.setString(i, pattern);
            ResultSet r = p.executeQuery();
            tblCustomers.setModel(DbUtils.resultSetToTableModel(r));
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
    private javax.swing.ButtonGroup btnGroupIdType;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioKtp;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioSim;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JDateChooser txtDate;
}
