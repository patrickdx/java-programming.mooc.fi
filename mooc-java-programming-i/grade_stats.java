package mooc;

import java.util.ArrayList;

public class grade_stats {

	private ArrayList<Integer> grades;
	private ArrayList<Integer> passingGrades;
	private String [] gradeLetters;


	public grade_stats(){
		this.grades = new ArrayList<Integer>();
		this.passingGrades = new ArrayList<Integer>();
		this.gradeLetters = new String[]{"", "", "", "", "", ""};
	}
	
	
	
	public void add(int grade) {			// adds grade to arraylist. 
		
		if (grade >= 0 && grade <= 100) {
			this.grades.add(grade);

		}
		
		if (grade >= 50 && grade <= 100) {								// [0,100]
			this.passingGrades.add(grade);
		}
	
		
	}


	
	public  String average() {
		
		
		double sum = 0;
		
		for (int i=0; i<this.grades.size(); i++) {
			
			sum += this.grades.get(i);
			
		}
		
		return String.valueOf(sum/this.grades.size());
		
	}
	
	public String passingAverage() {
		
		double sum = 0;


		if (this.passingGrades.size() == 0) {
			return "-";
		}
		
		for (int i=0; i<this.passingGrades.size(); i++) {		// passing 
			
						
			sum += this.passingGrades.get(i);

				
			}
		
		return String.valueOf(sum/this.passingGrades.size());
	}

	
	
	public Double passingPercentage() {
		
		return (double) (100 * this.passingGrades.size() / this.grades.size());
		
		
	}
	
	
	
	public void gradeDistribution() {
		
		for (int i=0; i<grades.size(); i++) {
			
			
			int grade = this.grades.get(i);
			
			if (grade <50) {
				
				gradeLetters[0] += "*";
			}
			
			if (grade >= 50 && grade <60) {
				gradeLetters[1] += "*";
			}
			
			if (grade >= 60 && grade <70) {
				gradeLetters[2] += "*";
			}
			
			if (grade >= 70 && grade <80) {
				gradeLetters[3] += "*";
			}
			
			if (grade >= 80 && grade <90) {
				gradeLetters[4] += "*";
			}
			
			if (grade >= 90) {
				gradeLetters[5] += "*";
			}
		}
		
		
	}
	
	public String toString() {
	
		return "5:" + gradeLetters[5] + "\n4:" + gradeLetters[4] + "\n3:" + gradeLetters[3] + "\n2:" + gradeLetters[2] + "\n1:" + gradeLetters[1] + "\n0:" + gradeLetters[0];
		
	}
	
	public static void main(String[] args) {

//		ArrayList<Integer> grades =  new ArrayList<Integer>();
//		grades.add(1);
//		grades.add(3);
//		grades.add(5);
//		grades.add(45);
//		
//		System.out.println(grade_stats.average(grades));
		
	}

}
