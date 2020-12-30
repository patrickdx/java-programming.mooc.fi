/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Book implements Comparable<Book>{
    
    private int age;
    private String name;
    
    
    public Book(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    
    public int returnAge(){
        return this.age;
    }
    
    public String returnName(){
        return this.name;
    }
    public String toString(){
        return this.name + "(recommended for " + this.age + "year-olds or older)";
    }

    @Override
    public int compareTo(Book heh) {        // compare logic
        return this.age - heh.age;
        
    }
    
}
