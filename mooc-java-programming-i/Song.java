package mooc;

public class Song {

	private String name, author;
	private int pages; 
	
	public Song(String name, String author, int pages) {
		this.name = name;
		this.author = author;
		this.pages = pages;
	}
	
	public boolean equals (Object compared) {
		
		 // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        Song comparedSimpleDate = (Song) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.name == comparedSimpleDate.name &&
            this.author == comparedSimpleDate.author &&
            this.pages == comparedSimpleDate.pages) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
       
	
	
	public static void main(String[] args) {
		Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
		Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

		

if (jackSparrow.equals(anotherSparrow)) {
    System.out.println("Songs are equal.");
}

	if (jackSparrow.equals("Another object")) {
    System.out.println("Strange things are afoot.");
}
	

	
	}

}
