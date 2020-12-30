package mooc;

import java.util.Scanner;

public class grade_statsUI {					// split big excercise into UI and functionalilty parts.

	private grade_stats grades;
	private Scanner scanner;


	
	public grade_statsUI(Scanner scanner, grade_stats grades ) {
		
		this.grades = grades;
		this.scanner = scanner;

	}
	
	
	public void start() {
	
		System.out.println("Enter point totals, -1 stops:");

		
		while (true) {
			
			
			String input = scanner.nextLine();
			int inputnum = Integer.valueOf(input);				// converts string to int 
			
			if (inputnum == -1) {
			

				System.out.println("point average (all): " + grades.average());
				System.out.println("point average (passing): " + grades.passingAverage());
				System.out.println("point average (passing): " + grades.passingPercentage());
				
				grades.gradeDistribution();													// make sure to call this before printing grades 
				
				System.out.println(grades);
				break;
			}
			
			
				
				grades.add(inputnum);
				
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {			// [0-100]

		Scanner scanner = new Scanner (System.in);
		grade_stats lol = new grade_stats();

		grade_statsUI xd = new grade_statsUI(scanner, lol);
		
		xd.start();
		
	}

}
