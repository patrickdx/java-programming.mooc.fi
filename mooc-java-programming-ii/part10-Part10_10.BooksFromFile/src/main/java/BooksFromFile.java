
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();

        try {
    Files.lines(Paths.get(file))        //   reading the file line by line

    .map(row -> row.split(","))                     // splits the line into array of strings, processes the rows in the files ONE BY ONE.
    .map(parts -> new Book (parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
    .forEach(person -> books.add(person));
            }
        
        catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
        return books;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        

    }

}
