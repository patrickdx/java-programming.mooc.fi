/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class ProductWarehouse extends Warehouse{         // a product warhouse is a special case of a warehouse, thus we are extending the class.
    
    private String productName;         // *NEW* product name for the product
    
  
    
    public ProductWarehouse(String productName, double capacity){  
        super(capacity);
        this.productName = productName;
       
    }
    
    public void setName(String newName){
        this.productName = newName;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public String toString(){
        return this.productName + ": " + super.toString();
    }
    
}
