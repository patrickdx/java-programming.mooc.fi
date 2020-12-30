/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Hideout <T> {
    
    private T xd;
  
    
    public void putIntoHideout(T toHide){
        xd = toHide;
        
    }
    
    public T takeFromHideout(){
   
        T dummy = this.xd;
        
        if (dummy != null){
            this.xd = null;
            return dummy;
        }
        return null;
        
    }
    
    public boolean isInHideout() {
        if (this.xd !=null){
            return true;
        }
        return false;
        
    }
    
    
}
