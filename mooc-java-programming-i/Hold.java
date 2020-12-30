package mooc;

import java.util.ArrayList;

public class Hold {

	private int maxweight;
	private ArrayList<Suitcase> hold;
	
	public Hold(int weight) {
		this.maxweight = weight;
		hold = new ArrayList<>();
		
	}
	
	public void addSuitcase(Suitcase suitcase) {
		
int holdweight = 0;
		
		for (Suitcase i : hold) {
			holdweight += i.totalWeight();
		}
		
		if (holdweight < this.maxweight) {
			hold.add(suitcase);

		}
		
	}
	public void printItems() {

		for (Suitcase i: hold) {
					i.printItems();
		}
	}
	
	public String toString() {
		
		int holdweight = 0;
		
		for (Suitcase i : hold) {
			holdweight += i.totalWeight();
		}
		return hold.size() + " suitcases (" + holdweight + "kg)"; 
		
	}
	
	public static void main(String[] args) {

		  Item book = new Item("Lord of the rings", 2);
	        Item phone = new Item("Nokia 3210", 1);
	        Item brick = new Item("brick", 4);

	        Suitcase adasCase = new Suitcase(10);
	        adasCase.addItem(book);
	        adasCase.addItem(phone);

	        Suitcase pekkasCase = new Suitcase(10);
	        pekkasCase.addItem(brick);

	        Hold hold = new Hold(1000);
	        hold.addSuitcase(adasCase);
	        hold.addSuitcase(pekkasCase);

	        System.out.println("The suitcases in the hold contain the following items:");
	        hold.printItems();
	}

}
