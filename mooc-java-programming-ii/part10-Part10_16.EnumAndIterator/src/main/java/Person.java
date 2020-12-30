/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Person {
    
    private String name;
    private Education deg;
    public Person(String name, Education degree){
        this.name = name;
        this.deg = degree;
    }
    
    public Education getEducation(){
        return this.deg;
    }
    public String toString(){
        return this.name + ", " + this.deg;
    }
    
}
