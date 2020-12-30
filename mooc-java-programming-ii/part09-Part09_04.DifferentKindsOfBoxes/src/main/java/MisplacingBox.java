
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
public class MisplacingBox extends Box{             // always cannot find box

     private ArrayList<Item> boxes;
    public MisplacingBox(){
        boxes = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        boxes.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
