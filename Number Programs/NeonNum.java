/*A neon number is a number where the sum of the digits of its square is equal to the original number.

Example: 9
Square of 9 = 81
Sum of digits of 81 = 8 + 1 = 9

Since the sum equals the original number, 9 is a neon number.*/

import java.util.Scanner;
class NeonNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();

		int ld = 0;
		int sum = 0;
		int temp = num;
		int square = num  * num;


		while (square > 0){
			ld = square % 10;
			sum += ld;
			square /= 10;
					
		}
		if(temp == sum)
			System.out.println("is a Neon num ");
		else
			System.out.println("is not neon");
	}
}