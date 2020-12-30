
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations(){
        dict = new HashMap<>();
        
    }
    
    public void add(String word, String translation){
        
        this.dict.putIfAbsent(word, new ArrayList<>());
        
        this.dict.get(word).add(translation);           // adds translation to the arraylist
    }
    public ArrayList<String> translate(String word){
        
        if (this.dict.get(word) == null){
            return new ArrayList<String>();
        }
        
        return this.dict.get(word);
        
    }
    
    public void remove(String word){
        this.dict.remove(word);
    }
    
    public static void main(String[] args) {
        
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
