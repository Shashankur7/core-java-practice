// 31. WAP to check given number is perfect square or not

import java.util.Scanner;
class PerfectSquare1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();


		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				System.out.println("perfect square");
			} else {
				System.out.println("not perfect square");
			}

		}
	}
}