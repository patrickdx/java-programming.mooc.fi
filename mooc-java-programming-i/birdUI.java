package mooc;

import java.util.Scanner;


public class birdUI {

	
	private String name;
	private String latinName;
	private int observedtimes;
	static Scanner scanner = new Scanner(System.in);
	
	
	public birdUI(String name, String latinName, int observedtimes) {
		this.name = name;
		this.latinName = latinName;
		this.observedtimes = observedtimes;
	}
	
	public String getName() {								// get and set methods
		return this.name;
	}
	
	public String getlatinName() {
		return this.latinName;
	}
	
	public int getObersvedtimes() {
		return this.observedtimes;
	}
	
	public void setObservedtimes() {
		this.observedtimes += 1;
	}
	
	public static void isAlpha(String name) {			// check if string contains letters only, recursion angle
	    if(name.replaceAll("\\s+","").matches("[a-zA-Z]+") == false) {				// remove spaces
	    	System.out.println("Invalid input!");
	    	String lol =scanner.nextLine();
	    	birdUI.isAlpha(lol);
	    	
	    }
	}
	
	
	public String toString() {
		return this.name + "(" + this.latinName + ")" + ":" + this.observedtimes + "observations";
	}
	
	public static void main(String[] args) {
		
		bird bird = new bird();
		
		
		while(true) {
			
			
			System.out.print("?");
			String input = scanner.nextLine();
			
			birdUI.isAlpha(input);
			
			if (input.equals("Quit")) {
				break;
			}
			
		
			if (input.equals("Add")) {
				
			System.out.print("Name: ");	
			String birdname = scanner.nextLine();
			birdUI.isAlpha(birdname);

			System.out.print("Name in Latin: ");
			String birdLatin = scanner.nextLine();
			birdUI.isAlpha(birdLatin);
			
			bird.add(birdname, birdLatin, 0);
			
			}
			
			if (input.equals("Observation")) {
				System.out.print("Bird? ");
				input = scanner.nextLine();
				birdUI.isAlpha(input);
				
				
				if (bird.exists(input) == true) {						// marks an observation for the bird, it has to be present in the database.
					bird.observed(input);
				}
				else {
					System.out.println("Not a Bird!");
				}
			}
			
			if (input.equals("All")) {
				bird.printBirds();
			}
			
			if (input.equals("One")) {
				System.out.print("Bird?");
				input = scanner.nextLine();
				birdUI.isAlpha(input);
				
				bird.printOne(input);
			}
			
			
		
			
			

		}
		
	
		
	}



}
