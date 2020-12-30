
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        ArrayList<Book> xd = new ArrayList<>();
        while (true){
            
            System.out.println("Input the name of the book, empty stops:");  
            name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation:");
            age =  Integer.parseInt(scanner.nextLine());
           
            xd.add(new Book (name, age));
            

        }
        System.out.println(xd.size() + " books in total.");
        System.out.println("Books:");
        
        
//        xd.stream().sorted().forEach(a -> System.out.println(a));               // sort by age recomeendations, if they are teh same, 
                                                                                  //sort by alphabetically.
        
        Comparator<Book> comparator = Comparator
              .comparing(Book::returnAge)      // compare ages
              .thenComparing(Book::returnName);     // if ages ==0, compare names.
       
        Collections.sort(xd, comparator);
      
        xd.stream().forEach(a -> System.out.println(a));
    }

}
