package mooc;

import java.util.Scanner;

public class liquidcontainersUI {

	private Container container;
	private Container container2;
	private Scanner scanner;
	
	public liquidcontainersUI(Scanner scanner, Container container, Container container2 ) {
		this.container = container;
		this.container2 =container2;
		this.scanner = scanner;
		
	}
	
	public void start() {				// UI LOOP, uses methods in the other class!
		
		while (true) {
			
			System.out.println("First: " + container);
			System.out.println("Second: " + container2);
			String input = scanner.nextLine();
			
			
			String[] parts = input.split(" ");										// "add 2"
			String command = parts[0];
			if (command.equals("quit")) {
				break;
			}
			int amount = Integer.valueOf(parts[1]);
			
			
			
			
			if (command.equals("add")) {
				container.add(amount);
			
			}
			
			if (command.equals("move")) {
				container.move(container2, amount);
				
			}

			if (command.equals("remove")) {
				container2.remove(amount);
			
			}
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {				// UI main method does 3 things: initalize class, scanner, and object with does two as parameters, and starts the ui method: UI.Start();

		Container container = new Container();
		Container container2 = new Container();
		Scanner input = new Scanner(System.in);
		
		liquidcontainersUI UI = new liquidcontainersUI (input, container, container2);
		
		UI.start();
		
		
		
	}

}
