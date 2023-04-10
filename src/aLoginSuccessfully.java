import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.sql.ResultSet;    
import  java.sql.*;     
import  java.sql.Statement;    
import  javax.swing.JButton;     
import  javax.swing.JScrollPane;    
import  javax.swing.JOptionPane;      


public class aLoginSuccessfully extends javax.swing.JFrame implements ActionListener {

    
    public aLoginSuccessfully() {
        initComponents();
    }
    MainClass main = new MainClass();
   
    private Object [][] query(String name) throws SQLException{
    String sql = "Select * FROM emplyeedata Where account_name LIKE '%"+ name + "%'";
    Connection Conn = main.getConnection();
    Statement stmt = Conn.createStatement();
    
    ResultSet rs = stmt.executeQuery(sql);
    
    int totalRows = 0;
    
    try {
        
    rs = stmt.executeQuery(sql);
    while(rs.next()) {
     totalRows +=1;
     
    }
    }
    catch (Exception e){
    System.err.println(e);
   
    }
   Object [][] data = new Object [totalRows] [6];
   
   try {
    rs = stmt.executeQuery(sql);
    int rowCount = 0;
        while (rs.next()) {
        
        
         int id= rs.getInt("id");
        String employeeName =rs.getString("employee_name");
        String gender =rs.getString("gender");
        String address =rs.getString("address");
        float balance =rs.getFloat("balance");
        String position =rs.getString("employee_position"); 
        
        Object[] row = new Object[]{id, employeeName, gender, address, balance, position};
        data [rowCount] = row;
        rowCount += 1;
        }
   }
        catch (Exception e){
                System.err.println(e);
                }

        return data;
       
        
        
        
        
        
        
        
        
        
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searcEmployee = new javax.swing.JButton();
        givePay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        givePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givePayActionPerformed(evt);
            }
        });
        jPanel1.add(givePay);
        givePay.setBounds(310, 200, 180, 60);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Rural Bank of Bacong,INC.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 10, 460, 50);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("ADMIN LOG:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 60, 110, 20);

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BANK1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, 70, 620, 290);

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
   new pickFrame(). setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutAdminActionPerformed

    private void searcEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcEmployeeActionPerformed
       new CheckDelete(). setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searcEmployeeActionPerformed

    private void givePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givePayActionPerformed
         new givePayment(). setVisible(true);
        this.dispose();
    }//GEN-LAST:event_givePayActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutAdmin;
    private javax.swing.JButton searcEmployee;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
