import java.util.Scanner;
class EvenOddMethod{
	
		static int num;
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		num = sc.nextInt();

		isEvenOdd(num);
	}

		public static void isEvenOdd(int num){
				
			if(num % 2 == 0){
				System.out.println("Even num :" +num);
			}
			else{
				System.out.println("odd num :" +num);
			}
		}
	}

				
		