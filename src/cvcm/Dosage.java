package cvcm;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anshul
 */
public class Dosage extends javax.swing.JFrame {
ConnectionClass cobj=new ConnectionClass();
    PreparedStatement pst;
     ResultSet rst;
     long mid[],cid[],citizenid[],did;
    /**
     * Creates new form Dosage
     */
    public Dosage() {
        initComponents();
        mid = new long[10];
        cid= new long[20];
        citizenid=new long[20];
        
        int index=0;
        cobj.connect();
        try
        {
           pst=cobj.con.prepareStatement("select CenterId, Address+'-'+City from tbCenter ");
           rst=pst.executeQuery();
           while(rst.next())
           {
               cid[index]=rst.getLong(1);
               index++;
               cidjComboBox1.addItem(rst.getString(2));
           }
               
        }
        catch(Exception ex)
        {
           System.out.print("error in populting combo box"+ex);
        }
        cobj.disconnect();
        
        cobj.connect();
        try
        {
            index=0;
           pst=cobj.con.prepareStatement("select MedicineId, MedicineName+'-'+CompanyName from tbMedicine ");
           rst=pst.executeQuery();
           while(rst.next())
           {
               mid[index]=rst.getLong(1);
               index++;
               midjComboBox3.addItem(rst.getString(2));
           }
               
        }
        catch(Exception ex)
        {
           System.out.print("error in populting combo box"+ex);
        }
        cobj.disconnect();
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cidjComboBox1 = new javax.swing.JComboBox<>();
        midjComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errjLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        d1jTextField1 = new javax.swing.JTextField();
        ndjTextField2 = new javax.swing.JTextField();
        d2jTextField3 = new javax.swing.JTextField();
        t2jTextField4 = new javax.swing.JTextField();
        t1jTextField5 = new javax.swing.JTextField();
        cidjTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        v1jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        v2jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Selected Center");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter Citizen Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date Of Vaccination1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Medicine Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Next Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Time1");

        cidjComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidjComboBox1KeyPressed(evt);
            }
        });

        midjComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                midjComboBox3KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Date of Vaccination2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Time2");

        errjLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        d1jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                d1jTextField1KeyPressed(evt);
            }
        });

        ndjTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ndjTextField2KeyPressed(evt);
            }
        });

        d2jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2jTextField3ActionPerformed(evt);
            }
        });
        d2jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                d2jTextField3KeyPressed(evt);
            }
        });

        t2jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2jTextField4KeyPressed(evt);
            }
        });

        t1jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1jTextField5ActionPerformed(evt);
            }
        });
        t1jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1jTextField5KeyPressed(evt);
            }
        });

        cidjTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidjTextField1KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Vaccination 1 given by");

        v1jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                v1jTextField1KeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Vaccination 2 Given by");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Dosage Number");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Dose No.", "Dose 1", "Dose 2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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
                            .addComponent(errjLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t2jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d2jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ndjTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v2jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(midjComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cidjTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(d1jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cidjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cidjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(midjComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v1jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(t1jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ndjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d2jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t2jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(v2jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(errjLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1jTextField5ActionPerformed

    private void d2jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(d1jTextField1.getText().equals(""))
            errjLabel9.setText("enter date of vaccination");
        else 
            if(t1jTextField5.getText().equals(""))
                errjLabel9.setText("enter time");
        else
                if(ndjTextField2.getText().equals(""))
                    errjLabel9.setText("enter next date");
        else
                    
                        if(v1jTextField1.getText().equals(""))
                            errjLabel9.setText("Enter name of ");
        else
                {
                    cobj.connect();
                    try
                    {
                      pst=cobj.con.prepareCall("{call prcinsertdosage(?,?,?,?,?,?,?,?,?,?,?)}");
                      pst.setLong(1,cid[cidjComboBox1.getSelectedIndex()]);
                      pst.setString(2, cidjTextField1.getText());
                      pst.setLong(3, mid[midjComboBox3.getSelectedIndex()]);
                      pst.setString(4, jComboBox1.getSelectedItem().toString());
                      pst.setString(5, d1jTextField1.getText());
                      pst.setString(6, v1jTextField1.getText().toUpperCase());
                      pst.setString(7, t1jTextField5.getText());
                      pst.setString(8, ndjTextField2.getText());
                      pst.setString(9, d2jTextField3.getText());
                      pst.setString(10, t2jTextField4.getText());
                      pst.setString(11, v2jTextField2.getText().toUpperCase());
                      if(pst.execute()==false)
                          if(pst.getUpdateCount()>0)
                          {
                              errjLabel9.setText("Record Save");
                              d1jTextField1.setText("");
                              t1jTextField5.setText("");
                              t2jTextField4.setText("");
                              d2jTextField3.setText("");
                              ndjTextField2.setText("");
                              v1jTextField1.setText("");
                              v2jTextField2.setText("");
                              
                          }
                    }
                    catch(Exception ex)
                    {
                       System.out.print("error in save"+ex);
                    }
                    cobj.disconnect();
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
                {
                    cobj.connect();
                    try
                    {
                      pst=cobj.con.prepareCall("{call prcupdatedoasage(?,?,?,?,?,?,?,?,?,?,?,?)}");
                      pst.setLong(1,did);
                      pst.setLong(2,cid[cidjComboBox1.getSelectedIndex()]);
                      pst.setString(3, cidjTextField1.getText());
                      pst.setLong(4, mid[midjComboBox3.getSelectedIndex()]);
                      pst.setString(5, jComboBox1.getSelectedItem().toString());
                      pst.setString(6, d1jTextField1.getText());
                      pst.setString(7, v1jTextField1.getText().toUpperCase());
                      pst.setString(8, t1jTextField5.getText());
                      pst.setString(9, ndjTextField2.getText());
                      pst.setString(10, d2jTextField3.getText());
                      pst.setString(11, t2jTextField4.getText());
                      pst.setString(12, v2jTextField2.getText().toUpperCase());
                      if(pst.execute()==false)
                          if(pst.getUpdateCount()>0)
                          {
                              errjLabel9.setText("record updated");
                              d1jTextField1.setText("");
                              t1jTextField5.setText("");
                              t2jTextField4.setText("");
                              d2jTextField3.setText("");
                              ndjTextField2.setText("");
                              v1jTextField1.setText("");
                              v2jTextField2.setText("");
                              
                          }
                    }
                    catch(Exception ex)
                    {
                       System.out.print("error in update"+ex);
                    }
                    cobj.disconnect();
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        errjLabel9.setText("");
        d1jTextField1.setText("");
        d2jTextField3.setText("");
        t1jTextField5.setText("");
        t2jTextField4.setText("");
        ndjTextField2.setText("");
        cidjTextField1.setText("");
        v1jTextField1.setText("");
        v2jTextField2.setText("");
        v1jTextField1.setEnabled(true);
        v2jTextField2.setEnabled(true);
        d1jTextField1.setEnabled(true);
        d2jTextField3.setEnabled(true);
        t1jTextField5.setEnabled(true);
        t2jTextField4.setEnabled(true);
        ndjTextField2.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       if(cidjTextField1.getText().equals(""))
           errjLabel9.setText("Enter Citizen Id");
            else
       
                    cobj.connect();
                    try
                    {
                      pst=cobj.con.prepareStatement("select * from tbDosage where CitizenId=? ");
                      pst.setString(1, cidjTextField1.getText());
                      
                      rst=pst.executeQuery();
                      if(rst.next())
                          {
                              errjLabel9.setText("Record found");
                               did=rst.getLong(1);
                               cidjComboBox1.setSelectedIndex(new ArraySearch().arraysearch(cid,rst.getLong(2)));
                              cidjTextField1.setText(rst.getString(3));
                              midjComboBox3.setSelectedIndex(new ArraySearch().arraysearch(mid,rst.getLong(4)));
                             jComboBox1.setSelectedItem(rst.getString(5));
                              d1jTextField1.setText(rst.getString(6));
                              v1jTextField1.setText(rst.getString(7).toUpperCase());
                              t1jTextField5.setText(rst.getString(8));
                              d2jTextField3.setText(rst.getString(9));
                              ndjTextField2.setText(rst.getString(10));
                              t2jTextField4.setText(rst.getString(11));
                              v2jTextField2.setText(rst.getString(12).toUpperCase());
                         }
                      else
                      {
                          errjLabel9.setText("Record does not exits");
                          d1jTextField1.setText("");
                          t1jTextField5.setText("");
                          d2jTextField3.setText("");
                          t2jTextField4.setText("");
                          ndjTextField2.setText("");
                        v1jTextField1.setText("");
                        v2jTextField2.setText("");
                      }
                    }
                    catch(Exception ex)
                    {
                       System.out.print("error in search"+ex);
                    }
                    cobj.disconnect();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cidjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidjComboBox1KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            cidjTextField1.requestFocus();
    }//GEN-LAST:event_cidjComboBox1KeyPressed

    private void midjComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midjComboBox3KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            d1jTextField1.requestFocus();
    }//GEN-LAST:event_midjComboBox3KeyPressed

    private void d1jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1jTextField1KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            t1jTextField5.requestFocus();
    }//GEN-LAST:event_d1jTextField1KeyPressed

    private void ndjTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ndjTextField2KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
           d2jTextField3.requestFocus();
    }//GEN-LAST:event_ndjTextField2KeyPressed

    private void t1jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1jTextField5KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            ndjTextField2.requestFocus();
    }//GEN-LAST:event_t1jTextField5KeyPressed

    private void d2jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2jTextField3KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            t2jTextField4.requestFocus();
    }//GEN-LAST:event_d2jTextField3KeyPressed

    private void t2jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2jTextField4KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
            jButton1.requestFocus();
    }//GEN-LAST:event_t2jTextField4KeyPressed

    private void cidjTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidjTextField1KeyPressed
        // TODO add your handling code here:
         String ph_num=cidjTextField1.getText();
      int length= ph_num.length();
        char c=evt.getKeyChar();
        errjLabel9.setText("");
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
        
        if(length<12)
                cidjTextField1.setEditable(true);
        
        else
        {
            cidjTextField1.setEditable(false);
            errjLabel9.setText("check your  AAdhar number");
        }
        }
        else
        {
            
         if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE||evt.getExtendedKeyCode()==KeyEvent.VK_ENTER)     
             cidjTextField1.setEditable(true);
             
         else{
            
             cidjTextField1.setEditable(false);
        
        errjLabel9.setText("check your Aadhar ");
                }}
    }//GEN-LAST:event_cidjTextField1KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
                          if(jComboBox1.getSelectedItem().equals("Dose 1"))
                          {
                              
                        d2jTextField3.setEnabled(false);
                      t2jTextField4.setEnabled(false);
                      d1jTextField1.setEnabled(true);
                      v1jTextField1.setEnabled(true);
                      ndjTextField2.setEnabled(true);
                      t1jTextField5.setEnabled(true);
                      v2jTextField2.setEnabled(false);
                          }
        else
                          if(jComboBox1.getSelectedItem().equals("Dose 2")){
                           v1jTextField1.setEnabled(false);
                           t1jTextField5.setEnabled(false);
                           d1jTextField1.setEnabled(false);
                           ndjTextField2.setEnabled(false);
                           v2jTextField2.setEnabled(true);
                           d2jTextField3.setEnabled(true);
                           t2jTextField4.setEnabled(true);
                          }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void v1jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v1jTextField1KeyPressed
        // TODO add your handling code here:
        String name=v1jTextField1.getText();
      
        char c=evt.getKeyChar();
        errjLabel9.setText("");
        if(evt.getKeyChar()>='A' && evt.getKeyChar()<='Z')
        {
            v1jTextField1.setEditable(true);
        }
        else
       if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z')
        {
            v1jTextField1.setEditable(true);
            
        }
        
        else
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                v1jTextField1.setEditable(false);
                errjLabel9.setText("Check your name");
            }
       
    }//GEN-LAST:event_v1jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(Dosage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dosage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dosage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dosage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dosage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cidjComboBox1;
    private javax.swing.JTextField cidjTextField1;
    private javax.swing.JTextField d1jTextField1;
    private javax.swing.JTextField d2jTextField3;
    private javax.swing.JLabel errjLabel9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> midjComboBox3;
    private javax.swing.JTextField ndjTextField2;
    private javax.swing.JTextField t1jTextField5;
    private javax.swing.JTextField t2jTextField4;
    private javax.swing.JTextField v1jTextField1;
    private javax.swing.JTextField v2jTextField2;
    // End of variables declaration//GEN-END:variables
}
