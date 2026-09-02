//3)WAP to print only upper case character in given String 
package Strings;
import java.util.Scanner;

public class OnlyUpperCaseChar {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res  = new Scanner(System.in).nextLine();
		printUpperCase(res);
	}
	public static void printUpperCase(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				System.out.println(ch[i]);
			}
		}
	}
}
