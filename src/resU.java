/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author user
 */
public class resU extends javax.swing.JFrame {

     String userId=null;

    Connection c=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Statement st=null;
   
    /**
     * Creates new form resU
     */
    public resU() {
        initComponents();
//        c=Connector.connect();
        //show();
        
    }
public void close(){
    WindowEvent wclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wclose);
 }
//
// public void show() {
//     
//     try{
//            
//            String query= "select * from restaurant";
//            pst=c.prepareStatement(query);
//            
//            rs=pst.executeQuery();
//            tRes.setModel(DbUtils.resultSetToTableModel(rs));
//            
//        }
//        catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
//        }
//      finally {
//        try{
//            pst.close();
//            rs.close();
//            c.close();
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//     }
// }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        offer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRes = new javax.swing.JTable();
        show = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tUm = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tUo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        rateBox = new javax.swing.JComboBox<String>();
        review = new javax.swing.JTextField();
        RateB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Blo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("             User");

        menu.setText("Show");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        offer.setText("Show");
        offer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offerActionPerformed(evt);
            }
        });

        tRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "res_id", "name", "h_no", "area", "city"
            }
        ));
        tRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tResMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tRes);

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Search Restaurants");

        tUm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "menu_id", "item", "price", "carbohydrate", "protein", "fat", "minerals", "vitamins"
            }
        ));
        jScrollPane2.setViewportView(tUm);

        jLabel3.setText("Restaurants");

        jLabel4.setText("Menu");

        tUo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "offer_id", "description"
            }
        ));
        jScrollPane3.setViewportView(tUo);

        jLabel5.setText("Offers");

        rateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        rateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateBoxActionPerformed(evt);
            }
        });

        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });

        RateB.setText("Rate");
        RateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateBActionPerformed(evt);
            }
        });

        jLabel6.setText("Review");

        Blo.setText("LogOut");
        Blo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(Blo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(show)
                                        .addGap(187, 187, 187)
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(menu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(offer))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(rateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(RateB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(review)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(menu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(offer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RateB))
                .addGap(12, 12, 12)
                .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        
        String s=tRes.getValueAt(tRes.getSelectedRow(), 0).toString();
        
        
        c=Connector.connect();
         
              try{
            
            String query= "select menu_id,item,price,carbohydrate,protein,fat,minerals,vitamins from menu where res_id='"+s+"'";
            pst=c.prepareStatement(query);
            
            rs=pst.executeQuery();
            tUm.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
        }
      finally {
        try{
            pst.close();
            rs.close();
            
            c.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    }//GEN-LAST:event_menuActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
         c=Connector.connect();
         
              try{
            
            String query= "select * from restaurant";
            pst=c.prepareStatement(query);
            
            rs=pst.executeQuery();
            tRes.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
        }
      finally {
        try{
            pst.close();
            rs.close();
            c.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
        
    }//GEN-LAST:event_showActionPerformed

    private void tResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tResMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tResMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String sql="select * from restaurant where name='"+jTextField1.getText()+"'";
            try{
                c=Connector.connect();
                pst=c.prepareStatement(sql);
            
                rs=pst.executeQuery();
                tRes.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Not Found"+ex);
        }
            
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void offerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offerActionPerformed
        // TODO add your handling code here:
        String s=tRes.getValueAt(tRes.getSelectedRow(), 0).toString();

        c=Connector.connect();

        try{
            
            String query= "select offer_id,description from offer where res_id='"+s+"'";
            pst=c.prepareStatement(query);
            
            rs=pst.executeQuery();
            tUo.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
        }
        finally {
            try{
                pst.close();
                rs.close();
                c.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_offerActionPerformed

    private void rateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateBoxActionPerformed

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewActionPerformed

    private void RateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateBActionPerformed
        // TODO add your handling code here:
        
        String s=tRes.getValueAt(tRes.getSelectedRow(), 0).toString();
        int idx=rateBox.getSelectedIndex();
        
        

        c=Connector.connect();
        try{
            st=c.createStatement();
            String query= "insert into ratings(res_id,u_id,rating,review)values('"+s+"','"+userId+"','"+rateBox.getItemAt(idx).toString()+"','"+review.getText().toString()+"');";
            st.executeUpdate(query);
            
           
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
        }
    }//GEN-LAST:event_RateBActionPerformed

    private void BloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloActionPerformed
        // TODO add your handling code here:
        close();
        uP u=new uP();
        u.setVisible(true);
        
    }//GEN-LAST:event_BloActionPerformed

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
            java.util.logging.Logger.getLogger(resU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blo;
    private javax.swing.JButton RateB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton menu;
    private javax.swing.JButton offer;
    private javax.swing.JComboBox<String> rateBox;
    private javax.swing.JTextField review;
    private javax.swing.JButton show;
    private javax.swing.JTable tRes;
    private javax.swing.JTable tUm;
    private javax.swing.JTable tUo;
    // End of variables declaration//GEN-END:variables
}