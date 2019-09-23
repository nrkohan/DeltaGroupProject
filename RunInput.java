/*
 * File: RunInput.java
 * Author: Neil Kohan, Stephanie Brinegar, Kenneth Harris, Jeremy Lantz
 * Course: CMSC 495
 * Project: vetclinic
 * Date: 09/22/2019
 * Platform: Windows 10
 * Compiler: Netbeans 82
 * Purpose: Handles requests from GUI input, processes information, passes data back to GUI
 */
package vetclinic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RunInput {
    
    Database Database = new Database();
    String requestedField;
    
    public Integer checkSearch(String petName, String lastName){
        //check for a valid animal ID
        Integer checkID = Database.searchPetName(petName, lastName);
        
        if (checkID.equals(0)){
            JOptionPane.showMessageDialog(null, "Animal not found", "Error",JOptionPane.WARNING_MESSAGE);
        } 
        return checkID;
    }
    
    public Boolean checkNewAppt(String petName, String firstName, String lastName,
                    String doctor, String apptDate, String apptTime, String Duration){
        //Load some default variables
        Date checkDate;
        Date checkTime;
        Integer checkDuration;
        Date durationTime;
        
        //First validate the animal ID
        Integer checkID = Database.searchPetName(petName, lastName);
        if (checkID.equals(0)){
           JOptionPane.showMessageDialog(null, "Animal not found", "Error",JOptionPane.WARNING_MESSAGE);
           return false;
        }
        
        //Next check to ensure they entered a valid date
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            checkDate = dateformat.parse(apptDate);
        } catch (ParseException e){
            JOptionPane.showMessageDialog(null, "Invalid date entered the required format is DD/MM/YYYY", "Error",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        //Next validate the time
        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm a");
        try{
            checkTime = timeformat.parse(apptTime);
        } catch (ParseException e){
            JOptionPane.showMessageDialog(null, "Invalid time entered the requried format is HH:MM in 24 hour format", "Error",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        //Lastly verify the duration
        try{
            checkDuration = Integer.parseInt(Duration);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid duration was entered", "Error",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        //Now that we have verified everything check to see if we have a scheduling conflict
        //start by adding the duration to the appointment time
        durationTime = checkTime; 
        
        //Once we have our calculated date pass the appointment time details to 
        //the database for checking
        Boolean isGoodAppt = Database.checkApptTime(checkDate, checkTime, durationTime);
        if (isGoodAppt == false){
            JOptionPane.showMessageDialog(null, "Requested appointment overlaps existing appointment", "Error",JOptionPane.WARNING_MESSAGE);
        }
        
        //If we made it all the way down here pass the database the appointment
        //details to load to the database
        Database.loadAppointment(checkID, checkDate, checkTime, doctor, checkDuration);
       
        return true; 
    }
    
    public String getAnimalInfo(Integer inputID, String fileField){
        switch (fileField){
            case "animalName":
                requestedField = Database.getAnimalName(inputID);
            case "firstName":
                requestedField = Database.getFirstName(inputID);
            case "lastName":
                requestedField = Database.getLastName(inputID);
            default:
                
        }
        return requestedField;
    }
    
}
