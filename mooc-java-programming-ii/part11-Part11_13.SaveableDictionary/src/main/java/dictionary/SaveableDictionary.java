/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Liwen Qu
 */
public class SaveableDictionary {
    
    private HashMap<String,String> wordtotrans;
    private HashMap<String,String> translationtoword;
    private String filename;

    public SaveableDictionary(){
        this.wordtotrans = new HashMap<>();
        this.translationtoword = new HashMap<>();
    }
    public void add(String words, String translation){
        this.wordtotrans.putIfAbsent(words,translation);
        this.translationtoword.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        if (this.wordtotrans.get(word) !=null){
            return this.wordtotrans.get(word);
        }
        else if (this.translationtoword.get(word) != null){
            return this.translationtoword.get(word);
        }
        return null;
    }
    
    public void delete(String word){
        if (this.wordtotrans.get(word) !=null){
             this.translationtoword.remove(translate(word));
            this.wordtotrans.remove(word);
           
        }
        else if (this.translationtoword.get(word) != null){
            this.wordtotrans.remove(translate(word));
            this.translationtoword.remove(word);
            
        }
    }
    public SaveableDictionary(String file){
        this.wordtotrans = new HashMap<>();
        this.translationtoword = new HashMap<>();
        this.filename = file;
        
   }
    
    public boolean load(){
  try (Scanner scanner = new Scanner(Paths.get(this.filename))) {

    // we read the file until all lines have been read
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
    String[] parts = line.split(":");   // split the line based on the ':' character

    this.wordtotrans.put(parts[0], parts[1]);
    this.translationtoword.put(parts[1], parts[0]);

    }
    scanner.close();
    return true;
} catch (Exception e) {
     e.printStackTrace();
}
  return false;

    }
    
    
    
    public boolean save(){
        try{
             PrintWriter writer = new PrintWriter(this.filename);
        
        for (Map.Entry<String, String> i : wordtotrans.entrySet()) {
            writer.println(i.getKey() + ":" + i.getValue());
            
        }
        writer.close(); //closes the file and ensures that the written text is saved to the file

        }
        catch(Exception e){
            return false;
        }
       return true;
    }
}

        

