/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class CertificateReport extends javax.swing.JFrame {
ConnectionClass cobj=new ConnectionClass();
    PreparedStatement pst;
    ResultSet rst;
    JTable table;
    JScrollPane pane;
    DefaultTableModel model;
    /**
     * Creates new form CertificateReport
     */
    public CertificateReport() {
        initComponents();
        model=new DefaultTableModel();
        model.addColumn("Certificate Number");
        model.addColumn("Name");
        model.addColumn("Father's Name");
        model.addColumn("Address");
        model.addColumn("Age");
        model.addColumn("Gender");
        model.addColumn("Phone Number");
        model.addColumn("Aadhar Number");
        model.addColumn("Medicine Name");
        model.addColumn("Address");
       model.addColumn("Dosage Number");
        
        table= new JTable(model);
        pane= new JScrollPane(table);
        pane.setBounds(100,200,1150,400);
        add(pane);
        cobj.connect();
        int j=0;
        try
        {
            pst=cobj.con.prepareStatement("SELECT        dbo.tbCertificate.CertificateNo,"
                    + " dbo.tbCitizen.Name, dbo.tbCitizen.FName, dbo.tbCitizen.Age, dbo.tbCitizen.Gender,"
                    + " dbo.tbCitizen.Phone, dbo.tbCitizen.AadharNo, dbo.tbMedicine.MedicineName,"
                    + " dbo.tbCenter.Address, \n" +
"                         dbo.tbCitizen.Address AS Expr1, dbo.tbDosage.DosageNo\n" +
"FROM            dbo.tbDosage INNER JOIN\n" +
"                         dbo.tbCitizen ON dbo.tbDosage.CitizenId = dbo.tbCitizen.CitizenId INNER JOIN\n" +
"                         dbo.tbMedicine ON dbo.tbDosage.MedicineId = dbo.tbMedicine.MedicineId INNER JOIN\n" +
"                         dbo.tbCenter ON dbo.tbDosage.CenterId = dbo.tbCenter.CenterId CROSS JOIN\n" +
"                         dbo.tbCertificate");
            rst=pst.executeQuery();
            while(rst.next()){
                model.insertRow(model.getRowCount(), new Object[]{rst.getString("CertificateNo"),rst.getString("Name"),
                    rst.getString("FName"),rst.getString("Address"),rst.getString("Age"),rst.getString("Gender"),rst.getString("Phone"),rst.getString("AadharNo"),
                    rst.getString("MedicineName"),rst.getString("Address"),rst.getString("DosageNo")});
                j++;
        }
        jLabel3.setText("Total Number of Certified Citizen" +j);
        }
        catch(Exception ex)
        {
            System.out.println("error in table");
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Aadhar Number");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(678, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(int index=model.getRowCount()-1;index>=0;index--)
             model.removeRow(index);
       if(jTextField1.getText().length()!=12){
            jLabel2.setText("Invalid Aadhar Number");
            jLabel3.setText("Nothing is searched");
       }
        else
        {
            int i=0;
            cobj.connect();
            try
            {
               pst=cobj.con.prepareStatement("SELECT        dbo.tbCertificate.CertificateNo, dbo.tbCitizen.Name, dbo.tbCitizen.FName, dbo.tbCitizen.Age, dbo.tbCitizen.Gender, dbo.tbCitizen.Phone, dbo.tbCitizen.AadharNo, dbo.tbMedicine.MedicineName, dbo.tbCenter.Address, \n" +
"                         dbo.tbCitizen.Address AS Expr1, dbo.tbDosage.DosageNo\n" +
"FROM            dbo.tbDosage INNER JOIN\n" +
"                         dbo.tbCitizen ON dbo.tbDosage.CitizenId = dbo.tbCitizen.CitizenId INNER JOIN\n" +
"                         dbo.tbMedicine ON dbo.tbDosage.MedicineId = dbo.tbMedicine.MedicineId INNER JOIN\n" +
"                         dbo.tbCenter ON dbo.tbDosage.CenterId = dbo.tbCenter.CenterId CROSS JOIN\n" +
"                         dbo.tbCertificate where AadharNo=?");
               pst.setString(1, jTextField1.getText());
               rst=pst.executeQuery();
               while(rst.next())
               {
                   model.insertRow(model.getRowCount(), new Object[]{rst.getString("CertificateNo"),rst.getString("Name"),
                    rst.getString("FName"),rst.getString("Address"),rst.getString("Age"),rst.getString("Gender"),rst.getString("Phone"),rst.getString("AadharNo"),
                    rst.getString("MedicineName"),rst.getString("Address"),rst.getString("DosageNo")});
                   i++;
               }
               jLabel3.setText("Number of Certified Citizen"+i);
            }
            catch(Exception ex)
            {
                System.out.println("error in search"+ex);
            }
            cobj.disconnect();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CertificateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CertificateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CertificateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CertificateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CertificateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
