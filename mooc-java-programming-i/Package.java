package mooc;

import java.util.ArrayList;

public class Package {								// to add gifts and count gifts total weight

	ArrayList<Gift> gifts;						// object arrray list, <type of variable>.
	
	public Package() {
		gifts = new ArrayList<>();
	}
	
	public void addGift(Gift gift) {
		
		gifts.add(gift);
	
	}
	
	public int totalWeight() {
		
		int total =0;
		
		for (Gift i : gifts) {		//for each:  you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
			total += i.getWeight();
			
		}
		return total;
	}
	public static void main(String[] args) {
		
		   Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
		   Package gifts = new Package();
	        
	        gifts.addGift(book);

	        System.out.println(gifts.totalWeight());
	}

}
