package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {                // passing in parameters into GUI
        System.out.println("Enter a title for the GUI");
        Scanner scanner = new Scanner(System.in);              
        String title = scanner.nextLine();
        
        Application.launch(UserTitle.class, "--title=" + title);          // The key-value pairs are given to the launch method in the form: --key = value

    }

}
