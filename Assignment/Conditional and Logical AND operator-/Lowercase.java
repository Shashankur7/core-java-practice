import java.util.Scanner;
class Lowercase{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Character : " );
		char ch = sc.next().charAt(0);
		String res =(ch >= 'a' && ch <= 'z') ? "Lowercase " : "Not Lowercase";
		System.out.println(res);
	}
}