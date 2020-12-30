/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history1 = new ChangeHistory();
       
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initalBalance){
        super(productName, capacity);
        super.addToWarehouse(initalBalance);
        this.history1.add(initalBalance);
        
        
    }
    
    public void addToWarehouse(double amount) {
        
     super.addToWarehouse(amount);
     this.history1.add(super.getBalance());
        
        
    }
    
    public double takeFromWarehouse(double amount){
        
        double xd = super.takeFromWarehouse(amount);
        this.history1.add(super.getBalance());
       
        return xd;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\nHistory: " + this.history() + "\nLargest amount of product: " + this.history1.maxValue() + "\nSmallest amount of product: " + this.history1.minValue() + "\nAverage: " + this.history1.average());
        
    }
    
   public String history(){
       return this.history1.toString();
   }
    
}
