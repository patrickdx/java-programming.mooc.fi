/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.concepts;
/**
 *
 * @author Liwen Qu
 */
public class Flight {
    
    private String airplaneID;
    private String departureID;
    private String targetID;
    
    public Flight(String airplaneID, String departureID, String targetID){
        this.airplaneID = airplaneID;
        this.departureID = departureID;
        this.targetID = targetID;
        
    }
    
    public String getAirplaneID(){
        return this.airplaneID;
    }
   
    
    public String toString(){
         return "(" + this.departureID + "-" + this.targetID + ")";      // FROM - TO
    }
  public boolean equals(Object obj){        // compare logic 
        
       if(this == obj) 
            return true; 
          
        if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
          
      
        Flight geek = (Flight) obj; 
          
       
        return (geek.airplaneID.equals(this.airplaneID ) && geek.departureID.equals( this.departureID) && geek.targetID.equals(this.targetID)); 
        }
    }
    
    
