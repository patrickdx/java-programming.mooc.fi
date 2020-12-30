package mooc;

public class overloaded_counter {									// overloaded methods and constructors 
	
	private int value;
	
	public overloaded_counter(int startvalue) {
		this.value = startvalue;
		
	}
	
	public overloaded_counter() {
		this.value = 0;												// would do this(0) if the counter object had more atributes. 
	}
	
	public int value() {
		return this.value;
	}
	
	public void increase() {
	
		this.value = this.value + 1;
	}
	
	public void decrease() {
		this.value = this.value - 1;
	}
	
	public void increase(int increaseBy) {
		if (increaseBy>0) {
			this.value = this.value + increaseBy;
		}
	
		
	}
	
	public void decrease(int decreaseBy) {
		
		if (decreaseBy>0) {
			this.value = this.value - decreaseBy;
		}
	
	}
	
	public String toString() {
		return "value: " +  this.value;
	}
	
	public static void main(String[] args) {
		overloaded_counter count = new overloaded_counter();
		count.increase(5);
		count.decrease(-5);
		count.decrease(5);

		overloaded_counter count1 = new overloaded_counter(25);

		System.out.println(count);
		System.out.println(count1);

	}

}
