package mooc;

import java.util.ArrayList;

public class bird {								// this class acts like a database

	private ArrayList<birdUI> Birds;
	
	public bird() {
		Birds = new ArrayList<birdUI>();
	
	}
	
	public void add(String name, String latin, int times) {	
		Birds.add(new birdUI(name, latin, times));
		
	}
	
	public void printBirds() {
		for (birdUI i : Birds) {						// birdname exists in database
			System.out.println(i);
		}
	}
	
	public boolean exists(String birdname) {
		
		for (birdUI i : Birds) {						// birdname exists in database
			if (i.getName().equals(birdname)) {
				return true;
			}
		}
		return false;
		
	}
	
	
	public void observed(String birdname) {								// if observed, add an observation to the database
		
		for (birdUI i : Birds) {
			if (i.getName().equals(birdname)) {
				i.setObservedtimes();
		}
		}
	}
	
	public void printOne(String name) {
		
		for (birdUI i: Birds) {
			if (i.getName().equals(name)) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {

	}

}
