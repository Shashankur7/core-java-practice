// 5) Assign performance rating (Excellent, Good, Average, Poor).

import java.util.Scanner;
class AssignmentRating{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if (marks >= 90)
		System.out.println("Excellent");
		else if (marks >= 80)
		System.out.println("Good");
		else if (marks >= 70 )
		System.out.println("Average");
		else
		System.out.println("poor");
	}
}