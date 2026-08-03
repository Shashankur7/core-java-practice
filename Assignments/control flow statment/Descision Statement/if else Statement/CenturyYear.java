// 6) Check if year is century year or not

import java.util.Scanner;
	
class CenturyYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		
		if (year % 100 == 0)
		System.out.println("century year " );
		else 
		System.out.println("not Centuty year");
	}
}