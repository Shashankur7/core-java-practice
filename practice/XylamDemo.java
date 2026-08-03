import java.util.Scanner;
class XylamDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		
		int sumOfout = 0;
		int sumOfinn = 0;
		int ld = 0;
		int ld2 = num%10;
		num=num/10;
	
		while(num >= 10){
		 ld = num % 10;
		sumOfinn = sumOfinn + ld;
		num /= 10;
		}
		sumOfout = num + ld2;

		
		if(sumOfout == sumOfinn){
			System.out.println("xyam num ");
		}else{
			System.out.println("not xylem");
		}
	}
}