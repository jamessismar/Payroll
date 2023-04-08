import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.sql.*;
import  java.sql.ResultSet;
import  java.sql.SQLException; 
import  java.sql.Statement;
import  java.util.logging.Level;     
import  java.util.logging.Logger; 
import  javax.swing.JOptionPane; 

public class EmployeeLogin extends javax.swing.JFrame implements ActionListener{

    
    public EmployeeLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        userEmployee = new javax.swing.JTextField();
        employeePinCode = new javax.swing.JTextField();
        backEmployee = new javax.swing.JButton();
        logEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employeee-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, 100));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 100);

        userEmployee.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        userEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(userEmployee);
        userEmployee.setBounds(180, 240, 210, 30);

        employeePinCode.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        employeePinCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(employeePinCode);
        employeePinCode.setBounds(180, 290, 210, 30);

        backEmployee.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        backEmployee.setText("BACK");
        backEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(backEmployee);
        backEmployee.setBounds(420, 240, 90, 30);

        logEmployee.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        logEmployee.setText("LOG IN");
        logEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(logEmployee);
        logEmployee.setBounds(420, 290, 90, 30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER YOUR USERNAME AND PINCODE CORRECTLY");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 190, 340, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("PINCODE :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 290, 80, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("USERNAME :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 240, 90, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PAYROLL(EMPLOYEE)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 110, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEmployeeActionPerformed
         pickFrame pf = new pickFrame();
        pf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backEmployeeActionPerformed
    
    
    MainClass main = new MainClass();
    
    
    
    private void logEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logEmployeeActionPerformed
       String Uname = userEmployee.getText(); 
       String Pword = employeePinCode.getText();
       Connection Conn = main.getConnection();
       try
       {
       int log = 1;
       
       Statement stmt = Conn.createStatement();
       String sql = "Select * from employeedata";
       ResultSet rs = stmt.executeQuery(sql);
       
       while (rs.next()){
       if (rs.getString(3).equals(Uname) && rs.getString(4).equals(Pword)){
       log = 0;
       break;
             }
       }
       if (log == 0)
       {
       dispose();
       new eLoginSuccessfully().setVisible(true);
       }
       else if(employeePinCode.equals("")|| userEmployee.equals("")){
       JOptionPane.showMessageDialog(null,"Please fill up the form before proceeding Thank you!!!");
      
       }
       
       else {
       JOptionPane.showMessageDialog(null,"Log in Failed","COnnection Failed",JOptionPane.ERROR_MESSAGE);
       userEmployee.setText("");
       employeePinCode.setText("");
       }
       
       
       }catch (SQLException ex){
        Logger.getLogger(EmployeeLogin.class.getName()).log(Level.SEVERE,null,ex); 
    }//GEN-LAST:event_logEmployeeActionPerformed
   
    }
    
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
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backEmployee;
    private javax.swing.JTextField employeePinCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logEmployee;
    private javax.swing.JTextField userEmployee;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
