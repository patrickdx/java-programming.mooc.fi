
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class ShoppingCart {
 
    private List<Item> cart;
    
    public ShoppingCart(){
        this.cart = new ArrayList<>();
    }
    
    
    public void add(String product, int price){
        
        Item item = new Item (product, 1 , price);
                                                                  // if product is a dupliate in cart... 
       if (cart.contains(item)){           // need to override equals method
           System.out.println("gyes");
           item.increaseQuantity();
       }else{
            cart.add(item);

       }
        
    }
 
    
    
    public int price(){
        int sum=0;
        
        for (Item i : cart){
            sum+=i.price();
        }
        return sum;
    }
    
    
    public void print(){
        for (Item i : cart){
            System.out.println(i);
        }
    }
    
}
