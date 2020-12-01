package FrontEnd;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Income extends javax.swing.JFrame {
Connection conn = null;
int subtot=0;
    int monthly_exp = 0;
    int totalrip=0;
    int totalres=0;
    int totalperpart=0;
    int totalpart=0;
    String totalrip1=null;
    String totalres1=null;
    String totalprt=null;
    String finaltot=null;
    ResultSet rs = null;
   // private int finaltotalexpnce;
    
    /**
     * Creates new form Income
     */
    public Income() throws SQLException {
        initComponents();
        conn = jConnection.ConnectDB();
        Update_Table1();
        Update_Table2();
        Update_Table3();
    }
    
    public void Update_Table1() throws SQLException {

      
            String sql1 = "Select  * from Spare_Parts ";
            Statement sta1 = conn.createStatement();
            
            rs = sta1.executeQuery(sql1);
            
            int i=0;
            while(rs.next()) {
            
            Object SItem_ID = rs.getString("Item_ID");
            System.out.println(SItem_ID);
            Object SItem_Name = rs.getString("Item_Name");
            //Object SQuantity = rs.getInt("Quantity");
            int Sselling_Price = rs.getInt("Selling_Price");
            //Object SIn_Stock = rs.getInt("In_Stock");
            int sSQuantity = rs.getInt("Quantity");
            int sSIn_Stock = rs.getInt("In_Stock");
            int stock = sSQuantity - sSIn_Stock;
            Object fstock = stock;
            totalperpart = stock*Sselling_Price;
            totalpart = totalperpart+totalpart;
            
            DefaultTableModel dtm = (DefaultTableModel) spincome.getModel();
            
            spincome.getModel().setValueAt(SItem_ID,i, 0 );
            spincome.getModel().setValueAt(SItem_Name, i, 1);
            spincome.getModel().setValueAt(fstock, i, 2);
            spincome.getModel().setValueAt(totalperpart, i, 3);
            dtm.insertRow(dtm.getRowCount(), new Object[] {  });
                          
            System.out.println(i);
        i++;
        }
            totalprt = Integer.toString(totalpart);
            totpart.setText(totalprt);
            
    }
    
    public void Update_Table2() throws SQLException {

      
            String sql2 = "Select  * from Repair_Job";
            Statement sta2 = conn.createStatement();
            
            rs = sta2.executeQuery(sql2);
            
            
            
            int i=0;
            while(rs.next()) {
                
                
            
            Object ripJob_Number  = rs.getString("Job_Number");
            System.out.println(ripJob_Number);
            int ripTotal_Amount  = rs.getInt("Total_Amount");
            
             totalrip = ripTotal_Amount + totalrip;
            
            DefaultTableModel dtm1 = (DefaultTableModel) rjincome.getModel();
            
            rjincome.getModel().setValueAt(ripJob_Number,i, 0 );
            rjincome.getModel().setValueAt(ripTotal_Amount, i, 1);
            dtm1.insertRow(dtm1.getRowCount(), new Object[] {  });
           
                          
            System.out.println(i);
        i++;
        }
            totalrip1 = Integer.toString(totalrip);
            totrepair.setText(totalrip1);
    }
    
    
    public void Update_Table3() throws SQLException {

      
            String sql3 = "Select  * from Restoration_Job";
            Statement sta3 = conn.createStatement();
            
            rs = sta3.executeQuery(sql3);
            
            
            
            int i=0;
            while(rs.next()) {
                
                
            
            Object resJob_Number  = rs.getString("RESJob_Number");
            System.out.println(resJob_Number);
            int resTotal_Amount  = rs.getInt("Total_Amount");
            
             totalres = resTotal_Amount + totalres;
            
            DefaultTableModel dtm1 = (DefaultTableModel) resjobincome.getModel();
            
            resjobincome.getModel().setValueAt(resJob_Number,i, 0 );
            resjobincome.getModel().setValueAt(resTotal_Amount, i, 1);
            dtm1.insertRow(dtm1.getRowCount(), new Object[] {  });
           
                          
            System.out.println(i);
        i++;
        }
            totalres1 = Integer.toString(totalres);
            totrestorer.setText(totalres1);
            
             subtot = totalres+totalrip+totalpart;
            finaltot = Integer.toString(subtot);
            fulltot.setText(finaltot);
            
            
    }
    
    /*public void getprof() throws SQLException{
        Expence cla = new Expence();
        int temp=cla.value();
        int profit=subtot-temp;
        finaltot = Integer.toString(profit);
        prof.setText(finaltot);
        
    }*/
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        resjobincome = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        rjincome = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        spincome = new javax.swing.JTable();
        totpart = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totrepair = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totrestorer = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fulltot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("Spare Parts");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("Repair Jobs");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Restoration Jobs");

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        resjobincome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Resotoration job id", "income"
            }
        ));
        jScrollPane3.setViewportView(resjobincome);

        jScrollPane4.setViewportView(jScrollPane3);

        rjincome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Repair job id", "income"
            }
        ));
        jScrollPane2.setViewportView(rjincome);

        jScrollPane5.setViewportView(jScrollPane2);

        spincome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Part id", "Part name", "Quantity", "Income"
            }
        ));
        jScrollPane1.setViewportView(spincome);

        jScrollPane6.setViewportView(jScrollPane1);

        totpart.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        totpart.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        totrepair.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        totrepair.setText("jLabel5");

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setText("Total");

        totrestorer.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        totrestorer.setText("jLabel5");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setText("Total");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Total  eranigs for the month");

        fulltot.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totpart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(512, 512, 512))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(totrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(totrestorer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fulltot, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totpart)
                    .addComponent(jLabel6))
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totrepair)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totrestorer)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fulltot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 1380, 769);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HomeUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Income().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fulltot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable resjobincome;
    private javax.swing.JTable rjincome;
    private javax.swing.JTable spincome;
    private javax.swing.JLabel totpart;
    private javax.swing.JLabel totrepair;
    private javax.swing.JLabel totrestorer;
    // End of variables declaration//GEN-END:variables
}
