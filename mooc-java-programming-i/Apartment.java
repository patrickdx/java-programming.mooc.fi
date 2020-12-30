package mooc;

public class Apartment {
	 private int rooms;
	    private int squares;
	    private int pricePerSquare;;

	public Apartment(int rooms, int squares, int pricePerSquare) {
		
		 this.rooms = rooms;
	      this.squares = squares;
	      this.pricePerSquare = pricePerSquare;
	}
	
	public boolean largerThan(Apartment b) {
		
		if (this.rooms * this.squares > b.rooms * b.squares) {			// if a>b
			return true;
		}
		else return false;
		
	}
	
	public int priceDifference(Apartment b) {
		return Math.abs((this.squares * this.pricePerSquare) - (b.squares * b.pricePerSquare));
	}
	
	
	public boolean moreExpensiveThan(Apartment b) {
		
		if (this.squares * this.pricePerSquare > b.pricePerSquare * b.squares) {
			return true; 
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
		Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
		Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

		System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
		System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
		
		System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
		System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
		
		System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
		System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
		
	}

}
