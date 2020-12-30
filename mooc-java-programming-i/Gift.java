package mooc;

public class Gift {

	private int weight;
	private String name;
	
	public Gift(String name, int weight) {
		this.weight = weight;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int getWeight() {
		return this.weight;
	
	}
	
	public String toString() {
		return this.name + "(" + this.weight + " kg" + ")";
	}
	
	public static void main(String[] args) {
		 Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

	        System.out.println("Gift's name: " + book.getName());
	        System.out.println("Gift's weight: " + book.getWeight());

	        System.out.println("Gift: " + book);
	}

}
