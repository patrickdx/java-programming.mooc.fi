/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;


/**
 *
 * @author Liwen Qu
 */

//At first a temperature sensor is off. When the method read is called and the sensor is on, the sensor randomly chooses an 
//integer in the range -30...30 and returns it. If the sensor is off, the method read throws an IllegalStateException.

public class TemperatureSensor implements Sensor { 
    
    private boolean sensorOn;
    
    public TemperatureSensor(){
        this.sensorOn = false;
    }

    @Override
    public boolean isOn() {
        return sensorOn;
    }
    
    @Override
    public void setOn() {
        sensorOn = true;
    }

    @Override
    public void setOff() {
        sensorOn = false;
    }

    @Override
    public int read() {
        if (sensorOn == true){      // if sensor on
            return (int) (Math.random()*61)-30;
        }
        else{
            throw new IllegalStateException();
        }
    }
    
    
    
}
