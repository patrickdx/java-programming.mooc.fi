package mooc;

public class Person {

		private String name;
		private int age, height, weight;
		
	public Person (String name,int age, int height, int weight) {
		
		this.name = name;
		this.age= age;
		this.weight = weight;
		this.height = height;
		
	}
	
	public Person(String string, int i) {		// for room.java
		this.name = string;
		this.height = i;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWeight(int number) {
		weight = weight + number;
	}
	
	public String toString() {
		return this.name + " (" + this.height + " cm" + ")";
	}
	
	
	
}
