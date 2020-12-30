package mooc;

import java.util.ArrayList;

public class Searching {

	public static int LinearSearch(int[] array, int search) {					// Linear search. 
	
		for (int i=0; i<array.length; i++) {
			if (search == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int search) {				// Binary search, needs for array to be sorted. 
		
		int first =0;
		int last = array.length-1;
		int mid = (first+last)/2;
		
		 while( first <= last ){  
		        //if the mid < key, then key to be searched is in the first half of array
		        if ( array[mid] < search ){  
		            first = mid + 1;     
		        }else if ( array[mid] == search ){ 
		            //if key = element at mid, then print the location
		            return mid;
		        }else{  
		            //the key is to be searched in the second half of the array
		            last = mid - 1;  
		        }  
		        mid = (first + last)/2;  
		   }  
		   //if first and last overlap, then key is not present in the array
		   if ( first > last ){  
		      return -1;
		   }       
		return -1;
	}
	
	public static void main(String[] args) {						// Binary search and Linear search

		
		int[] array = {1,2,3,4,5,6,7, 9, 100};
		
		
		System.out.println(LinearSearch(array, 7));
		System.out.println(binarySearch(array, 9));

	}

}
