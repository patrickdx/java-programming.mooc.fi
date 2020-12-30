package mooc;

public class Person1 {

	private String name;
	private Pet pet1;
	
	public Person1(String name, Pet pet){
		this.name = name;
		pet1 = pet;
	}
	public String toString() {
		return this.name + " has a friend called " + pet1;
	}
	
	public static void main(String[] args) {

		
		Pet lucy = new Pet("Lucy", "golden retriever");
		Person1 leo = new Person1("Leo", lucy);

		System.out.println(leo);
		
		
		
		
		
			// we want Leo, has a friend called Lucy (golden retriever)


	}

}
