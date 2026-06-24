import java.util.Scanner;
class  RecursionFactorial

{
	static int fact = 1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num = sc.nextInt();
		findFactorial(num , 1);
		System.out.println(num+ " : " +fact);
		
			}
			public static void findFactorial(int num , int i){
				fact = fact * i;
				if(i++ ==num) return;
				findFactorial(num , i);
				
			}
}
