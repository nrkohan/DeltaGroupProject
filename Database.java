/*
 * File: Database.java
 * Author: Neil Kohan, Stephanie Brinegar, Kenneth Harris, Jeremy Lantz
 * Course: CMSC 495
 * Project: vetclinic
 * Date: 09/22/2019
 * Platform: Windows 10
 * Compiler: Netbeans 82
 * Purpose: Retrives data from database files, Loads records to database files
 */
package vetclinic;

import java.util.Date;

public class Database {
    
    Database(){
        
    }
    
    public Integer searchPetName(String animalName, String lastName){
        return 1;
    }
    
    public Boolean checkApptTime(Date checkDate, Date checkTime, Date durationTime){
        return true;
    }
    
    public void loadAppointment(Integer animalID, Date apptDate, Date apptTime, String doctor, Integer duration){
        
    }
    
    public String getAnimalName(Integer animalID){
        return "Fido";
    }
    
    public String getFirstName(Integer animalID){
        return "John";
    }
    
    public String getLastName(Integer animalID){
        return "Doe";
    }
    
    public Integer postAnimal(String petName, String lastName, String firstName,
                              String Gender, String weight){
        
        return 1;
    }
    
    public void postMedication(Integer animalID, String[] medList){
        
    }
    
    public void postShots(Integer animalID, String[] shotList){
        
    }
}
