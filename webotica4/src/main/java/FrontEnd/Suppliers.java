/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import javax.swing.JOptionPane;
import DatabaseLayer.JavaConnect;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Gajenthan
 */
public class Suppliers extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Suppliers
     */
    public Suppliers() {
        initComponents();
        conn = JavaConnect.ConnectDB();
        Update_Table();
    }

    public void Update_Table() {

        try {
            String sql = "Select * from Supplier";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_Suppliers.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Suppliers = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cmd_Update = new javax.swing.JButton();
        cmd_Clear = new javax.swing.JButton();
        cmd_Add = new javax.swing.JButton();
        cmd_Home = new javax.swing.JButton();
        cmd_Delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_Name = new javax.swing.JTextField();
        cmd_ContactNumber = new javax.swing.JLabel();
        cmd_MailAddress = new javax.swing.JLabel();
        cmd_Address = new javax.swing.JLabel();
        txt_EmailAddress = new javax.swing.JTextField();
        cmd_IDNumber = new javax.swing.JLabel();
        cmd_Name = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        txt_ContactNumber = new javax.swing.JTextField();
        txt_IDNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_DueDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        Table_Suppliers.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_SuppliersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Suppliers);

        cmd_Update.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmd_Update.setText("Update");
        cmd_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_UpdateActionPerformed(evt);
            }
        });

        cmd_Clear.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmd_Clear.setText("Clear");
        cmd_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_ClearActionPerformed(evt);
            }
        });

        cmd_Add.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmd_Add.setText("Add");
        cmd_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_AddActionPerformed(evt);
            }
        });

        cmd_Home.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmd_Home.setText("Home");

        cmd_Delete.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmd_Delete.setText("Delete");
        cmd_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(cmd_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        txt_Name.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        cmd_ContactNumber.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cmd_ContactNumber.setText("Contact Number");

        cmd_MailAddress.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cmd_MailAddress.setText("Email Address");

        cmd_Address.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cmd_Address.setText("Address");

        txt_EmailAddress.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        txt_EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailAddressActionPerformed(evt);
            }
        });

        cmd_IDNumber.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cmd_IDNumber.setText("Supplier ID");

        cmd_Name.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cmd_Name.setText("Name");

        txt_Address.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        txt_ContactNumber.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        txt_IDNumber.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("NIC");

        txt_NIC.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Due Date");

        txt_DueDate.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmd_MailAddress)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmd_Name)
                    .addComponent(cmd_IDNumber)
                    .addComponent(cmd_Address)
                    .addComponent(cmd_ContactNumber))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Name)
                    .addComponent(txt_Address)
                    .addComponent(txt_IDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NIC)
                            .addComponent(txt_DueDate)))
                    .addComponent(txt_ContactNumber)
                    .addComponent(txt_EmailAddress))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmd_IDNumber)
                            .addComponent(txt_IDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmd_Name))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmd_Address)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmd_ContactNumber))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmd_MailAddress))
                        .addGap(28, 28, 28)
                        .addComponent(txt_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18))
        );

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailAddressActionPerformed

    private void Table_SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_SuppliersMouseClicked
        try {
            int row = Table_Suppliers.getSelectedRow();
            String Table_CLick = (Table_Suppliers.getModel().getValueAt(row, 0).toString());
            String sql = "select * from Supplier where Supplier_ID='" + Table_CLick + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Supplier_ID");
                txt_IDNumber.setText(add1);
                String add2 = rs.getString("Name");
                txt_Name.setText(add2);
                String add3 = rs.getString("Address");
                txt_Address.setText(add3);
                String add4 = rs.getString("Contact_Number");
                txt_ContactNumber.setText(add4);
                String add5 = rs.getString("Email_Address");
                txt_EmailAddress.setText(add5);
                String add6 = rs.getString("NIC");
                txt_NIC.setText(add6);
                String add7 = rs.getString("Due_Date");
                txt_DueDate.setText(add7);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Table_SuppliersMouseClicked

    private void cmd_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_AddActionPerformed
        try {

            String sql = "insert into Supplier (Supplier_ID,Name,Address,Contact_Number,Email_Address) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_IDNumber.getText());
            pst.setString(2, txt_Name.getText());
            pst.setString(3, txt_Address.getText());
            pst.setString(4, txt_ContactNumber.getText());
            pst.setString(5, txt_EmailAddress.getText());
            pst.setString(6, txt_DueDate.getText());
            pst.setString(7, txt_NIC.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Added");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        Update_Table();
    }//GEN-LAST:event_cmd_AddActionPerformed

    private void cmd_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_UpdateActionPerformed
        try {
            String value1 = txt_IDNumber.getText();
            String value2 = txt_Name.getText();
            String value3 = txt_Address.getText();
            String value4 = txt_ContactNumber.getText();
            String value5 = txt_EmailAddress.getText();
            String value6 = txt_NIC.getText();
            String value7 = txt_DueDate.getText();

            String sql = "update Supplier set Supplier_ID='" + value1 + "',Name='" + value2 + "',Address='" + value3 + "',Contact_Number='" + value4 + "',Email_Address='" + value5 + "',NIC='" + value6 + "',Due_Date='" + value7 + "' where Supplier_ID='" + value1 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_Table();        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_UpdateActionPerformed

    private void cmd_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_DeleteActionPerformed
        String sql = "delete from Supplier where Supplier_ID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_IDNumber.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_Table();        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_DeleteActionPerformed

    private void cmd_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_ClearActionPerformed
        txt_IDNumber.setText("");
        txt_Name.setText("");
        txt_Address.setText("");
        txt_ContactNumber.setText("");
        txt_EmailAddress.setText("");
        txt_NIC.setText("");
        txt_DueDate.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_cmd_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Suppliers;
    private javax.swing.JButton cmd_Add;
    private javax.swing.JLabel cmd_Address;
    private javax.swing.JButton cmd_Clear;
    private javax.swing.JLabel cmd_ContactNumber;
    private javax.swing.JButton cmd_Delete;
    private javax.swing.JButton cmd_Home;
    private javax.swing.JLabel cmd_IDNumber;
    private javax.swing.JLabel cmd_MailAddress;
    private javax.swing.JLabel cmd_Name;
    private javax.swing.JButton cmd_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_ContactNumber;
    private javax.swing.JTextField txt_DueDate;
    private javax.swing.JTextField txt_EmailAddress;
    private javax.swing.JTextField txt_IDNumber;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_Name;
    // End of variables declaration//GEN-END:variables
}
