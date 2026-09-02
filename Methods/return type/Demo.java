import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		System.out.println("main starts");
		
		userInput();
		System.out.println("main ends");
	}

	public static void userInput(){
		System.out.println("userInput starts ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		int op = add(a,b);
		
		System.out.println(op);
		
		System.out.println("userInput ends");
	}
	
	public static int add(int a , int b){
		System.out.println("add starts");
		
		int add = square(a) + square(b);
	
		System.out.println("add ends :");
		 	return add;
	}
	
	public static int square(int num){
		System.out.println("sqr starts");
		
		int sqr = num * num;
		System.out.println("sqr ends");
		 	return sqr;
	}
}