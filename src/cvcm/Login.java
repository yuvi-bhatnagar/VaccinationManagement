/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcm;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Anshul
 */
public class Login extends javax.swing.JFrame {
    ConnectionClass cobj=new ConnectionClass();
    PreparedStatement pst;
    ResultSet rst;
    boolean uppercase=false,lowercase=false,symbole=false,digit=false;
    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unjTextField1 = new javax.swing.JTextField();
        pwjPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        errjLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvcm/resources/resources/Users-Name-icon (1).png"))); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvcm/resources/resources/Security-Password-2-icon.png"))); // NOI18N
        jLabel2.setText("Password");

        unjTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unjTextField1KeyPressed(evt);
            }
        });

        pwjPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwjPasswordField1KeyPressed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        errjLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errjLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pwjPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(unjTextField1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(unjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwjPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errjLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cobj.connect();
        
        
        if(unjTextField1.getText().equals(""))
            errjLabel3.setText("Enter usernme");
        else
            if(pwjPasswordField1.getText().equals(""))
                errjLabel3.setText("Enter Password");
            else
            if(pwjPasswordField1.getText().length()<8)
            {
                errjLabel3.setText("Password Format Incorrect");
            }
            else
                
             
            {
            
        try{
        pst=cobj.con.prepareStatement("select* from tbLogin where  UserName=? and Password=? ");
        pst.setString(1, unjTextField1.getText());
        pst.setString(2, pwjPasswordField1.getText());
        rst=pst.executeQuery();
        if(rst.next())
        {
            errjLabel3.setText("Login Successfully");
            MenuFrame mf=new MenuFrame();
            mf.setVisible(true);
            mf.setTitle("Menu");
            this.dispose();
            unjTextField1.setText("");
            pwjPasswordField1.setText("");
         
        }
        else
        {
            LoginFailed lf=new LoginFailed();
            lf.setVisible(true);
            lf.setTitle("Login Failed");
            lf.setLocation(300, 300);
            this.setVisible(false);
        }
        }
        catch(Exception ex)
        {
            System.out.println("Error in login"+ex);
        }
        cobj.disconnect();}
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
            pwjPasswordField1.setEchoChar((char)0);
        else
            pwjPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void unjTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unjTextField1KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            pwjPasswordField1.requestFocus();
        String name=unjTextField1.getText();
      
        char c=evt.getKeyChar();
        errjLabel3.setText("");
        if(evt.getKeyChar()>='A' && evt.getKeyChar()<='Z')
        {
          unjTextField1.setEditable(true);
       }
        else
        if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z')
        {
            unjTextField1.setEditable(true);
            
        }
        
        else
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                unjTextField1.setEditable(false);
                errjLabel3.setText("Check your Username");
            }
       else
             if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_ENTER||evt.getExtendedKeyCode()==KeyEvent.VK_CAPS_LOCK||evt.getExtendedKeyCode()==KeyEvent.VK_SHIFT) 
                
             unjTextField1.setEditable(true);
             else
                 {
                unjTextField1.setEditable(false);
                errjLabel3.setText("Check your Username");
            }
    }//GEN-LAST:event_unjTextField1KeyPressed

    private void pwjPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwjPasswordField1KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            jButton1.requestFocus();
          
        String name=pwjPasswordField1.getText();
      
        char c=evt.getKeyChar();
        errjLabel3.setText("");
        
        
        
        if(evt.getKeyChar()>='A' && evt.getKeyChar()<='Z')
        {
          pwjPasswordField1.setEditable(true);
          uppercase=true;
       }
        else
        if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z')
        {
            pwjPasswordField1.setEditable(true);
            lowercase=true;
        }
        
        else
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                pwjPasswordField1.setEditable(true);
                digit=true;
            }
       else
             if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE||evt.getExtendedKeyCode()==KeyEvent.VK_ENTER||evt.getExtendedKeyCode()==KeyEvent.VK_SHIFT||evt.getExtendedKeyCode()==KeyEvent.VK_CAPS_LOCK) 
             {
             pwjPasswordField1.setEditable(true);
             
             }
             else
                 if(evt.getExtendedKeyCode()==KeyEvent.VK_DOLLAR)
                 {
                pwjPasswordField1.setEditable(false);
                symbole=true;
                  
                 }
        else
                     if(uppercase==true&&lowercase==true&&digit==true&&symbole==true)
                         errjLabel3.setText("Strong Password");
        else
                     errjLabel3.setText("Password Format Incooect");
          
    
    }//GEN-LAST:event_pwjPasswordField1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        
        cobj.connect();
        if(unjTextField1.getText().equals(""))
            errjLabel3.setText("Enter usernme");
        else
            if(pwjPasswordField1.getText().equals(""))
                errjLabel3.setText("Enter Password");
            else{
        try{
        pst=cobj.con.prepareStatement("select* from tbLogin where UserName=? and Password=? ");
        pst.setString(1, unjTextField1.getText());
        pst.setString(2, pwjPasswordField1.getText());
        rst=pst.executeQuery();
        if(rst.next())
        {
            errjLabel3.setText("login Successfully");
            MenuFrame mf=new MenuFrame();
            mf.setVisible(true);
            mf.setTitle("Menu");
            this.dispose();
            unjTextField1.setText("");
            pwjPasswordField1.setText("");
         
        }
        else
        {
            LoginFailed lf=new LoginFailed();
            lf.setVisible(true);
            lf.setTitle("Login Failed");
            this.setVisible(false);
        }
        }
        catch(Exception ex)
        {
            System.out.println("error in login"+ex);
        }
        cobj.disconnect();}
       
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        unjTextField1.setText("");
        pwjPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login l=new Login();
                l.setVisible(true);
                l.setTitle("Login");
                l.setLocation(300,300);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errjLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pwjPasswordField1;
    private javax.swing.JTextField unjTextField1;
    // End of variables declaration//GEN-END:variables
}
