package iRecord.Controller;

import entities.Freelancer;
import entities.Room;
import entities.Session;
import entities.Studio;
import iRecord.iRecord;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micke
 */
public class StudioAndRoomManager {
    
    /**
     * This method adds new Studio to DB
     * @param s
     * @return
     */
    public static int addStudio(Studio s){
        int status = -1;
        
        String qry = "INSERT INTO Studio (StudioID, sName, sAddress, sEmail, sPhoneNum, sDesc, password)"
                + " VALUES ("+s.getsID().intValue() +",\""+s.getsName()+"\", \""+s.getsAddress()+"\", \""+s.getsEmail()+"\",\""+s.getsPhoneNum()+"\", \""+s.getsDesc()+"\", \""+s.getPass()+"\")";
        
        
        iRecord.getDB().updateReturnID(qry);
        if (isStudioExists(s.getsID()))
            status = 1;
        
        
        return status;
    }
    
    /**
     * This method returns the next expected index number
     * May return false if the highest index is deleted manually from the DB
     * it won't affect anything because the numbering is automatic in the DB
     * @return
     */
    public static int getStudioNextKey(){
        int number = 0;
        
        ResultSet rs = iRecord.getDB().query("SELECT MAX(StudioID) FROM Studio");
        
        
        //if exists return ture
        try {
            if (rs.next()){
                number = rs.getInt(1);
                //System.out.println(number);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return number+1;
    }
    
    /**
     * This method
     */
    public static Map<Integer, Studio> getStudios(){
        Map<Integer, Studio> studios = new HashMap<Integer, Studio>();
        
        ResultSet rs = iRecord.getDB().query("select * from Studio");
        
        try {
            while(rs.next()){
                //Studio Details
                Integer StudioID = rs.getInt("StudioID");
                String sName = rs.getString("sName");
                String sAddress = rs.getString("sAddress");
                String sEmail = rs.getString("sEmail");
                String sPhoneNum = rs.getString("sPhoneNum");
                String sDesc = rs.getString("sDesc");
                String pass = rs.getString("password");
                Studio stud = new Studio(sName, sAddress, sEmail, sPhoneNum, sDesc, StudioID, pass);
                studios.put(StudioID, stud);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //test
//        for (Studio s:studios.values()){
//            System.out.println(s.getsID() + " " + s.getsName());
//        }


        return studios;
    }
    
    /**
     * This method add new room to DB
     */
    public static int addRoom(Room r){
        int status = -1;
        
        int isolation = r.getHasIsolation() ? 1 : 0;
        String qry = "INSERT INTO Room (RoomNum, StudioID, hourRate, maxMusicians, hasIsolation)"
                + " VALUES (" + r.getRoomNum() + ", "+ r.getStudioIdInt()+", "+r.getHourRate()+", " + r.getMaxMusicians()+"," + isolation +")";
        

        
        iRecord.getDB().updateReturnID(qry);
        if (isRoomExists(r.getRoomNum(), r.getStudioIdInt()))
            status = 1;
        
        
        
        return status;
    }
    
    public static int getNextRoomNum(int studioNum){
        int num = -1;
        
        ResultSet rs = iRecord.getDB().query("SELECT MAX ((Room.RoomNum))\n" +
                "FROM Studio INNER JOIN Room ON Studio.[StudioID] = Room.[StudioID]\n" +
                "WHERE (((Room.StudioID)=" +studioNum+"));");
        
        
        //if exists return ture
        try {
            if (rs.next()){
                num = rs.getInt(1);
                //System.out.println(number);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return num+1;
    }
    
    
    public static boolean isRoomExists(int roomNum, int studioID){
        //chech if artist is already exists
        ResultSet rs = iRecord.getDB().query("SELECT Room.*, Room.roomnum, Room.studioid\n" +
                "FROM Room\n" +
                "WHERE (((Room.Roomnum)="+roomNum+")) AND ((Room.studioID)="+studioID+")");
        
        //if exists return ture
        try {
            if (rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return false;
    }
 
    
    public static boolean isStudioExists(int studioID){
        //chech if artist is already exists
        ResultSet rs = iRecord.getDB().query("SELECT Studio.*, Studio.studioid\n" +
                "FROM Studio\n" +
                "WHERE ((Studio.studioID)="+studioID+")");
        
        //if exists return ture
        try {
            if (rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    public static ArrayList<String[]> getStudiosSessions(int id, Timestamp t){
        ArrayList<String[]> toReturn = new ArrayList<String[]>();
        
        String qry = "SELECT Session.SessionID, Session.ArtistID, Session.sessionStartDate, Studio.StudioID, Studio.sName, Artists.StageName, Session.TotalCost\n" +
            "FROM Artists INNER JOIN ((Studio INNER JOIN Room ON Studio.[StudioID] = Room.[StudioID]) INNER JOIN ([Session] INNER JOIN SessionInRoom ON Session.[SessionID] = SessionInRoom.[SessionID]) ON (Room.[StudioID] = SessionInRoom.[StudioID]) AND (Room.[RoomNum] = SessionInRoom.[RoomNum])) ON Artists.ArtistID = Session.ArtistID\n" +
            "GROUP BY Session.SessionID, Session.ArtistID, Session.sessionStartDate, Studio.StudioID, Studio.sName, Artists.StageName, Session.TotalCost " +
            "HAVING (((Studio.StudioID)="+id+")) AND ((Session.sessionStartDate)>\""+t+"\") " +
            "ORDER BY Session.SessionID";

        ResultSet rs = iRecord.getDB().query(qry);
        
        try {
            while(rs.next()){
                String sID = rs.getString("SessionId");
                Date date =  new Date(rs.getTimestamp("sessionStartDate").getTime());
                SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
                dft.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
                String artist = rs.getString("artistid");
                String cost = rs.getString("totalCost");
                toReturn.add(new String[]{sID, dft.format(date).toString(), artist, cost});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudioAndRoomManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return toReturn;
    }
    
    
    /**
     * thid method return all freelancers of a studio
     * @param id
     * @return 
     */
    public static ArrayList<String[]> getStudioFreelancers(int id){
        ArrayList<String[]> toReturn = new ArrayList<String[]>();
        
        String qry = "SELECT FreelancerToStudio.StudioID, FreelancerToStudio.FreelancerID AS FreelancerToStudio_FreelancerID, FreelancerToStudio.Grade, Freelancer.FreelancerID AS Freelancer_FreelancerID, Freelancer.stageName\n" +
                    "FROM Freelancer INNER JOIN FreelancerToStudio ON Freelancer.[FreelancerID] = FreelancerToStudio.[FreelancerID]\n" +
                    "WHERE (((FreelancerToStudio.StudioID)="+id+"))\n" +
                    "ORDER BY FreelancerToStudio.Grade;";
        
        ResultSet rs = iRecord.getDB().query(qry);
        
        try {
            while (rs.next()){
                String fid = rs.getString(2);
                String stageName = rs.getString(5);
                int grade = rs.getInt(3);
                String type = FreelancerManager.getMuicianDetails(fid) == null? "Musician":"Soundman";
   
                toReturn.add(new String[] {fid, stageName, type, grade+""});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudioAndRoomManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return toReturn;
    }
 
}
