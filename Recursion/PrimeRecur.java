import java.util.Scanner;
class PrimeRecur 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num :");
			int num = sc.nextInt();
			String op = isPrime(num , 2)?num+ " Prime" : " not prime";
			System.out.println(op);
	}
	public static boolean isPrime(int num , int i){
		//if(num == 2) return true;
		if(num <= 1  || num % 2 == 0) return false;
		if(num == 2 || i > num/2) return true;
		return isPrime(num , ++i);
	}
}
