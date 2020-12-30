package mooc;

public class Pet {

	private String name, breed;
	
	public Pet(String name, String breed){
		
		this.name = name;
		this.breed = breed;
		
	}
	public static void main(String[] args) {

	}
	
	public String toString() {
		return name + "(" + breed + ")";
	}

}
