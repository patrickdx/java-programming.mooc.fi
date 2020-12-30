package mooc;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {			// separating a program into the program logic and user interface is very good for maintenance!

	private ArrayList<String> jokes;
	
	public JokeManager() {
		jokes = new ArrayList<String>();
	}
	
	public void addJoke(String joke) {
		jokes.add(joke);
	}
	
	public String drawJokes() {					//chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
		
		Random rand = new Random(); 
		
		if (jokes.size() == 0) {
			return "Jokes are in short supply.";
		}
        return jokes.get(rand.nextInt(jokes.size())); 
		
	}
	
	public void printJokes() {
		for (String i : jokes) {
			System.out.print(i + ",  ");
		}
	}
	
	public static void main(String[] args) {
		JokeManager manager = new JokeManager();
		manager.addJoke("What is red and smells of blue paint? - Red paint.");
		manager.addJoke("What is blue and smells of red paint? - Blue paint.");

		System.out.println("Drawing jokes:");
		for (int i = 0; i < 5; i++) {
		    System.out.println(manager.drawJokes());
		}

		System.out.println("");
		System.out.println("Printing jokes:");
		manager.printJokes();
	}

}
