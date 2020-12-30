
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> pos = numbers.stream()
        .filter(number -> number>0)                         // parameter -> function body
        .collect(Collectors.toCollection(ArrayList::new));                  // collect and store filtered stream in arraylist.
        return pos;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
// 0 1 2 3 = 0 2 4 6
}
