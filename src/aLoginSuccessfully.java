


public class aLoginSuccessfully extends javax.swing.JFrame {

    
    public aLoginSuccessfully() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searcEmployee = new javax.swing.JButton();
        givePay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoutAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        searcEmployee.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searcEmployee.setText("CHECK/DELETE EMPLOYEE");
        searcEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(searcEmployee);
        searcEmployee.setBounds(30, 200, 180, 60);

        givePay.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        givePay.setText("GIVE PAY");
        jPanel1.add(givePay);
        givePay.setBounds(310, 200, 180, 60);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, -1, 530, 80);

        logoutAdmin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        logoutAdmin.setText("LOG OUT");
        logoutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutAdminActionPerformed(evt);
            }
        });
        jPanel1.add(logoutAdmin);
        logoutAdmin.setBounds(190, 280, 140, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("ADMIN PANEL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 80, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutAdminActionPerformed

    private void searcEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searcEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(aLoginSuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aLoginSuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aLoginSuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aLoginSuccessfully.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aLoginSuccessfully().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton givePay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutAdmin;
    private javax.swing.JButton searcEmployee;
    // End of variables declaration//GEN-END:variables
}
