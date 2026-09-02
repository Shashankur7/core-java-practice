//19)WAP to print except upper case character in given String 
package Strings;
import java.util.Scanner;

public class PrintExceptUpperCase {

	public static void main(String[] args) {
		System.out.println("Enter A STring :");
		String res = new Scanner(System.in).nextLine();
		
		printExceptUpper(res);
	}
	public static void printExceptUpper(String res) {
		char [] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i]<'A' || ch[i]>'Z') {
				System.out.println(ch[i]);
			}
		}
	}
}
