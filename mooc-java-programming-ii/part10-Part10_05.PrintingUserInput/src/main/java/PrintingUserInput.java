
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        
        ArrayList<String> xd = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                xd.stream().forEach(name -> System.out.println(name));
                break;
            }
            xd.add(input);
        }
        
    }
}
