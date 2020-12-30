package mooc;

public class book {			//OOP practice 
	
	private String author;
	private String name;
	private int pages;
	
	
	public book(String author, String name, int pages){
		
		this.author = author;
		this.name = name;
		this.pages = pages;
		
	}
	
	 public String getAuthor() {
		 return author;
	 }
	 
	 public String getName() {
		 return name;
	 }
	
	 public int getPages() {
		 return pages;
		
	 }
	 
	 public String toString() {
		 return author + ", " + name + ", " + pages + " pages";
	 }
	 
	public static void main(String[] args) {
		
		book potter = new book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
		System.out.println(potter);
	}

}
