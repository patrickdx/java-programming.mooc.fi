package mooc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import java.nio.file.Paths;
public class Recipe_bookUI {

	static ArrayList<String> allrecipes = new ArrayList<String>();					// all recipes 
	static ArrayList<Recipe_book> recipesplit = new ArrayList<Recipe_book>();
	
	
	public static void recipeSplit() {
		

		System.out.println(allrecipes);

		int nameIndex =0;
		int timeIndex =1;
		
		while (true) {
			
			
			List<Integer> indexList = new ArrayList<>();
			
			for (int i=0; i<allrecipes.size(); i++) {			// finds the indexes of the whitespaces in the recipe list. 
				if (allrecipes.get(i).equals("")){
					indexList.add(i);
				}
			}
			System.out.println(indexList.get(0));
			for (int i=0; i<indexList.size(); i++) {
								
					
					String name = allrecipes.get(nameIndex);
					int time = Integer.parseInt(allrecipes.get(timeIndex));
					recipesplit.add(new Recipe_book(name, time, allrecipes.subList(timeIndex+1, indexList.get(i))));
			
//					allrecipes.subList(0,g+1).clear();		// removes the added food from the array list (name, time, and its ingredients), XXXXX DO NOT REMOVE ELEMENT WHEN INTERATING THRU ARRAYLIST	
					
					nameIndex = indexList.get(i)+1;
					timeIndex = indexList.get(i)+2;
					
					
				
				
			}
				break;					// final food left in list, leave loop
			
			
		}
		recipesplit.add(new Recipe_book(allrecipes.get(nameIndex), Integer.parseInt(allrecipes.get(timeIndex)), allrecipes.subList(timeIndex+1, allrecipes.size())));   							// last food remaining in array list without space 


		
		for (String i: recipesplit.get(2).getIngredients()) {
			System.out.println(i);
		}
		

	}
	
	
	
	public static void main(String[] args) {
		
	
		
		Scanner scanner1 = new Scanner (System.in);
		
		System.out.println("Files to read: ");
//		String filename = scanner1.nextLine();
				
		// we create a scanner for reading the file
		try (Scanner scanner = new Scanner(Paths.get("recipe.txt"))) {

		    // we read the file until all lines have been read
		    while (scanner.hasNextLine()) {
		    	
		        // we read one line
		        String row = scanner.nextLine();
		        // we print the line that we read
		        allrecipes.add(row);
		        
		    }
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}	
		
		Recipe_bookUI.recipeSplit();
		
		
		
		System.out.println("\nCommands: ");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");

		
		while (true) {
			
			System.out.println("\nenter command:");
			String userInput = scanner1.nextLine();
			
			
			if (userInput.equals("stop")) {
				break;
			}
			
			if (userInput.equals("list")) {
				System.out.println("\nRecipes: ");
				for (Recipe_book i : recipesplit) {
					System.out.println(i);
					
				}
				
			}
			
			if (userInput.equals("find name")) {
				
				System.out.println("Searched word: ");
				userInput = scanner1.nextLine();
				
				for (Recipe_book i : recipesplit) {
					if (i.getName().contains(userInput)) {
						System.out.println(i.getName());
					}
				
			}
			}
			
			if (userInput.equals("find cooking time")) {
				System.out.print("Max cooking time: ");
				userInput = scanner1.nextLine();
				System.out.println("\nRecipes: ");
				
				for (Recipe_book i : recipesplit) {
					if (i.getTime() <= Integer.parseInt(userInput)) {
						System.out.println(i);
					}
				
				}
			}

			if (userInput.equals("find ingredient")) {
				
				System.out.print("Ingredient: ");
				userInput = scanner1.nextLine();
				
				for (Recipe_book i : recipesplit) {
					for (String a : i.getIngredients()) {
						if(a.equals(userInput)) {
							System.out.println(i);
						}
					}
						
					
					
				}
				
			}

				
			}
			
		}
		
	}
	

