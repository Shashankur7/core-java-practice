import java.util.Scanner;

class PositiveEvenNumber1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : " );
		int num = sc.nextInt();
		
		String res = (num > 0 && num % 2 == 0 ) ? "Positive even" : "Not Positive Even";

		System.out.println(res);
	}
}