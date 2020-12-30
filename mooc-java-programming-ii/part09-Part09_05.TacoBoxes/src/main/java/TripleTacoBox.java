/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class TripleTacoBox implements TacoBox {

   
    private int amountoftacos;
    
    public TripleTacoBox() {
    this.amountoftacos=3;
    }

    
    @Override
    public int tacosRemaining() {
        return this.amountoftacos;
    }

    @Override
    public void eat() {
        if (this.amountoftacos >= 1){
            this.amountoftacos -=1;
        }
    }
    
}
