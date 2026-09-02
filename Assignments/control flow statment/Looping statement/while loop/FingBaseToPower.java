// 35. WAP to find base to the power

import java.util.Scanner;
class FingBaseToPower{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base :");
		int base = sc.nextInt();
		
		System.out.println("Enter power :");
		int power = sc.nextInt();
	
		/*int pow = 1;
		int i = 1;
		while ( power >= i){
			pow = pow * base;
		i++;
		}
		System.out.println(pow);
	}
}*/

		int res = 1;
		int i = 1;
		while(i <= power){
			res = res * base;
			i++;
		}
		System.out.println(res);
	}
}