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
public class Airplane {
    
    private String planeID;
    private int planeCapacity;
    
    public Airplane(String planeID, int capacity){
        this.planeID = planeID;
        this.planeCapacity = capacity;
    }
    
    public String getPlaneID(){
        return this.planeID;
    }
    
    public int getCapacity(){
        return this.planeCapacity;
    }
    
    public String toString(){
        return this.planeID + "(" + planeCapacity + " capacity)";
    }
    
    
    
}
