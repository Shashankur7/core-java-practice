// 13 
import java.util.Scanner;
class DigitCheck{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter dig : " );
		char ch = sc.next().charAt(0);
		String res = ( ch >= '0' && ch <= '9') ? " Digit " : " not Digit " ;
		System.out.println(res);
	}
}