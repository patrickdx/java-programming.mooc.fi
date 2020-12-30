package mooc;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe_book {

	private String name;
	private int time;
	private List<String> ingredients;
	
	public Recipe_book(String name, int time, List<String> list) {
		this.name  = name;
		this.time = time;
		this.ingredients = list;
		
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public List<String> getIngredients() {
		
		return this.ingredients;
		
	}
	
	public String toString() {
		
		return name + ", " + "cooking time: " + time ;
	}
	
	public static void main(String[] args) {

			
		
	}

}
