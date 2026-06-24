// 19) Check if ASCII value is even

import java.util.Scanner;
class AsciiEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		char ch = sc.next().charAt(0);
		
		if (ch % 2 == 0)
		System.out.println("Ascii even");
		else
		System.out.println("not even");
	}
}
		
		