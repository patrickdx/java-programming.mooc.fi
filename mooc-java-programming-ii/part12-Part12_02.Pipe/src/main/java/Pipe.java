
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
public class Pipe<T>{
    
    private ArrayList<T> xd;        //  we always remove the value which has been inside the pipe the longest and add to it the newest value.
    
    public Pipe(){
        this.xd = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        xd.add(value);
        
    }
    
    public T takeFromPipe(){        // value that is in the pipe the longest is .get(0)
        
        if (xd.isEmpty()){
            return null;
        }
        T dummy = xd.get(0);
        xd.remove(0);
        return dummy;
        
        
    }

    public boolean isInPipe(){
        if (xd.isEmpty()){
            return false;
        }
        return true;
    }
    
    
}
