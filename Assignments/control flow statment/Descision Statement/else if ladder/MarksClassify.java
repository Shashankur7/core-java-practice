// 9) Marks classification.

import java.util.Scanner;
class MarksClassify{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();

		if (marks >= 90)
		System.out.println("A grade");
		else if (marks >= 80)
		System.out.println("B grade ");
		else if (marks >= 70 )
		System.out.println("C grade ");
		else
		System.out.println("D grade ");
	}
}