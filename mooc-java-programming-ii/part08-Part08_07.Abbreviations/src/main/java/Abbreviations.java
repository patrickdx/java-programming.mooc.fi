
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Abbreviations {
    
    private HashMap<String, String> Abbreviations;
    
    public Abbreviations(){
        this.Abbreviations = new HashMap();
    }
 
    public void addAbbreviation(String abbreviation, String meaning){   // add abbreviation  (key) to hashmap.
        Abbreviations.put(abbreviation, meaning);
    }
    
    public boolean hasAbbreviation(String abbreviation){            // checks if abbreviation key exists 
        
        if (Abbreviations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){          // finds the explanation for an abbreviation;
        
        return Abbreviations.get(abbreviation);
        
    }
    
    public static void main(String[] args) {
       
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
        
    }
}
