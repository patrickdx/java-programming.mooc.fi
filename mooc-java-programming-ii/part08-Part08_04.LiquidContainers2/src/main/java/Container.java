    
import java.util.Scanner;

public class Container {

	private int storage;
	
	
	public Container() {
		this.storage = 0;
		
	}
	
	public int contains() {
		return this.storage;
	}
	
	public void add(int amount) {
		if (amount > 0) {

			this.storage += amount;
			if (this.storage > 100) {		// max capacity 
				this.storage =100;
			}
		}
		
	}
	
	public void remove(int amount) {
		if (amount>0) {
			this.storage -= amount;
			if (this.storage < 0) {
				this.storage =0;
			}
		}
		
	}
	
	public void move(Container container2, int amount) {
		
		if (this.storage >= amount && amount > 0) {				// checks if amount to be moved, actually exists in container1. 
			container2.storage += amount;
			this.storage -= amount;
			if (container2.storage > 100 ) {
				container2.storage =100;
			}
		}
		
	}
	
	public String toString() {
		return this.storage + "/100";
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}

