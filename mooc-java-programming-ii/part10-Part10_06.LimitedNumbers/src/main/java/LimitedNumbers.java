
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> xd = new ArrayList<>();
        
    while (true){
            int input = scanner.nextInt();
            if (input < 0){
                xd.stream().filter(num -> num <= 5 && num >=1).forEach(s -> System.out.println(s));
                break;
            }
            xd.add(input);
        }
    }
}
