

public class Checker {
    
    public boolean isDayOfWeek(String string){      // regular expression: check if input string is of desired format;
    
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
            
           
    }
    
    public boolean allVowels(String string){
        if (string.matches("[aeiou]+")){
            return true;
        }
        return false;
    }
    public boolean timeOfDay(String string){   // hh:mm:ss
        if (string.matches("(2[0-3]|[0-1][0-9]):[0-5][0-9]:[0-5][0-9]")){        // [] lookls at every character
            return true;
            
        }
        return false;
    }
}
