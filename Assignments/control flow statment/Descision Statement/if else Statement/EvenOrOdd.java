import java.util.Scanner;

class EvenOrOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		if ((num / 2)* 2 == num)
			System.out.println(num+ " Even Num");
		else
			System.out.println(num+ " is Odd");
	}
}