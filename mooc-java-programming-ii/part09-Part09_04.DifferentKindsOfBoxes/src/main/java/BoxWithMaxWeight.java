
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
public class BoxWithMaxWeight extends Box {

    private int maxweight;
    private ArrayList<Item> boxes;
    
    public BoxWithMaxWeight(int capacity){
        
        this.maxweight=capacity;
        this.boxes = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {        // can only add item if the item added won't exceed the max weight.
       
     int weightToBeAdded = item.getWeight();
     
     if (this.maxweight - weightToBeAdded >= 0){
         boxes.add(item);
         this.maxweight = this.maxweight - weightToBeAdded;
     }
   
        
    }

    @Override
    public boolean isInBox(Item item) {
        return this.boxes.contains(item);
    }
    
}
