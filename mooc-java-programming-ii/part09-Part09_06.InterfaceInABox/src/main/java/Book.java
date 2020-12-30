/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Book implements Packable{

    private String author, name;
    private double weight;
    
    public Book(String author, String title, double weight){
        this.author = author;
        this.name = title;
        this.weight = weight;
        
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    public String toString(){
        return this.author + ": " + this.name;
    }
    
}
