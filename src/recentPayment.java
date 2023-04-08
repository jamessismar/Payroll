import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import  java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import  java.sql.SQLException;     
import  java.sql.Statement;
import java .util.ArrayList;
import  java.util.logging.Level;     
import  java.util.logging.Logger;    
import  javax.swing.JOptionPane; 
import  javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

public class recentPayment extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form recentPayment
     */
    public recentPayment() {
        initComponents();
       showEmployeeFromTable();
    }
    
    MainClass main =new MainClass();
    public ArrayList<Payments> getpaymentsList(){
     
      
      ArrayList<Payments> paymentsList = new ArrayList<Payments>();   
   
     Connection Conn = main.getConnection();
      String sql ="Select * from paymentcheck";
      Statement stmt;
      ResultSet rs;
      
      
       try{
          stmt = Conn.createStatement();
          rs = stmt.executeQuery(sql);
          Payments payments;
          
          while (rs.next()){
              
              payments = new Payments(Integer.parseInt(rs.getString("id")), rs.getString("employee_name"),Float.parseFloat (rs.getString("balance")), rs.getString("position"), Float.parseFloat(rs.getString("givepay")),Float.parseFloat(rs.getString("totalbalance")));
              paymentsList.add(payments);
          }
          }
      catch(SQLException e){
      
      Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,e);
      }
      return paymentsList;
  
  }
    
     public void showEmployeeFromTable(){
   ArrayList<Payments> list = getpaymentsList();
   DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
   
   model.setRowCount(0);
   Object[] row = new Object[6];
   for (int x = 0 ; x<list.size(); x++){
   
   row[0] = list.get(x).getid();
   row[1] = list.get(x).getemployee_name();
   row[2] = list.get(x).getbalance();
   row[3] = list.get(x).getposition();
   row[4] = list.get(x).getgivpay();
   row[5] = list.get(x).gettotalbalance();
   model.addRow(row);
        
   
   } 
    
    
    
    
    
    
    
    
    
     }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkbook2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1520, 150));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 140);

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "BALANCE", "POSITION", "GIVEPAY", "TOTAL BALANCE"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 660, 160);

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok);
        ok.setBounds(230, 330, 230, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

   
    public static void main(String args[]) {
       
       
      try{
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
      if ("Nimbus".equals(info.getName())){
      javax.swing.UIManager.setLookAndFeel(info.getClassName());
      break;
      }
      }
      }  
      catch (ClassNotFoundException ex){
       java.util.logging.Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,ex);
      }
      catch (InstantiationException ex){
       java.util.logging.Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,ex);
      }
      catch (IllegalAccessException ex){
       java.util.logging.Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex){
       java.util.logging.Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,ex);
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(recentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recentPayment().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
