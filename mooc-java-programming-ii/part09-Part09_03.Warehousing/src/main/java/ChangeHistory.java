
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */


public class ChangeHistory {

    private ArrayList<Double> history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
   public void clear(){
       history.clear();
   }
   
   
   public String toString(){
    
       return history.toString();
   }
   
   public double maxValue() {
    
       if (history.isEmpty()){
           return 0.0;
       }
       return Collections.max(history);
   }
   
   public double minValue(){
       if (history.isEmpty()){
           return 0.0;
       }
       return Collections.min(history);
   }
   
   public double average(){
        if (history.isEmpty()){
           return 0.0;
       }
        double sum=0;
        for (double i : history){
            sum += i;
        }
        return sum/history.size();
   }
   
   }
   

