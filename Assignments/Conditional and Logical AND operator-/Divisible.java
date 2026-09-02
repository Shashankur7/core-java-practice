import java.util.Scanner;

class Divisible{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num :");
	
	int num = sc.nextInt();
	String res = (num % 5 == 0 && num % 10  == 0 ) ? " Divisible " : " not Divisible " ;
	System.out.println(res);
	} 
}