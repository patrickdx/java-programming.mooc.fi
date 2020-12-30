
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import sun.security.pkcs11.P11Util;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
 List<String> literacy = new ArrayList<>();

        try {
    Files.lines(Paths.get("literacy.csv"))        //   reading the file line by lime
    .forEach(person -> literacy.add(person));
            }
        
        catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
        literacy.stream().map(cut -> cut.split(",")).sorted((p1,p2) ->{
            return p1[5].compareTo(p2[5]);      // compare literacy rates, (strings at end) from least to greatest
        }).forEach(p -> System.out.println(p[3] + " (" + p[4] + ")," + p[2].replace(" (%)", "") + ", " + p[5]));
    }
                
        
    }

