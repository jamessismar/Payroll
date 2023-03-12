
public class AdminSignUp extends javax.swing.JFrame {

    
    public AdminSignUp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textGender = new javax.swing.JTextField();
        newAdminUser = new javax.swing.JTextField();
        newAdminPinCode = new javax.swing.JTextField();
        ConfirmPinCode = new javax.swing.JTextField();
        textFname = new javax.swing.JTextField();
        textLname = new javax.swing.JTextField();
        createAdminAccount = new javax.swing.JButton();
        adminSignUpBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("LAST NAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 320, 90, 19);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 80);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("SIGN UP FOR ADMINISTRATOR ACCOUNT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 280, 19);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("USERNAME :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 200, 80, 19);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("PINCODE :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 230, 70, 19);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("COMFIRM PIN :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 260, 110, 19);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("GENDER :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 350, 90, 19);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("FIRST NAME :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 290, 90, 19);

        textGender.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(textGender);
        textGender.setBounds(130, 350, 170, 22);

        newAdminUser.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        newAdminUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newAdminUser);
        newAdminUser.setBounds(130, 200, 170, 22);

        newAdminPinCode.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        newAdminPinCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(newAdminPinCode);
        newAdminPinCode.setBounds(130, 230, 170, 22);

        ConfirmPinCode.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ConfirmPinCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ConfirmPinCode);
        ConfirmPinCode.setBounds(130, 260, 170, 22);

        textFname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textFname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(textFname);
        textFname.setBounds(130, 290, 170, 22);

        textLname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textLname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(textLname);
        textLname.setBounds(130, 320, 170, 22);

        createAdminAccount.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        createAdminAccount.setText("CREATE ACCOUNT");
        createAdminAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminAccountActionPerformed(evt);
            }
        });
        jPanel1.add(createAdminAccount);
        createAdminAccount.setBounds(160, 400, 140, 23);

        adminSignUpBack.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        adminSignUpBack.setText("BACK");
        adminSignUpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSignUpBackActionPerformed(evt);
            }
        });
        jPanel1.add(adminSignUpBack);
        adminSignUpBack.setBounds(50, 400, 72, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAdminAccountActionPerformed

    private void adminSignUpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSignUpBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSignUpBackActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmPinCode;
    private javax.swing.JButton adminSignUpBack;
    private javax.swing.JButton createAdminAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField newAdminPinCode;
    private javax.swing.JTextField newAdminUser;
    private javax.swing.JTextField textFname;
    private javax.swing.JTextField textGender;
    private javax.swing.JTextField textLname;
    // End of variables declaration//GEN-END:variables
}
