
import java.util.Scanner;

public class LiquidContainers {

   
	
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
                                            amount = container1;
					}
					
						container2 += amount;
						container1 -= amount;
					
					
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
