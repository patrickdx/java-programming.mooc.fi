
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import sun.security.krb5.internal.KDCOptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class VehicleRegistry {
   
    private HashMap<LicensePlate,String> owners1;
    
    public VehicleRegistry(){
        this.owners1 = new HashMap<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.owners1, other.owners1)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.owners1);
        return hash;
    }

 
   
    
    public boolean add(LicensePlate licensePlate, String owner){
        
         for (LicensePlate i : owners1.keySet()){         //look thru all the keys
             if (i.equals(licensePlate)){                 // license has already been registered.
                     return false;
                 }
        }
                 owners1.put(licensePlate, owner);    // if no owner found
           
       
       
        
       return true;
    }
    public void printLicensePlates(){
        for (LicensePlate i: owners1.keySet()){
            System.out.println(i);
        }
    }
    public void printOwners(){      //      Each name should only be printed once, even if a particular person owns more than one car.
        Set<String> names = new HashSet<>(owners1.values());

        for (String i: names){
            System.out.println(i);
        }
    }
    
    public String get(LicensePlate licensePlate){
        return owners1.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        
        if (owners1.remove(licensePlate) == null){          // if not found
        return false;
    }
            
        owners1.remove(licensePlate);
        
    
        return true;
    }
    
}
