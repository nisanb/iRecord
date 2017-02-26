/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui.internal;

import Validators.PositiveValidator;
import entities.Artist;
import gui.main.iWindow;
import iRecord.Controller.ArtistManager;
import iRecord.Controller.RecordingManager;
import iRecord.Controller.ReportManager;
import iRecord.iRecord;
import java.awt.Color;
import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.control.ProgressBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisan
 */
public class frmSessionsReport extends javax.swing.JInternalFrame {
    private Artist artist = null;
    private Date picked = null;
    private int sessionID;
    private File file;
    
    
    /**
     * Creates new form frmCreateSession
     */
    public frmSessionsReport() {
        initComponents();
        init();
        
    }
    
    
    public frmSessionsReport(String artistID) {
        initComponents();
        getArtist(artistID);
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
        lbldate = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGen = new javax.swing.JTable();
        getData = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        lblAddr = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblstageName = new javax.swing.JLabel();
        lblAddr4 = new javax.swing.JLabel();
        lblSongTitle = new javax.swing.JLabel();
        lblAddr5 = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        lblAddr6 = new javax.swing.JLabel();
        lblMastered = new javax.swing.JLabel();
        lblAddr8 = new javax.swing.JLabel();
        lblAddr9 = new javax.swing.JLabel();
        lblAddr10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSket = new javax.swing.JLabel();
        lblDemo = new javax.swing.JLabel();
        lblprec = new javax.swing.JLabel();
        prog = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusicians = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSoundmans = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,0));
        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Artist's Sessions");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 0, 360, 30);

        pnlAdd.setBackground(new Color(255,255,255,40));
        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("From Date");
        pnlAdd.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        tblGen = new javax.swing.JTable(){
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;

                    default:
                    return Object.class;
                }
            }
        };
        tblGen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Studio ID", "Studio Name", "Session ID", "Date", "Total Cost", "Status", "Record ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblGen);

        pnlAdd.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 760, 150));

        getData.setText("Get Data");
        getData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getDataMouseClicked(evt);
            }
        });
        pnlAdd.add(getData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, -1));

        jXDatePicker1.setBackground(new Color(0,0,0,0));
        jXDatePicker1.setForeground(new java.awt.Color(204, 0, 153));
        jXDatePicker1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jXDatePicker1FocusLost(evt);
            }
        });
        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });
        pnlAdd.add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 230, 20));

        lblAddr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr.setText("Artist ID");
        pnlAdd.add(lblAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Stage Name");
        pnlAdd.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 20));

        lblMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        lblMail.setText("Email");
        pnlAdd.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 20));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        pnlAdd.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 20));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID");
        pnlAdd.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 20));

        lblstageName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstageName.setForeground(new java.awt.Color(255, 255, 255));
        lblstageName.setText("Stage Name");
        pnlAdd.add(lblstageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 20));

        lblAddr4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr4.setText("Mastered");
        pnlAdd.add(lblAddr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 80, 20));

        lblSongTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 360, 20));

        lblAddr5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr5.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr5.setText("Youtube Link:");
        pnlAdd.add(lblAddr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 20));

        lblLink.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLink.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 540, 20));

        lblAddr6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr6.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr6.setText("Song Title:");
        pnlAdd.add(lblAddr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 20));

        lblMastered.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMastered.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblMastered, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 50, 20));

        lblAddr8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr8.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr8.setText("Sketelon");
        pnlAdd.add(lblAddr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 80, 20));

        lblAddr9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr9.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr9.setText("Demo");
        pnlAdd.add(lblAddr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 80, 20));

        lblAddr10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddr10.setForeground(new java.awt.Color(255, 255, 255));
        lblAddr10.setText("Total");
        pnlAdd.add(lblAddr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, 20));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 50, 20));

        lblSket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSket.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblSket, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 50, 20));

        lblDemo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDemo.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 50, 20));

        lblprec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblprec.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdd.add(lblprec, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 50, 20));
        pnlAdd.add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 240, 20));

        tblMusicians.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Musician ID", "Stage Name", "Expertise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMusicians);

        pnlAdd.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 350, 100));

        tblSoundmans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Soundman ID", "Stage Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSoundmans);

        pnlAdd.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 360, 100));

        getContentPane().add(pnlAdd);
        pnlAdd.setBounds(0, 40, 780, 520);

        jButton1.setText("Susspend Artist");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 570, 160, 23);

        lblError.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText(" ");
        getContentPane().add(lblError);
        lblError.setBounds(10, 570, 560, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void getDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getDataMouseClicked
        if (artist == null || picked == null){
            lblError.setText("One or more fields are missing");
            updateWin();
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) tblGen.getModel();
        model.setRowCount(0);
        //get the sessions of selected studio
        Timestamp t = new Timestamp(picked.getTime());
        ArrayList <String[]> ses = RecordingManager.getArtistSessions(artist.getID(), t);
        
        int mastered = 0, sketelon = 0, demo = 0, other=0;
        //while has next
        for (String[] s:ses){
            if (s == null) break;
            String[] row = {s[0], s[1], s[2], s[3], s[4], s[5], s[6]};
            model.addRow(row);
            
            //count mastered sessions
            if (s[5].equals("Mastered")) mastered++;
            else if (s[5].equals("Demo")) demo++;
            else if (s[5].equals("Sketelon")) sketelon++;
            else other++;
            
        }
        
        lblTotal.setText(""+other);
        lblSket.setText(""+sketelon);
        lblDemo.setText(""+demo);
        lblMastered.setText(""+mastered);
        int total = other + sketelon + demo + mastered;
        if (total > 0) {
            double precentage = (((double)mastered)/((double)total))*100;
            lblprec.setText(""+precentage);
            
            //progress bar code here
            prog.setMaximum(100);
            prog.setMinimum(0);
            prog.setForeground(Color.green);
            prog.setValue((int)precentage);
        }
        

        
        lblError.setText("");
        updateWin();
        return;
        
    }//GEN-LAST:event_getDataMouseClicked
    
    private void jXDatePicker1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jXDatePicker1FocusLost
        
    }//GEN-LAST:event_jXDatePicker1FocusLost
    
    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        picked = jXDatePicker1.getDate();
        
        updateWin();
        return;
    }//GEN-LAST:event_jXDatePicker1ActionPerformed
    
    private void tblGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGenMouseClicked
        lblError.setText("");
        String id = (String)tblGen.getModel().getValueAt(tblGen.getSelectedRow(), 2);
        sessionID = (int) PositiveValidator.stringToNum(id);
        lblSongTitle.setText("");
        lblLink.setText("");
        if (sessionID < 1) return;
        ArrayList<String[]> musicians = ReportManager.getMusiciansOfSession(sessionID);
        ArrayList<String[]> soundmans = ReportManager.getSoundmansOfSession(sessionID);
        String[] songDetails = ReportManager.getSongDetails(sessionID);
        
        if (musicians == null || soundmans == null){
            lblError.setText("Recording was not uploaded for this session");
            updateWin();
            return;
        }
        
        //set song details
        if (songDetails != null){
            lblSongTitle.setText(songDetails[0].toString());
            lblLink.setText(songDetails[1].toString());
            //System.out.println(songDetails[0] + " " +songDetails[1]);
        }
        
        //set soundmans
        DefaultTableModel model1 = (DefaultTableModel) tblSoundmans.getModel();
        model1.setRowCount(0);
        for (String[] s:soundmans){
            if (s == null) break;
            String[] row = {s[0], s[1], s[2]};
            model1.addRow(row);
            
        }  
        
        //set musicians
        DefaultTableModel model2 = (DefaultTableModel) tblMusicians.getModel();
        model2.setRowCount(0);
        for (String[] s:musicians){
            if (s == null) break;
            String[] row = {s[0], s[1], s[2]};
            model2.addRow(s);
            
        } 
        
        
        
        updateWin();
    }//GEN-LAST:event_tblGenMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        frmArtistSuspension add = new frmArtistSuspension();
        iWindow.openWin(add);
    }//GEN-LAST:event_jButton1MouseClicked
    
    
    private void init(){
        if (artist == null){
            artist = (Artist)iRecord.getLoggedUser();
        }
        lblstageName.setText(artist.getStageName());
        lblEmail.setText(artist.getEmail());
        lblID.setText(artist.getID());
    }
    
    public void updateWin(){
        
        iWindow.update();
        
    }
    
    private void getArtist(String artistID){
        artist = ArtistManager.getArtist(artistID);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getData;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblAddr10;
    private javax.swing.JLabel lblAddr4;
    private javax.swing.JLabel lblAddr5;
    private javax.swing.JLabel lblAddr6;
    private javax.swing.JLabel lblAddr8;
    private javax.swing.JLabel lblAddr9;
    private javax.swing.JLabel lblDemo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMastered;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSket;
    private javax.swing.JLabel lblSongTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblprec;
    private javax.swing.JLabel lblstageName;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JProgressBar prog;
    private javax.swing.JTable tblGen;
    private javax.swing.JTable tblMusicians;
    private javax.swing.JTable tblSoundmans;
    // End of variables declaration//GEN-END:variables
}