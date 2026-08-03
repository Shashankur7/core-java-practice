import java.util.Scanner;
class ThreeDigit{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num = sc.nextInt();
		String res = (num >= 100 && num <= 999 ) ? " Three Digit " : " Not Three Digit " ;
		System.out.println(res);
	}
}