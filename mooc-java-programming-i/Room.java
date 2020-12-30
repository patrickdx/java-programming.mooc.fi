package mooc;

import java.util.ArrayList;

public class Room {

	ArrayList<Person> room;
	
	public Room() {
		room = new ArrayList<>();
	}
	
	public void add(Person person) {
		room.add(person);
	}
	
	public boolean isEmpty() {
		return room.isEmpty();
	}
	
	public ArrayList<Person> getPersons(){
		return room;
		
	}
	
	public Person shortest() {			// to find shortest height
		
		if (room.isEmpty()) {      // return a null reference if list is empty

			return null;
		}
	
		Person compare = room.get(0);
		
		for (Person i : room) {			//loops thru the list
			
			if (compare.getHeight() > i.getHeight()) {
				
				compare = i;		// object is copied on the shorter object height, after loop is done, compare has copied the object with the shortest height remains.
				
			}
			
		}
	
		return compare;
		
	}
	
	public Person take() {			// takes the shortest person in the room and removes it
		
		if (room.isEmpty()) {      // return a null reference if list is empty

			return null;
		}
	
		Person compare = room.get(0);
		
		for (Person i : room) {			//loops thru the list
			
			if (compare.getHeight() > i.getHeight()) {
				
				compare = i;		// object is copied on the shorter object height, after loop is done, compare has copied the object with the shortest height remains.
				
			}
			
		}
	
		room.remove(compare);		// compare is a reference to an object in the list with the smallest height, so that object is removed. 
		return compare;
		
		
	}
	
	public static void main(String[] args) {
		
		Room room = new Room();
		room.add(new Person("Lea", 183));
		room.add(new Person("Kenya", 182));
		room.add(new Person("Auli", 186));
		room.add(new Person("Nina", 172));
		room.add(new Person("Terhi", 185));

		System.out.println("");
		for (Person person : room.getPersons()) {
		    System.out.println(person);
		}

		System.out.println();
		System.out.println("Shortest: " + room.take());
		System.out.println("");
		for (Person person : room.getPersons()) {
		    System.out.println(person);
		}
		
	}

}
