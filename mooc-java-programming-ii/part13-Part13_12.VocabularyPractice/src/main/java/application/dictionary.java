/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Liwen Qu
 */
public class dictionary {           // UI core logic 
    
    private HashMap<String,String> database;
    private List<String> words;         // to randomize
    
    public dictionary(){
        this.database = new HashMap<>();
        this.words = new ArrayList<>();
        
        add("sana", "word");

    }
    
    public void add(String word, String translation){
        
        if (!this.database.containsKey(word)){      // if word is not duplicate
            this.words.add(word);

        }
        
        this.database.put(word, translation);
    }
    
    public String get(String word){
        
        return this.database.get(word);
    }
    
    public String randomize(){
        
    
         System.out.println(this.words.size());
     
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
        
    }
    
    
    
}
