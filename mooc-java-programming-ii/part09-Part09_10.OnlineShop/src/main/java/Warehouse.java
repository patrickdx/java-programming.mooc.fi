
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Warehouse {
    
    private Map<String, Integer> items;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.items = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public int stock(String product){
        
        if (this.stock.get(product) == null){
            return 0;
        }
        return this.stock.get(product);
    }
    
    public boolean take(String product){
        
        if (this.stock.get(product) == null){
            return false;
        }
        
        int stock = this.stock.get(product);
        
        if (stock > 0){
            this.stock.put(product,stock-1);
            return true;
        }
        
        return false;
        
        
    }
    
    public Set<String> products(){
        return this.items.keySet();
        
    }
    
    public void addProduct(String product, int price, int stock){
        this.items.putIfAbsent(product, price);
        this.stock.putIfAbsent(product, stock);
    }
    
    public int price (String product){
        
        if (items.get(product) == null){
            return -99;
        }
        return items.get(product);
    }
    
}
