//21)WAP to print Except Digits character in a given String 
package Strings;
import java.util.Scanner;

public class PrintExceptDigit {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printExcDigit(res);
	}
	public static void printExcDigit(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i]<'0' || ch[i] >'9') {
				System.out.println(ch[i]);
			}
		}
	}
}
