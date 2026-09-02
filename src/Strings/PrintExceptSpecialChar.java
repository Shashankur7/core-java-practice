//25)WAP to print Except special character in a given String 

package Strings;
import java.util.Scanner;
public class PrintExceptSpecialChar {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printExcSpe(res);
		
	}
	public static void printExcSpe(String res) {
		char [] ch = res.toCharArray();
		
		for(int i = 0 ; i<ch.length ; i++) {
			if((ch[i]>='A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i]<='9')) {
				System.out.println(ch[i]);
			}
		}
	}
}
