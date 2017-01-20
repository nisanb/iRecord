/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import entities.Studio;
import gui.main.iWindow;
import iRecord.iRecord;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import iRecord.Controller.SessionManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author nisan
 */
public class frmCreateSession extends javax.swing.JInternalFrame {

    List<java.sql.Date> unavailableDates;
    
    Map<Integer, Studio> studioList;
    /**
     * Creates new form frmCreateSession
     */
    public frmCreateSession() {
        setTitle("Create Session Page");
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
        jButton1 = new javax.swing.JButton();
        slctStudio = new javax.swing.JComboBox<>();
        endTimeSpinner = new javax.swing.JSpinner();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        startTimeSpinner = new javax.swing.JSpinner();
        checkDates = new javax.swing.JButton();
        dateErr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,0));
        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Welcome to Create Session feature!");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 0, 360, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 380, 73, 23);

        slctStudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        slctStudio.setVisible(false);
        getContentPane().add(slctStudio);
        slctStudio.setBounds(70, 180, 260, 20);

        endTimeSpinner.setModel(new SpinnerDateModel());
        endTimeSpinner.setEditor(new JSpinner.DateEditor(endTimeSpinner, "HH:mm"));
        endTimeSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                endTimeSpinnerPropertyChange(evt);
            }
        });
        getContentPane().add(endTimeSpinner);
        endTimeSpinner.setBounds(340, 70, 50, 20);

        jXDatePicker1.setBackground(new Color(0,0,0,0));
        jXDatePicker1.setForeground(new java.awt.Color(204, 0, 153));
        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(70, 70, 160, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Session Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 40, 170, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Start Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 40, 60, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End Time");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 40, 60, 30);

        startTimeSpinner.setModel(new SpinnerDateModel());
        startTimeSpinner.setEditor(new JSpinner.DateEditor(startTimeSpinner, "HH:mm"));
        startTimeSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startTimeSpinnerPropertyChange(evt);
            }
        });
        getContentPane().add(startTimeSpinner);
        startTimeSpinner.setBounds(250, 70, 60, 20);

        checkDates.setBackground(new java.awt.Color(255, 255, 255));
        checkDates.setText("Check Dates");
        checkDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDatesActionPerformed(evt);
            }
        });
        getContentPane().add(checkDates);
        checkDates.setBounds(70, 100, 93, 30);

        dateErr.setBackground(new Color(0,0,0,0));
        dateErr.setForeground(new java.awt.Color(255, 255, 255));
        dateErr.setText("err");
        dateErr.setOpaque(true);
        dateErr.setVisible(false);
        getContentPane().add(dateErr);
        dateErr.setBounds(210, 110, 290, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/erricon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 100, 250, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
// TODO add your handling code here:
       
        
       

    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void startTimeSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_startTimeSpinnerPropertyChange
        // TODO add your handling code here:
        init();
    }//GEN-LAST:event_startTimeSpinnerPropertyChange

    private void endTimeSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_endTimeSpinnerPropertyChange
        // TODO add your handling code here:
     
    }//GEN-LAST:event_endTimeSpinnerPropertyChange

    private void checkDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDatesActionPerformed
        // TODO add your handling code here:
        updateForm();
    }//GEN-LAST:event_checkDatesActionPerformed

    
    private void init(){
        
        /**
         * Module 1 -> Disable Dates which artist is already occupied
         */
        unavailableDates = ((entities.Artist)iRecord.getLoggedUser()).getUnavailableDates();
        Date[] dates = new Date[unavailableDates.size()];
        dates = (Date[]) unavailableDates.toArray(dates);
        iRecord.importXML(iRecord.getLoggedUser().getID());
        jXDatePicker1.getMonthView().setUnselectableDates(dates);

        
        /**
         * Module 2 -> Display studio and rooms to choose from
         */
        //Get all studios and fill their rooms
        studioList = SessionManager.getStudios();
        
        
    }

    public void updateForm(){
        if(jXDatePicker1.getDate()==null || ((java.util.Date)startTimeSpinner.getValue()).after((java.util.Date)endTimeSpinner.getValue())){
            dateErr.setText("Please choose a valid date and time");
            dateErr.setVisible(true);
            iWindow.update();
            
            return;
        }
        dateErr.setVisible(false);
        repaint();
        Date dateStart = jXDatePicker1.getDate();
        Date dateEnd = (Date) dateStart.clone() ;
        Date endTime = (Date)endTimeSpinner.getValue();
        Date startTime = (Date)startTimeSpinner.getValue();
        dateStart.setHours(startTime.getHours());
        dateStart.setMinutes(startTime.getMinutes());
        dateEnd.setHours(endTime.getHours());
        dateEnd.setMinutes(endTime.getMinutes());
        
        Map<Integer, Studio> studioList = SessionManager.getStudios();
        SessionManager.clearRooms(studioList, dateStart, dateEnd);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkDates;
    private javax.swing.JLabel dateErr;
    private javax.swing.JSpinner endTimeSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JComboBox<String> slctStudio;
    private javax.swing.JSpinner startTimeSpinner;
    // End of variables declaration//GEN-END:variables
}
