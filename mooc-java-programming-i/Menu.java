package mooc;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {														// OBJECTS IN A LIST 	
	
    private ArrayList<String> meals;

    
	public Menu() {
        this.meals = new ArrayList<>();

	}

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.addMeal("Tofu ratatouille");
		menu.addMeal("Chilli Coconut Chicken");
		menu.addMeal("Chilli Coconut Chicken");
		menu.addMeal("Meatballs with mustard sauce");

		menu.printMeals();
		menu.clearMenu();

		System.out.println();
		menu.addMeal("Tomato and mozzarella salad");
		menu.printMeals();
		
	}
	public void addMeal(String meal) {
	
		if (meals.contains(meal)) {			// if array list contains duplicate food, do nothing
			
		}
		else meals.add(meal);
	}
	
	public void printMeals() {
		System.out.println(meals);

	}
	
	public void clearMenu() {
		meals.clear();
	}
	
}
