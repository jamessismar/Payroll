import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import  java.sql.*;   
import  java.util.*;  
import  java.util.logging.Level;     
import  java.util.logging.Logger;  
import javax.swing.table.DefaultTableModel;





public class CheckBalance extends javax.swing.JFrame implements ActionListener,MouseListener {

    
    public CheckBalance() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        position03 = new javax.swing.JTextField();
        id03 = new javax.swing.JTextField();
        name03 = new javax.swing.JTextField();
        balance03 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employeee-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 80));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 540, 80);

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NAME"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 550, 140);

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(430, 460, 90, 30);

        position03.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        position03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(position03);
        position03.setBounds(180, 230, 290, 30);

        id03.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        id03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(id03);
        id03.setBounds(180, 110, 290, 30);

        name03.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        name03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(name03);
        name03.setBounds(180, 150, 290, 30);

        balance03.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        balance03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(balance03);
        balance03.setBounds(180, 190, 290, 30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POSITION:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 240, 70, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE BALANCE :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 190, 20);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 120, 70, 20);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EMPLOYEE NAME :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 110, 20);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BALANCE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 200, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       this.dispose();
       new eLoginSuccessfully().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
    MainClass main = new MainClass();
            
            
            public ArrayList<EmployeeInfo> getEmployeeList(){
     
      
      ArrayList<EmployeeInfo> employeeList = new ArrayList<EmployeeInfo>();
      Connection Conn = main.getConnection();
      String sql ="Select * from employeedata";
      Statement stmt;
      ResultSet rs;
      
      try{
          stmt = Conn.createStatement();
          rs = stmt.executeQuery(sql);
          EmployeeInfo employeeinfo;
          
          while (rs.next()){
              
              employeeinfo = new EmployeeInfo(Integer.parseInt(rs.getString("id")), rs.getString("employeename"), rs.getString("gender"), rs.getString("address"), Double.parseDouble(rs.getString("balance")),rs.getString("employeeposition"));
              employeeList.add(employeeinfo);
          }
          }
      catch(SQLException e){
      
      Logger.getLogger(CheckDelete.class.getName()).log(Level.SEVERE,null,e);
      }
      return employeeList;
  
  }
            
   public void showEmployeeFromTable(){
   ArrayList<EmployeeInfo> list = getEmployeeList();
   DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
   
   model.setRowCount(0);
   Object[] row = new Object[6];
   for (int x = 0 ; x<list.size(); x++){
   
   row[0] = list.get(x).getid();
   row[1] = list.get(x).getemployeeName();
   row[2] = list.get(x).getgender();
   row[3] = list.get(x).getaddress();
   row[4] = list.get(x).getBalance();
   row[5] = list.get(x).getPosition();
   model.addRow(row);
        
   
   } 
   }
   
   public void  ShowItem(int index){
   
   id03.setText(Integer.toString(getEmployeeList().get(index).getid()));   
   name03.setText(getEmployeeList().get(index).getemployeeName());  
   balance03.setText(Double.toString(getEmployeeList().get(index).getBalance()));
   position03.setText(getEmployeeList().get(index).getPosition());   
   
   }         
            
            
            
            
    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeTableMouseClicked

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
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balance03;
    private javax.swing.JButton cancel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField id03;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name03;
    private javax.swing.JTextField position03;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
