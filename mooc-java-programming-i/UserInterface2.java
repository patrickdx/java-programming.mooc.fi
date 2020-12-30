package mooc;

import java.util.Scanner;

public class UserInterface2 {

	private Scanner scanner;
	private JokeManager joke;
	
	public UserInterface2(JokeManager joke, Scanner scanner) {
		this.scanner = scanner;
		this.joke = joke;
	}
	
	public void start() {  				//to start UI, last project of part-6/2-separating-user-interface-from-program-logic
		
		while (true) {
			System.out.println("\nCommands:");
			System.out.println("1 - add a joke");
			System.out.println("2 - draw a joke");
			System.out.println("3 - list jokes");
			System.out.println("x - stop");
			String input = scanner.nextLine();
			
			if (input.equals("x")) {
				break;
			}
			
			if (input.equals("1")) {
				System.out.println("Write the joke to be added:");
				input = scanner.nextLine();
				joke.addJoke(input);
			}
			
			if (input.equals("2")) {
				System.out.println(joke.drawJokes());
			}
			
			if (input.equals("3")) {
				System.out.println("printing jokes");
				joke.printJokes();
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		JokeManager joke = new JokeManager();
		Scanner scanner = new Scanner (System.in);
		
		UserInterface2 UI = new UserInterface2(joke, scanner);
		UI.start();
		
	}

}
