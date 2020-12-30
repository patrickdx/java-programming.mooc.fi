package mooc;

import java.util.ArrayList;

public class MessagingService {
	

	private String name;
	
	public MessagingService(String name, ArrayList<String> alphabet) {
		
		this.name = name; 

	}

	
	public static void main(String[] args) {
		
	ArrayList<String> alphabet = new ArrayList<String>();		
	
		MessagingService s = new MessagingService("alphabet", alphabet);
		System.out.println(s);

		System.out.println();

		s.add("a");
		System.out.println(s);

		System.out.println();

		s.add("b");
		System.out.println(s);

		System.out.println();

		s.add("c");
		System.out.println(s);
	}

}
