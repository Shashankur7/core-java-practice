import java.util.Scanner;
class Reversenum{
	
	static void revnum(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		int ld = 0;
		int rev = 0;
		
		while(num > 0){
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args){
		revnum();
	}
}