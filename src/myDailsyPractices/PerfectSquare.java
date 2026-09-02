package myDailsyPractices;
import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		System.out.println("Enter a num :");
		int num = new Scanner(System.in).nextInt();
		 boolean res = perfectSquare(num);
		
		 if(res==true) {
			 
			 System.out.println("Perfect square : "+ num);
		 }
	}
	public static boolean perfectSquare(int num) {
		for(int i =0 ; i<num; i++) {
			if(i*i ==num) {
				return  true;
			}
		}
		
		return false;
	}
}
