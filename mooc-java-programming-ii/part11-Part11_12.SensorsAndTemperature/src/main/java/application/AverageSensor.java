package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Liwen Qu
 */
public class AverageSensor implements Sensor {
    
    private HashMap<Sensor, Boolean> sensors;        // can have multiple types of sensors since all sensors are of type sensor. (polymorpism)
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new HashMap<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        
        if (toAdd.isOn() == true){
            this.sensors.put(toAdd, true);

            }
        else{
            this.sensors.put(toAdd, false);

        }
    }
    

    @Override
    public boolean isOn() {        // when all sensors are on
        for (Sensor i : sensors.keySet()){     // search all sensors
            if (i.isOn() == true){
                return true;
            }
    }
        return false;
    }

    @Override
    public void setOn   () {     
        for (Sensor i : sensors.keySet()){
            i.setOn();
           
        }
    }

    @Override
    public void setOff() {
        for (Sensor i : sensors.keySet()){
            i.setOff();
        }
    }

    @Override
    public int read() {
    int sum=0;
        if (sensors.isEmpty() || isOn() == false){
            throw new IllegalStateException();
        }else{
                 
                 for (Sensor i : sensors.keySet()){
                     int toread = i.read();
                     sum += toread;
                  
                     
                 }
        }
        readings.add(sum / sensors.size());

        return sum / sensors.size();
    }
    public List<Integer> readings(){
        return readings;
    }
    
}
