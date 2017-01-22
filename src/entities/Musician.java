/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import iRecord.iRecord;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nisan
 */
public class Musician extends Freelancer {
    Double payRoll;
    Integer expertise;

    public Musician(String FreelancerID, String firstName, String lastName, String stageName, Double payRoll, Integer expertise) {
        super(FreelancerID, firstName, lastName, stageName);
        this.payRoll = payRoll;
        this.expertise = expertise;
    }
    
    public Musician(String FreelancerID){
        super(FreelancerID);
    }

    public Double getPayRoll() {
        return payRoll;
    }

    public void setPayRoll(Double payRoll) {
        this.payRoll = payRoll;
    }

    public Integer getExpertise() {
        return expertise;
    }

    public void setExpertise(Integer expertise) {
        this.expertise = expertise;
    }
    
    public String getExpertiseString(){
        ResultSet qry = iRecord.getDB().query("select eField from Expertise where ExpertiseID="+getExpertise());
        try {
            while(qry.next()){
                return qry.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Musician.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(getFreelancerID());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musician other = (Musician) obj;
        if (!Objects.equals(getFreelancerID(), other.getFreelancerID())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getStageName();
    }
    
    
    
    
    
}