
import java.util.Scanner;

public class UserInterface {

	 private Scanner scanner;
	 private TodoList list;
	 
	
	public UserInterface(TodoList object, Scanner scanner) {
                this.list = object;
		this.scanner = scanner;
		
	}
	
	public void start() {			// constant running loop, acts as the start of the UI.
		
		while (true) {
			System.out.print("Command:");
			String word = scanner.nextLine();
			
			if (word.equals("stop")){					// IMPORTANT THAT STOP COMMAND IS BEFORE EVERY OTHER COMMAND! 
				break;
			}
			
			if (word.equals("add")) {
				System.out.println("To add:");
				word = scanner.nextLine();
				list.add(word);
			}
			
                        else if (word.equals("list")) {
				list.print();
			}
			
                        else if (word.equals("remove")) {
				System.out.println("Which one is removed?");
				word = scanner.nextLine();
				list.remove(Integer.parseInt(word));
			}
			
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
	
		
	}

}
