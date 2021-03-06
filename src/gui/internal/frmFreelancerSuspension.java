/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui.internal;

import entities.*;
import gui.main.iWindow;
import iRecord.Controller.ArtistManager;
import iRecord.Controller.FreelancerManager;
import java.awt.Color;
import java.util.Date;

/**
 *
 * @author nisan
 */
public class frmFreelancerSuspension extends javax.swing.JInternalFrame {
    private Freelancer f = null;
    private boolean status = true;
    
    /**
     * Creates new form frmCreateSession
     */
    public frmFreelancerSuspension() {
        initComponents();
        
        init();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        pnlAdd = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblArtistID = new javax.swing.JLabel();
        lblStageName = new javax.swing.JLabel();
        tfArtistId = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblStageName1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnSuspend = new javax.swing.JButton();
        btnActivate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblGen = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,0));
        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Freelancer suspeinsion window");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 0, 360, 30);

        pnlAdd.setBackground(new Color(255,255,255,40));
        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Artist stageName");
        pnlAdd.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 170, -1));

        lblArtistID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArtistID.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistID.setText("Freelancer id");
        pnlAdd.add(lblArtistID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblStageName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStageName.setForeground(new java.awt.Color(255, 255, 255));
        lblStageName.setText("Stage Name");
        pnlAdd.add(lblStageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tfArtistId.setText("Enter freelancer  id");
        tfArtistId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfArtistIdFocusGained(evt);
            }
        });
        pnlAdd.add(tfArtistId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 190, -1));

        lblNameError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 290, 20));

        lblStageName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStageName1.setForeground(new java.awt.Color(255, 255, 255));
        lblStageName1.setText("Status");
        pnlAdd.add(lblStageName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Active / inActive");
        pnlAdd.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, -1));

        btnSuspend.setText("Suspend");
        btnSuspend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuspendMouseClicked(evt);
            }
        });
        pnlAdd.add(btnSuspend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, -1));

        btnActivate.setText("Activate");
        btnActivate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActivateMouseClicked(evt);
            }
        });
        pnlAdd.add(btnActivate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 90, -1));

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        pnlAdd.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        getContentPane().add(pnlAdd);
        pnlAdd.setBounds(0, 40, 780, 160);

        lblGen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblGen.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblGen);
        lblGen.setBounds(10, 220, 380, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfArtistIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfArtistIdFocusGained
        if (tfArtistId.getText().equals("Enter freelancer  id"))
            tfArtistId.setText("");
    }//GEN-LAST:event_tfArtistIdFocusGained

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //import artist data
        String id = tfArtistId.getText();
        f = FreelancerManager.getFreelancer(id);
        
        if (f == null){
            lblNameError.setText("Freelancer was not found");
            updateWin();
            return;
        }
        
        //show artist data
        lblName.setText(f.getStageName());
        
        if (f.getStatus() == 1){
            lblStatus.setText("Active");
        }
        else if (f.getStatus() == 0){
            lblStatus.setText("inActive");
        }
        
        lblNameError.setText("");
        lblGen.setForeground(Color.GREEN);
        updateWin();
        return;
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSuspendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuspendMouseClicked
        if (f == null) return;
        
        FreelancerManager.updateStatus(f.getID(), 0);
        
        f = FreelancerManager.getFreelancer(f.getID());
        
        //update artist data
        lblName.setText(f.getStageName());

        if (f.getStatus() == 1){
            lblStatus.setText("Active");
        }
        else if (f.getStatus() == 0){
            lblStatus.setText("inActive");
        }
        
        lblGen.setForeground(Color.GREEN);
        lblGen.setText("Freelancer state was changed");
        updateWin();
        return;
        
        
    }//GEN-LAST:event_btnSuspendMouseClicked

    private void btnActivateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivateMouseClicked
        if (f == null) return;
        
        FreelancerManager.updateStatus(f.getID(), 1);
        
        f = FreelancerManager.getFreelancer(f.getID());
        
        //update artist data
        lblName.setText(f.getStageName());
        
        if (f.getStatus() == 1){
            lblStatus.setText("Active");
        }
        else if (f.getStatus() == 0){
            lblStatus.setText("inActive");
        }
        
        updateWin();
        return;
        
    }//GEN-LAST:event_btnActivateMouseClicked
                                        
    private void init(){
        
    }
   
    
    public void updateWin(){
        
        iWindow.update();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivate;
    private javax.swing.JButton btnSuspend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lblArtistID;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblStageName;
    private javax.swing.JLabel lblStageName1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JTextField tfArtistId;
    // End of variables declaration//GEN-END:variables
}
