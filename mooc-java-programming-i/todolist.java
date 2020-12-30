package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class todolist {

	private ArrayList<String> list;
	
	public todolist() {
		this.list = new ArrayList<String>();
	}
	
	public void add(String task) {
		list.add(task);
	}
	
	public void print() {
		int index =0;
	for (String i : list) { 
	index++;
		
	    System.out.println(index+"." + i); 	
	    
	    }
		
	}
	
	public void remove(int number) {
		list.remove(number-1);
	}
	
	public static void main(String[] args) {
		todolist list = new todolist();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Scanner scanner = new Scanner(System.in);
		userInterface ui = new userInterface(list, scanner);
		ui.start();
		list.print();
	}

}
