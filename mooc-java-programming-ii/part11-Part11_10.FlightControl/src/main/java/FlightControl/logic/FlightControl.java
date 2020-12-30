/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.concepts.Airplane;
import FlightControl.concepts.Flight;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Liwen Qu
 */
public class FlightControl {        // logic 
    
    private HashMap<String, Airplane> planes;
    private HashMap<Flight,String > flights;
    
    public FlightControl(){
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String id, int capcacity){
        this.planes.putIfAbsent(id, new Airplane(id, capcacity));       // to prevent duplicate ids 
    }
    
    public void addFlight(String id, String departure, String destination){
        for (Flight i : flights.keySet()){                                          // if duplicate, do not add, have object logic in different class
           if (i.equals(new Flight (id, departure, destination))){
               return;
           }
        }
        
        this.flights.put(new Flight(id, departure, destination), id);       // flight object as key because id cannot be duplicate for keys
  
    }
    
    public Airplane airplaneSearch(String id){
        return planes.get(id);
    }
    
    public void printAirplanes(){
        planes.values().stream().forEach(e -> System.out.println(e));
    }
    
    public void printFlights(){
      
     for (Flight i: flights.keySet()){
         for (Airplane g : planes.values()){
             if (i.getAirplaneID().equals(g.getPlaneID())){
                 System.out.println(g + "" + i);
             }
         }
     }
        
        
    }
    
    
    
    
}
