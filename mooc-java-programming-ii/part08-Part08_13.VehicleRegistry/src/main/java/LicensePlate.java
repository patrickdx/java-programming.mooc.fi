
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.liNumber);
        hash = 41 * hash + Objects.hashCode(this.country);
        return hash;
    }

 
   

    @Override
    public boolean equals(Object obj) {
       // if the variables are located in the same place, they're the same
    if (this == obj) {
        return true;
    }

   // if comparedObject is not of type Book, the objects aren't the same
   if (!(obj instanceof LicensePlate)) {
        return false;
    }

    // create object that has same type as class.
    LicensePlate hehe = (LicensePlate) obj;
    
    //last resort.
    
    // if the instance variables of the objects are the same, so are the objects
    if (this.liNumber.equals(hehe.liNumber) &&
        this.country.equals(hehe.country))
        {
        return true;
    }

    // otherwise, the objects aren't the same
    return false;
}
    }
    
   

