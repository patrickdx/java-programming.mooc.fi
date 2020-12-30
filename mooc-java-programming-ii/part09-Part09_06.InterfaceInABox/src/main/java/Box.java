
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Box implements Packable{
    
    private double maxweight;
    private ArrayList<Packable> item;
    private double firstweight;
    
            public Box(double maxweight){
                this.maxweight = maxweight;
                this.item = new ArrayList<>();
                this.firstweight = 0;
            }
            
    public double weight(){
       double weight =0;
       
       for (Packable i : item){
           weight += i.weight();
       }
       
       
       
       return weight;
    }
    
    public void add(Packable item){
        if (maxweight >= item.weight()){            // cannot exceed maxweight
            maxweight -= item.weight();
            this.item.add(item);
            this.firstweight += item.weight();
        }
       
    }
    public String toString(){
        return "Box: " + this.item.size() + " items, total weight " + String.valueOf(this.firstweight) + " kg";
    }
    

    
}
