import java.util.Scanner;
class PrimeDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();

		boolean flag = false;
		int count = 0;
		int i = 1;
		
		while(i <= num){
			if(num % i == 0){
			count++;
			}

			i++;
		}
			if(count == 2){
			flag = true;
			}
		if(flag){
			System.out.println("Prime num ");
		}
		else{
			System.out.println("not prime");
		}
	}
}
		 