import java.util.Scanner;
import java.util.Arrays;
class Demo8{
	public static void main(String[] args){
		int [] arr = new int[10];
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int num = sc.nextInt();

	}
		
		public static boolean isPrime(int num){
			
		
		int count = 0;
		int i = 1;
		
		while(i <= num){
			if(num % i == 0){
			count++;
			}

			i++;
		}
			if(count == 2){
			}
			return true;
		}
}