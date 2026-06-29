package com.pos.system;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        setTitle("Point of Sale System - Main Menu");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Master Data");

        jMenuItem1.setText("Customers");
        jMenuItem1.addActionListener(evt -> jMenuItem1ActionPerformed(evt));
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Items");
        jMenuItem2.addActionListener(evt -> jMenuItem2ActionPerformed(evt));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Suppliers");
        jMenuItem3.addActionListener(evt -> jMenuItem3ActionPerformed(evt));
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transactions");

        jMenuItem6.setText("Purchase Items");
        jMenuItem6.addActionListener(evt -> jMenuItem6ActionPerformed(evt));
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Sales");
        jMenuItem7.addActionListener(evt -> jMenuItem7ActionPerformed(evt));
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reports");

        jMenuItem5.setText("Item Report");
        jMenuItem5.addActionListener(evt -> jMenuItem5ActionPerformed(evt));
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        CustomerForm s = new CustomerForm();
        this.jDesktopPane1.add(s);
        s.setVisible(true);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        ItemForm t = new ItemForm();
        this.jDesktopPane1.add(t);
        t.setVisible(true);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        SupplierForm t = new SupplierForm();
        this.jDesktopPane1.add(t);
        t.setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        ReportForm t = new ReportForm();
        this.jDesktopPane1.add(t);
        t.setVisible(true);
    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        SalesForm t = new SalesForm();
        this.jDesktopPane1.add(t);
        t.setVisible(true);
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        PurchaseForm t = new PurchaseForm();
        this.jDesktopPane1.add(t);
        t.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }

    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
}
