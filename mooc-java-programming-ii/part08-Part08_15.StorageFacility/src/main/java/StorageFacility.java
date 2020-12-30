
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageunit;    
    
    public StorageFacility(){
        this.storageunit = new HashMap<>();
    }
   
    public void add(String unit, String item){
        
        this.storageunit.putIfAbsent(unit, new ArrayList<>());      // if no key has no arraylist, assigns arraylist as value
        
        this.storageunit.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
      
        if (this.storageunit.get(storageUnit) == null){         // if no value assigned to key 
            return new ArrayList<String>();
        }
        
        return this.storageunit.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item){
    
        this.storageunit.get(storageUnit).remove(item);
        
        if (this.storageunit.get(storageUnit).isEmpty()){           // if arraylist is empty, remove entire unit.
           this.storageunit.remove(storageUnit);
        }
    }
    
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> not_emptyunits = new ArrayList<>();
        
        for (String i : storageunit.keySet()){
            if (storageunit.get(i).isEmpty() == false || storageunit.get(i) != null){           // storageunit contains item
                not_emptyunits.add(i);
        }
        
    }
        return not_emptyunits;
    }
    
    public static void main(String[] args) {
        
StorageFacility facility = new StorageFacility();
facility.add("a14", "ice skates");
facility.add("a14", "ice hockey stick");
facility.add("a14", "ice skates");

facility.add("f156", "rollerblades");
facility.add("f156", "rollerblades");

facility.add("g63", "six");
facility.add("g63", "pi");

facility.remove("f156", "rollerblades");

System.out.println(facility.contents("f156"));

facility.remove("f156", "rollerblades");

System.out.println(facility.storageUnits());

    }
}
