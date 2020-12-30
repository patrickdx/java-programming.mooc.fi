package mooc;

import java.util.Scanner;

public class liquid_containers {				// Procedural programming			
	
	/*Let's create an interactive program to control two liquid containers. The containers are named "first" and "second". Each are capable of containing 100 liters of liquid at a time.

The program offers the functionality to add, move and remove liquid. Using the "add" command will add liquid to the first container, "move" will move liquid from the first container to the second container and "remove" will remove liquid from the second container.
*/
	
	

	public static void main(String[] args) {

		int container1 =0;
		int container2 =0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		
			System.out.println("First: " + container1 + "/100");
			System.out.println("Second: " + container2 + "/100");
			String input = scanner.nextLine();
			
			
			String[] parts = input.split(" ");
			String command = parts[0];
			
			if (command.equals("quit")) {
				break;
			}
			
			int amount = Integer.valueOf(parts[1]);
			
			
			
			if (command.equals("add")) {
				
				if(amount > 0) {
				
					container1 += amount;
					if (container1 > 100) {
						container1=100;
				}
					}
			}
			
			if (command.equals("move")) {
					
				if (container1 >0 && amount > 0) {				// checks if amount to be moved, actually exists in container1. 
					if (amount > container1) {
						container2 += container1;
						container1 = 0;
					}
					else {
						container2 += amount;
						container1 -= amount;
					}
					
					if (container1 <0) {
						container1=0;
					}
					
					if (container2 > 100 ) {
						container2 =100;
					}
				}
			}

			if (command.equals("remove")) {
				
			
					container2 -= amount;
					if (container2 <0) {
						container2=0;
					}
				
			}
			
			
			
		}
		
	}

}
