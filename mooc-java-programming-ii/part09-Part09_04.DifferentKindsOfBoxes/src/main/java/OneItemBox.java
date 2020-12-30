
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
public class OneItemBox extends Box {
 private ArrayList<Item> boxes;
    public OneItemBox(){
        boxes = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (boxes.isEmpty()){
            boxes.add(item);
        }
      
    }

    @Override
    public boolean isInBox(Item item) {
        
        if (boxes.isEmpty()){
            return false;
        }
        else if (boxes.contains(item)){
            return true;
        }
        return false;
    }
    
}
