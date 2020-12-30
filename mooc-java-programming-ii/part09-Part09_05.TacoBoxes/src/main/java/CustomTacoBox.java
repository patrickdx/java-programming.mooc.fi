/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class CustomTacoBox implements TacoBox {
    
    private int initalTacos;
    
    public CustomTacoBox(int tacos){
        this.initalTacos = tacos;
    }
    
    @Override
    public int tacosRemaining() {
       return this.initalTacos;
    }

    @Override
    public void eat() {
        if (this.initalTacos >= 1){
            this.initalTacos -=1;
        }
    }
    
    
    
    
}
