/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Student extends Person{
    
    private int studycredits;
    
    public Student(String name, String address){
        super(name, address);
        this.studycredits =0;
        
    }
    
    public void study(){
        studycredits++;
    }
    
    public int credits(){
        return this.studycredits;
    }
    
    public String toString(){       // overwrite the inherited toString method from Person.java.
        return super.toString() + "\n" + "  Study credits " + this.studycredits;
    }
    
    
}
