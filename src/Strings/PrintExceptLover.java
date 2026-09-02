//20)WAP to print Except lowercase character in a given String 
package Strings;
import java.util.Scanner;

public class PrintExceptLover {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printExcLower(res);
	}
	public static void printExcLower(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ;i<ch.length ; i++) {
			if(ch[i]<'a' || ch[i]>'z') {
				System.out.println(ch[i]);
			}
		}
	}
}
