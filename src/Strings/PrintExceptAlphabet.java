//24)WAP to print Except Alphabets in a given String

package Strings;
import java.util.Scanner;
public class PrintExceptAlphabet {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printExceptAlphabet(res);
		
	}
	public static void printExceptAlphabet(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if((ch[i] < 'A' || ch[i]>'Z' ) && (ch[i]<'a' || ch[i] >'z' )) {
				System.out.println(ch[i]);
			}
		}
	}
}
