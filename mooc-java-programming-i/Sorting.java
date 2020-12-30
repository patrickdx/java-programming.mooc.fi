package mooc;

import java.util.Arrays;

public class Sorting {

	public static int smallest (int [] array) {
		
		Arrays.sort(array);
		return array[0];
	}
	
	public static int indexOfSmallest(int[] array){
		return array[0];
		
	}
	
	
	
	public static void main(String[] args) {

		int[] numbers = {6, 5, 8, 7, 11};
		System.out.println("Smallest: " + Sorting.smallest(numbers));
		System.out.println("Index of the smallest number: " + Sorting.indexOfSmallest(numbers));
	}

}
