package mooc;

public class healthstation {
	 private int weighings;
	
	public healthstation() {
		this.weighings = 0;
	}
	
	  public int weigh(Person person) {			//object parameter
		  this.weighings++;
		  return person.getWeight();
	        
	    }
	  
	  public void feed (Person person) {						// sets child weight +1
		person.setWeight(1);
	  }
	  
	  public int weighings() {
			

		  return this.weighings;

	  }
	  
	public static void main(String[] args) {
		
		healthstation childrensHospital = new healthstation();

	    Person ethan = new Person("Ethan", 1, 110, 7);
	    Person peter = new Person("Peter", 33, 176, 85);

	    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
	    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
	    
	    childrensHospital.feed(ethan);
	    childrensHospital.feed(ethan);
	    childrensHospital.feed(ethan);

	    System.out.println("");

	    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
	    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
	    
	    

	    System.out.println("weighings performed: " + childrensHospital.weighings());

	    childrensHospital.weigh(ethan);
	    childrensHospital.weigh(peter);

	    System.out.println("weighings performed: " + childrensHospital.weighings());

	    childrensHospital.weigh(ethan);
	    childrensHospital.weigh(ethan);
	    childrensHospital.weigh(ethan);
	    

	    childrensHospital.weigh(ethan);

	    System.out.println("weighings performed: " + childrensHospital.weighings());
	}

}
