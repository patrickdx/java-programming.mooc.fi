
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
public class Main {
 
    public static void main(String[] args){
ShoppingCart cart = new ShoppingCart();
List<Item> xd2 = new ArrayList<>();

    Item xd = new Item ("milk", 1, 4);
    Item xd1 = new Item("milk", 1, 4);
        System.out.println(xd .equals(new Item ("milk", 1, 4)));
    xd2.add(xd);
    xd2.add(xd1);
        System.out.println(xd2.contains(new Item ("milk", 1, 4)));
        System.out.println(xd.equals(xd1));
        
        
        
        
        
        
        
        
cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("buttermilk", 2);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");
}
    
    
}
