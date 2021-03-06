/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui.internal;

import Validators.EmailValidator;
import Validators.PhoneValidator;
import entities.*;
import gui.main.iWindow;
import iRecord.Controller.ArtistManager;
import iRecord.Controller.StudioAndRoomManager;
import iRecord.Validators.CharValidator;
import iRecord.utilities.EAuth;
import java.awt.Color;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author nisan
 */
public class frmAddStudio extends javax.swing.JInternalFrame {
    private int studioID;
    private String studioName;
    private String Email;
    private String address;
    private String phone;
    private String description;
    private String password;
    
    /**
     * Creates new form frmCreateSession
     */
    public frmAddStudio() {
        setTitle("Add Artist Page");
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
        lblID = new javax.swing.JLabel();
        lblStudioID = new javax.swing.JLabel();
        lblStudioName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        lbldesc = new javax.swing.JLabel();
        lblMailError = new javax.swing.JLabel();
        tfStudioName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lblAddrError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        tfaddr = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblPhoneError = new javax.swing.JLabel();
        Pass2 = new javax.swing.JPasswordField();
        Pass1 = new javax.swing.JPasswordField();
        lblPass1 = new javax.swing.JLabel();
        lblPass2 = new javax.swing.JLabel();
        lblPass4 = new javax.swing.JLabel();
        lblGen = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setBackground(new Color(0,0,0,0));
        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add new studio window");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 0, 360, 30);

        pnlAdd.setBackground(new Color(255,255,255,60));
        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Studio ID");
        pnlAdd.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, -1));

        lblStudioID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStudioID.setForeground(new java.awt.Color(255, 255, 255));
        lblStudioID.setText("Studio ID");
        pnlAdd.add(lblStudioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblStudioName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStudioName.setForeground(new java.awt.Color(255, 255, 255));
        lblStudioName.setText("Studio Name");
        pnlAdd.add(lblStudioName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        pnlAdd.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        lblAddr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr.setText("Address");
        pnlAdd.add(lblAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));

        lbldesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldesc.setForeground(new java.awt.Color(255, 255, 255));
        lbldesc.setText("Decription");
        pnlAdd.add(lbldesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblMailError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblMailError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblMailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 390, 20));

        tfStudioName.setText("Enter Studio Name");
        tfStudioName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStudioNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStudioNameFocusLost(evt);
            }
        });
        pnlAdd.add(tfStudioName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 190, -1));

        tfEmail.setText("Enter Email");
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        pnlAdd.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 190, -1));

        lblAddrError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblAddrError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblAddrError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 400, 20));

        lblNameError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 390, 20));

        tfaddr.setText("Enter Address");
        tfaddr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfaddrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfaddrFocusLost(evt);
            }
        });
        pnlAdd.add(tfaddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 190, -1));

        tfphone.setText("Enter Phone Number");
        tfphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfphoneFocusLost(evt);
            }
        });
        pnlAdd.add(tfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, -1));

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone Number");
        pnlAdd.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("You may add a decription to the studio");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        pnlAdd.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 80));

        lblPhoneError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblPhoneError.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblPhoneError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 400, 20));

        Pass2.setText("jPasswordField2");
        Pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass2FocusLost(evt);
            }
        });
        pnlAdd.add(Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, -1));

        Pass1.setText("jPasswordField1");
        Pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass1FocusLost(evt);
            }
        });
        pnlAdd.add(Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        lblPass1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass1.setForeground(new java.awt.Color(255, 255, 255));
        lblPass1.setText("Password");
        pnlAdd.add(lblPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblPass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass2.setForeground(new java.awt.Color(255, 255, 255));
        lblPass2.setText("Retype Password");
        pnlAdd.add(lblPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        lblPass4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblPass4.setForeground(new java.awt.Color(255, 0, 51));
        pnlAdd.add(lblPass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 400, 20));

        getContentPane().add(pnlAdd);
        pnlAdd.setBounds(0, 40, 780, 310);

        lblGen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblGen.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblGen);
        lblGen.setBounds(20, 340, 380, 20);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Studio");
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
        btnAdd.setBounds(10, 370, 100, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfStudioNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudioNameFocusGained
        if (tfStudioName.getText().equals("Enter Studio Name"))
            tfStudioName.setText("");
    }//GEN-LAST:event_tfStudioNameFocusGained
    
    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        if (tfEmail.getText().equals("Enter Email"))
            tfEmail.setText("");
    }//GEN-LAST:event_tfEmailFocusGained
                
    private void tfStudioNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudioNameFocusLost
        String sn = tfStudioName.getText();
        if (sn.length() < 3){
            lblNameError.setText("Name is too short");
            studioName = null;
            updateWin();
            return;
        }
        if (!CharValidator.isWord(sn)){
            lblNameError.setText("Name must contain at least 3 valid letters");
            studioName = null;
            updateWin();
            return;
        }
        
        lblNameError.setText("");
        studioName = tfStudioName.getText();
        updateWin();
    }//GEN-LAST:event_tfStudioNameFocusLost
    
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
            
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        System.out.println(studioName +" "+ Email+" "+ address+" "+ phone+" "+ description);
        if (studioName == null || Email == null|| address == null || phone == null || description == null || password == null){
            lblGen.setText("One or more fields ane missing");
            updateWin();
            return;
        }
        
        else{
            pnlAdd.setVisible(false);
            Studio toAdd = new Studio (studioName, address ,Email , phone, description, studioID, password);
            
            
            if (StudioAndRoomManager.addStudio(toAdd) > 0){
                lblGen.setForeground(Color.GREEN);
                lblGen.setText("Studio was added succefully");
                btnAdd.hide();
            }
            else{
                lblGen.setText("Something went wrong");
                btnAdd.hide();
            }

            updateWin();
            return;
        }
         
    }//GEN-LAST:event_btnAddMouseClicked

    private void tfaddrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfaddrFocusGained
        if (tfaddr.getText().equals("Enter Address"))
            tfaddr.setText("");
    }//GEN-LAST:event_tfaddrFocusGained

    private void tfaddrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfaddrFocusLost
        String sn = tfaddr.getText();
        if (sn.length() < 5){
            lblAddrError.setText("Address is too short");
            address = null;
            updateWin();
            return;
        }
        
        lblAddrError.setText("");
        address = sn;
        updateWin();
    }//GEN-LAST:event_tfaddrFocusLost

    
    private void tfphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfphoneFocusGained
        if (tfphone.getText().equals("Enter Phone Number"))
            tfphone.setText("");
    }//GEN-LAST:event_tfphoneFocusGained

    private void tfphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfphoneFocusLost
        String sn = tfphone.getText();
        if (!CharValidator.isNumber(sn) || sn.length() < 8 || sn.length() > 15){
            lblPhoneError.setText("Invalid phone number - example: 0123456789");
            phone = null;
            updateWin();
            return;
        }
        
        lblPhoneError.setText("");
        phone = sn;
        updateWin();
    }//GEN-LAST:event_tfphoneFocusLost

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        if (jTextArea1.getText().equals("You may add a decription to the studio"))
            jTextArea1.setText("");
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        description = jTextArea1.getText();
        if (description == null || description.length() < 1)
            description = "Not Available";
        
        iWindow.update();
        
    }//GEN-LAST:event_jTextArea1FocusLost

    private void Pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass2FocusGained
        if (Pass2.getText().equals("jPasswordField2"))
        Pass2.setText("");
    }//GEN-LAST:event_Pass2FocusGained

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

    private void Pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass1FocusGained
        if (Pass1.getText().equals("jPasswordField1"))
        Pass1.setText("");
    }//GEN-LAST:event_Pass1FocusGained

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void init(){
        createStudioID(); 
    }
    
    /**
     * this method generates random id for artist
     * the generated id is checked by the controller before it's set
     */
    private void createStudioID(){
        studioID = StudioAndRoomManager.getStudioNextKey();
        Integer id = new Integer (studioID);
        lblID.setText(id.toString());
    }
    
    public void updateWin(){
        
        iWindow.update();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass1;
    private javax.swing.JPasswordField Pass2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblAddrError;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMailError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblPass4;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoneError;
    private javax.swing.JLabel lblStudioID;
    private javax.swing.JLabel lblStudioName;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfStudioName;
    private javax.swing.JTextField tfaddr;
    private javax.swing.JTextField tfphone;
    // End of variables declaration//GEN-END:variables
}
