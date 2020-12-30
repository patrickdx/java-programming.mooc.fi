package mooc;

import java.util.Scanner;

public class userInterface {

	 private Scanner scanner;
	 private todolist list;
	 
	
	public userInterface(todolist object, Scanner hi) {
		this.scanner = hi;
		this.list = object;
	}
	
	public void start() {			// constant running loop, acts as the start of the UI.
		
		while (true) {
			System.out.println("Command:");
			String word = scanner.nextLine();
			
			if (word.equals("stop")){					// IMPORTANT THAT STOP COMMAND IS BEFORE EVERY OTHER COMMAND! 
				break;
			}
			
			if (word.equals("add")) {
				System.out.println("To add:");
				word = scanner.nextLine();
				list.add(word);
			}
			
			if (word.equals("list")) {
				list.print();
			}
			
			if (word.equals("remove")) {
				System.out.println("which one to remove?");
				word = scanner.nextLine();
				list.remove(Integer.parseInt(word));
			}
			
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
			
		   todolist ui = new todolist();

		    userInterface userInterface = new userInterface(set, scanner);
		    userInterface.start();
	}

}
