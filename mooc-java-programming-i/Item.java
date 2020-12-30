package mooc;

public class Item {

	private int weight;
	private String name;
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
		
	}
	public String toString() {
		return this.name + " (" + this.weight + " kg" + ")";
	}
	
	
	
	public static void main(String[] args) {
		 Item book = new Item("The lord of the rings", 2);
	        Item phone = new Item("Nokia 3210", 1);

	        System.out.println("The book's name: " + book.getName());
	        System.out.println("The book's weight: " + book.getWeight());

	        System.out.println("Book: " + book);
	        System.out.println("Phone: " + phone);
	}

}
