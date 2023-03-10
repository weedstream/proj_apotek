/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apotek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author badnoby
 */
public class Company extends javax.swing.JFrame {
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    /**
     * Creates new form Company
     */
    public Company() {
        initComponents();
        SelectComp ();
    }
    
    public void SelectComp () {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekdb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM CompanyTbl");
            CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CompId = new javax.swing.JTextField();
        CompName = new javax.swing.JTextField();
        CompAdd = new javax.swing.JTextField();
        CompPhone = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        CompExp = new javax.swing.JTextField();
        ClearBtn = new javax.swing.JButton();
        pageMedicine = new javax.swing.JLabel();
        pageAgents = new javax.swing.JLabel();
        pageSelling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setText("MANAGE COMPANY");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel14.setText("ID");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel15.setText("NAME");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel16.setText("ADDRESS");

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel18.setText("EXPERIENCE");

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel19.setText("PHONE");

        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        CompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CompanyTable);

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel21.setText("COMPANY LIST");

        CompExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompExpActionPerformed(evt);
            }
        });

        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CompAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                            .addComponent(CompName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CompId, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19)))
                                    .addComponent(AddBtn)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(UpdateBtn)))))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(DeleteBtn)
                                        .addGap(61, 61, 61)
                                        .addComponent(ClearBtn))
                                    .addComponent(CompPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompExp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel21)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CompId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(CompExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CompName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(CompPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CompAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pageMedicine.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        pageMedicine.setText("MEDICINE");
        pageMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pageMedicineMouseClicked(evt);
            }
        });

        pageAgents.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        pageAgents.setText("AGENTS");
        pageAgents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pageAgentsMouseClicked(evt);
            }
        });

        pageSelling.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        pageSelling.setText("SELLING");
        pageSelling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pageSellingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageMedicine)
                    .addComponent(pageAgents)
                    .addComponent(pageSelling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(pageMedicine)
                        .addGap(18, 18, 18)
                        .addComponent(pageAgents)
                        .addGap(18, 18, 18)
                        .addComponent(pageSelling)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CompExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompExpActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekdb", "root", "");
            PreparedStatement add = Con.prepareStatement("insert into CompanyTbl values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(CompId.getText()));
            add.setString(2, CompName.getText());
            add.setString(3, CompAdd.getText());
            add.setInt(4, Integer.valueOf(CompExp.getText()));
            add.setString(5, CompPhone.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Company Successfully Added");
            Con.close();
            SelectComp ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        // TODO add your handling code here:
        if(CompId.getText().isEmpty() || CompName.getText().isEmpty() || CompAdd.getText().isEmpty() || CompExp.getText().isEmpty() || CompPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekdb", "root", "");
                String UpdateQuery = "Update CompanyTbl set CompName = '"+CompName.getText()+"'"+",CompAdd = '"+CompAdd.getText()+"'"+",CompExp = "+CompExp.getText()+""+",CompPhone = '"+CompExp.getText()+"'"+"where CompId = "+CompId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Company Successfully Update");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            SelectComp();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void CompanyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CompanyTable.getModel();
        int Myindex = CompanyTable.getSelectedRow();
        CompId.setText(model.getValueAt(Myindex, 0).toString());
        CompName.setText(model.getValueAt(Myindex, 1).toString());
        CompAdd.setText(model.getValueAt(Myindex, 2).toString());
        CompExp.setText(model.getValueAt(Myindex, 3).toString());
        CompPhone.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_CompanyTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        if(CompId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Company to be delete");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekdb", "root", "");
                String Id = CompId.getText();
                String Query = "Delete from CompanyTbl where CompId="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectComp();
                JOptionPane.showMessageDialog(this, "Company Successfully Deleted");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        // TODO add your handling code here:
        CompId.setText("");
        CompName.setText("");
        CompAdd.setText("");
        CompExp.setText("");
        CompPhone.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void pageMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageMedicineMouseClicked
        // TODO add your handling code here:
        new Medicine ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pageMedicineMouseClicked

    private void pageAgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageAgentsMouseClicked
        // TODO add your handling code here:
        new Agents ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pageAgentsMouseClicked

    private void pageSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageSellingMouseClicked
        // TODO add your handling code here:
        new Selling ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pageSellingMouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField CompAdd;
    private javax.swing.JTextField CompExp;
    private javax.swing.JTextField CompId;
    private javax.swing.JTextField CompName;
    private javax.swing.JTextField CompPhone;
    private javax.swing.JTable CompanyTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pageAgents;
    private javax.swing.JLabel pageMedicine;
    private javax.swing.JLabel pageSelling;
    // End of variables declaration//GEN-END:variables
}
