/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

/**
 *
 * @author yaSaSVi
 */
public class CustomerDetails extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtCustName = new javax.swing.JTextField();
        spinCapacity = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radTable1 = new javax.swing.JRadioButton();
        radTable2 = new javax.swing.JRadioButton();
        radTable3 = new javax.swing.JRadioButton();
        radTable4 = new javax.swing.JRadioButton();
        butSubmit = new javax.swing.JButton();
        txtAllocatedtable = new javax.swing.JTextField();

        txtCustName.setText("Enter name");
        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });

        spinCapacity.setAutoscrolls(true);

        jLabel1.setText("Enter No.of People");

        jLabel2.setText("Hosts Allocates table");

        buttonGroup1.add(radTable1);
        radTable1.setText("Table1");
        radTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTable1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radTable2);
        radTable2.setText("Table2");
        radTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTable2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radTable3);
        radTable3.setText("Table3");
        radTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTable3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radTable4);
        radTable4.setText("Table4");
        radTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTable4ActionPerformed(evt);
            }
        });

        butSubmit.setText("Submit");
        butSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSubmitActionPerformed(evt);
            }
        });

        txtAllocatedtable.setText("Allocated Table");
        txtAllocatedtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllocatedtableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(spinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(butSubmit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radTable2)
                                .addComponent(radTable1)
                                .addComponent(radTable4)
                                .addComponent(radTable3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAllocatedtable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(radTable1)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radTable2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTable3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radTable4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSubmit)
                    .addComponent(txtAllocatedtable, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
        // TODO add your handling code here:
        String s1=txtCustName.getText(); 
        System.out.println(s1);
    }//GEN-LAST:event_txtCustNameActionPerformed

    private void radTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTable1ActionPerformed
        // TODO add your handling code here:
        txtAllocatedtable.setText("Table1");
    }//GEN-LAST:event_radTable1ActionPerformed

    private void radTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTable2ActionPerformed
        // TODO add your handling code here:
        txtAllocatedtable.setText("Table2");
    }//GEN-LAST:event_radTable2ActionPerformed

    private void radTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTable3ActionPerformed
        // TODO add your handling code here:
        txtAllocatedtable.setText("Table3");
    }//GEN-LAST:event_radTable3ActionPerformed

    private void radTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTable4ActionPerformed
        // TODO add your handling code here:
        txtAllocatedtable.setText("Table4");
    }//GEN-LAST:event_radTable4ActionPerformed

    private void butSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSubmitActionPerformed
        // TODO add your handling code here:
       String s=txtAllocatedtable.getText();
        
        String custName =txtCustName.getText();
        new manager().setVisible(true);
        
       
    }//GEN-LAST:event_butSubmitActionPerformed

    private void txtAllocatedtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllocatedtableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllocatedtableActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radTable1;
    private javax.swing.JRadioButton radTable2;
    private javax.swing.JRadioButton radTable3;
    private javax.swing.JRadioButton radTable4;
    private javax.swing.JSpinner spinCapacity;
    private javax.swing.JTextField txtAllocatedtable;
    private javax.swing.JTextField txtCustName;
    // End of variables declaration//GEN-END:variables
}
