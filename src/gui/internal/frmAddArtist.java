/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui.internal;

import Validators.EmailValidator;
import entities.*;
import gui.main.MainGui;
import gui.main.iWindow;
import iRecord.Controller.ArtistManager;
import iRecord.Validators.CharValidator;
import iRecord.utilities.EAuth;
import java.awt.Color;
import java.util.Random;
import iRecord.*;
import gui.main.MainGui;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nisan
 */
public class frmAddArtist extends javax.swing.JInternalFrame {
    private String artistID;
    private String stageName;
    private String Email;
    private String password;
    private boolean HIA = false;
    
    /**
     * Creates new form frmCreateSession
     */
    public frmAddArtist() {
        setTitle("Add Artist Page");
        initComponents();
        
        init();
        
    }
    
    
    public frmAddArtist(String id, String stageName, String email){
        initComponents();
        setTitle("Add Artist Page");
        HIA = true;
        this.artistID = id;
        this.stageName =stageName;
        this.Email = email;
        lblID.setText(id);
        tfEmail.setText(email);
        tfStageName.setText(stageName);
        
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
        lblID = new javax.swing.JLabel();
        lblArtistID = new javax.swing.JLabel();
        lblStageName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPass1 = new javax.swing.JLabel();
        lblPass2 = new javax.swing.JLabel();
        lblMailError = new javax.swing.JLabel();
        tfStageName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lblPass4 = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        Pass1 = new javax.swing.JPasswordField();
        Pass2 = new javax.swing.JPasswordField();
        lblGen = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setBackground(new Color(0,0,0,0));
        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add new artist window");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 0, 360, 30);

        pnlAdd.setBackground(new Color(255,255,255,40));
        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Artist id");
        pnlAdd.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, -1));

        lblArtistID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArtistID.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistID.setText("Artist ID");
        pnlAdd.add(lblArtistID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblStageName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStageName.setForeground(new java.awt.Color(255, 255, 255));
        lblStageName.setText("Stage Name");
        pnlAdd.add(lblStageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        pnlAdd.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblPass1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass1.setForeground(new java.awt.Color(255, 255, 255));
        lblPass1.setText("Password");
        pnlAdd.add(lblPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblPass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass2.setForeground(new java.awt.Color(255, 255, 255));
        lblPass2.setText("Retype Password");
        pnlAdd.add(lblPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblMailError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblMailError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblMailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 390, 20));

        tfStageName.setText("Enter stage name");
        tfStageName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStageNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStageNameFocusLost(evt);
            }
        });
        pnlAdd.add(tfStageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 170, -1));

        tfEmail.setText("Enter Email");
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        pnlAdd.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, -1));

        lblPass4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblPass4.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblPass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 400, 20));

        lblNameError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 390, 20));

        Pass1.setText("jPasswordField1");
        Pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass1FocusLost(evt);
            }
        });
        pnlAdd.add(Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));

        Pass2.setText("jPasswordField2");
        Pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass2FocusLost(evt);
            }
        });
        pnlAdd.add(Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        getContentPane().add(pnlAdd);
        pnlAdd.setBounds(0, 40, 780, 260);

        lblGen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblGen.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblGen);
        lblGen.setBounds(20, 340, 380, 20);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Artist");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(20, 310, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfStageNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStageNameFocusGained
        if (tfStageName.getText().equals("Enter stage name"))
            tfStageName.setText("");
    }//GEN-LAST:event_tfStageNameFocusGained
    
    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        if (tfEmail.getText().equals("Enter Email"))
            tfEmail.setText("");
    }//GEN-LAST:event_tfEmailFocusGained
    
    private void Pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass1FocusGained
        if (Pass1.getText().equals("jPasswordField1"))
            Pass1.setText("");
    }//GEN-LAST:event_Pass1FocusGained
    
    private void Pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass2FocusGained
        if (Pass2.getText().equals("jPasswordField2"))
            Pass2.setText("");
    }//GEN-LAST:event_Pass2FocusGained
        
    private void tfStageNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStageNameFocusLost
        String sn = tfStageName.getText();
        if (sn.length() < 3){
            lblNameError.setText("Name is too short");
            stageName = null;
            updateWin();
            return;
        }
        if (!CharValidator.isWord(sn)){
            lblNameError.setText("Name must contain at least 3 valid letters");
            stageName = null;
            updateWin();
            return;
        }
        
        lblNameError.setText("");
        stageName = tfStageName.getText();
        updateWin();
    }//GEN-LAST:event_tfStageNameFocusLost
    
    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        String mail = tfEmail.getText();
        if (!EmailValidator.validateEmail(mail)){
            lblMailError.setText("Please enter valid email - username@domain.host");
            Email = null;
            updateWin();
            return;
        }
        
        Email = mail;
        lblMailError.setText("");
        updateWin();
        
    }//GEN-LAST:event_tfEmailFocusLost
    
    private void Pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass2FocusLost
        String pass1= Pass1.getText();
        String pass2 = Pass2.getText();
        if (pass1.length() < 4){
            lblPass4.setText("Password must contain at least 4 characters");
            password =null;
            updateWin();
            return;
        }
        
        if (!pass1.equals(pass2)){
            lblPass4.setText("Passwords does not match");
            password =null;
            updateWin();
            return;
        }
        
        lblPass4.setText("");
        password = pass2;
        updateWin();
        
    }//GEN-LAST:event_Pass2FocusLost
    
    private void Pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass1FocusLost
        String pass1= Pass1.getText();
        String pass2 = Pass2.getText();
        if (pass1.length() < 4){
            lblPass4.setText("Password must contain at least 4 characters");
            password =null;
            updateWin();
            return;
        }
        
        if (!pass1.equals(pass2)){
            if (Pass2.getText().equals("jPasswordField2"))
                lblPass4.setText("");
            else{
                lblPass4.setText("Passwords does not match");
            }
            password =null;
            updateWin();
            return;
        }
        
        updateWin();
        
    }//GEN-LAST:event_Pass1FocusLost
    
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (artistID == null || stageName == null || Email == null || password == null){
            lblGen.setText("One or more fields ane missing");
            updateWin();
            return;
        }
        else{
            java.util.Date date = new java.util.Date();
            java.sql.Date dateExpired = new java.sql.Date(date.getTime());
            Artist toAdd = new Artist(artistID, stageName, Email ,password, dateExpired, EAuth.Artist);
            pnlAdd.setVisible(false);
            //System.out.println(ArtistManager.addArtist(toAdd));
            //TODO - FIX THIS IF 
            if (ArtistManager.addArtist(toAdd) > 0){
                lblGen.setForeground(Color.GREEN);
                lblGen.setText("Artist was added succefully");
                btnAdd.hide();
                if (HIA){
                    try {
                        iRecord.setLoggedUser(toAdd);
                        MainGui temp = new MainGui();
                    } catch (SQLException ex) {
                        Logger.getLogger(frmAddArtist.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
                lblGen.setText("Something went wrong");
                btnAdd.hide();
            }

            updateWin();
            return;
        }
         
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void init(){
        createArtistID(); 
    }
    
    /**
     * this method generates random id for artist
     * the generated id is checked by the controller before it's set
     */
    private void createArtistID(){
        Random rand = new Random();
        int num = 0;
        String tempID = null;
        while (true){
            num = rand.nextInt(9999);
            if (num > 1000){
                tempID = "AR"+num;
                
                if (!ArtistManager.isExists(tempID)){
                    artistID = tempID;
                    lblID.setText(tempID);
                    updateWin();
                    return;
                }
            }
        }

    }
    
    public void updateWin(){
        
        iWindow.update();
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass1;
    private javax.swing.JPasswordField Pass2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lblArtistID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMailError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblPass4;
    private javax.swing.JLabel lblStageName;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfStageName;
    // End of variables declaration//GEN-END:variables
}
