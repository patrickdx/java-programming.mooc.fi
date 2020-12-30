package mooc;

import java.util.ArrayList;

public class Suitcase {

	private int maxweight;
	private ArrayList<Item> items;
	private int currentweight;
	public Suitcase(int weight) {
		
		this.maxweight = weight;
		this.items = new ArrayList<>();
		currentweight = this.maxweight;
	}
	
	public void addItem(Item item) {		//The class Suitcase should ensure that the total weight of the items within it does not exceed the maximum weight limit
		
		
		if (this.maxweight >= item.getWeight()) {
			items.add(item);
			this.maxweight -= item.getWeight();
			
			currentweight = 5;
			currentweight  = currentweight - this.maxweight;
			
			
		}
	}
	public void printItems () {
				
		for (Item i : items) {
			System.out.println(i);
		}
	}
	
	public int totalWeight() {
		
		
		int totalweight =0;
		
		for (Item i : items) {
			totalweight += i.getWeight();
		}
		return totalweight;
	}
	
	public Item heaviestItem() {
		
		if (items.isEmpty()) {
			return null;
		}
		
		Item compare = items.get(0);

		for (Item i : items) {
			
			if(compare.getWeight() < i.getWeight()) {
				compare =i;
				
			}
			
			
		}
		return compare;
		
	}
	
	
	
	public String toString() {
		
		if (items.size() ==0) {
			return "no items (0 kg)";
		}
		
		if (items.size() ==1) {
			return "1 item " + "(" + currentweight + " kg)";
		}
		return items.size() + " items " + "(" + currentweight + " kg)";
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
