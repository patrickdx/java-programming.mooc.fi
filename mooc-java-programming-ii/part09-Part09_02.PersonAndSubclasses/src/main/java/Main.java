
import java.util.ArrayList;


public class Main {

    public static void printPersons(ArrayList<Person> persons){
        for (Person i : persons){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
Student s = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028"); 
System.out.print(s);
    }

}
