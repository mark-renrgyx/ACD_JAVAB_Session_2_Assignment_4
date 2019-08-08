package week1.day2;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		int super_special_number = Integer.parseInt(args[0]);
		
		if (super_special_number > 0)
			System.out.println("You Have Entered Positive Value");
		
		else if (super_special_number == 0)
			System.out.println("You Have Entered Zero");
		
		else // negative
			System.out.println("You Have Entered Negative Value");
		
		// Now we take three grades and give score
		Scanner in = new Scanner (System.in);
		float[] scores = new float[3];
		
		System.out.println("We will take three grades.");
		
		System.out.println("Physics score?");
		scores[0] = in.nextFloat();
		
		System.out.println("Chemistry score?");
		scores[1] = in.nextFloat();
		
		System.out.println("Math score?");
		scores[2] = in.nextFloat();
		
		float average = (scores[0] + scores[1] + scores[2]) / 3;
		
		System.out.println("Average: " + Float.toString(average));
		
		char grade;
		
		if (average > 70)
			grade = 'A';
		else if (average >= 61)
			grade = 'B';
		else
			grade = 'C';
		
		System.out.println("Grade: " + grade);
		
		in.close();
	}
}
