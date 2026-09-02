//4.Write a program to perform basic Simple Calculator  



import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation :");
		int opt= sc.nextInt();

		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		
		switch(opt){
			case 1 :
			System.out.println("addition" +(a+b));
			break;

			case 2:
			System.out.println("division" +(a/b));
			break;

			case 3:
			System.out.println("substraciton : " +(a-b));
			break;

			case 4:
			System.out.println("multiplication" +(a*b));
			break;

			default:
			System.out.println("invalid");
		}
	}
}