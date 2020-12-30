
import java.util.HashMap;

public class Program {          // The order of the output can vary, because the implementation of hashmaps does not guarantee the order of the objects in it.

    public static void printKeys(HashMap<String,String> hashmap){
        System.out.println(hashmap.keySet());
        
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String i: hashmap.keySet()){       // loop thru keys
            if (i.contains(text)){
                System.out.println(i);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
         for (String i: hashmap.keySet()){       // loop thru keys
            if (i.contains(text)){
                System.out.println(hashmap.get(i));
            }
        }
    }
    
    
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
hashmap.put("f.e", "for example");
hashmap.put("etc.", "and so on");
hashmap.put("i.e", "more precisely");

printKeys(hashmap);
System.out.println("---");
printKeysWhere(hashmap, "i");
System.out.println("---");
printValuesOfKeysWhere(hashmap, ".e");
    }

}
