/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;
    
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        
    }
    
    public int price(){
        return this.unitPrice * this.qty;
    }
    
    public void increaseQuantity(){
        qty++;
    }
    
    public boolean equals(Item other){      // logic to compare objects
        
        return this.product == other.product && this.qty ==  other.qty && this.unitPrice == other.unitPrice;
        
    }
    
    public String toString(){
        return this.product + ": " + this.qty;
    }
    
    
}
