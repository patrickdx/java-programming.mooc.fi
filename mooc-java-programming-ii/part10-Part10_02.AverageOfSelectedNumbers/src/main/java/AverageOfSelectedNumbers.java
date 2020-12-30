
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {     //stream does not change values in orginial data collection, it simply porocesses them.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        String row;
        System.out.println("Input numbers, type \"end\" to stop.");
         

        
        while (true){
            
             row = scanner.nextLine();

            if (row.equals("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)"); 
                row = scanner.nextLine();
                break;
              
            }
            inputs.add(row);            // add inputs and the end, and do streams at the end of input. 

            
        }
        
         if (row.equals("n")){
                    System.out.println("fuck u");
                double average = inputs.stream()
                 .mapToInt(s -> Integer.valueOf(s))
                 .filter(number -> number < 0)
                 .average()
                 .getAsDouble();
                 System.out.println(average);
                    
                }

           
                if (row.equals("p")){                                 
                  double average = inputs.stream()                  // this  should just be 1 line but we space it!

                 .mapToInt(s -> Integer.valueOf(s))
                 .filter(number -> number > 0)
                 .average()
                 .getAsDouble();
                  System.out.println(average);

                }
         
    }
}
