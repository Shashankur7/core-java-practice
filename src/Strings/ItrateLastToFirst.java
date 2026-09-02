//18)WAP to iterate String from last to first and print  
package Strings;
import java.util.Scanner;

public class ItrateLastToFirst {

	public static void main(String[] args) {
		System.out.println("Enter a Stirng :");
		String res = new Scanner(System.in).nextLine();
		String  rev = itrateFromLast(res);
		System.out.println(rev);
	}
	public static String itrateFromLast(String res) {
		char[] ch = res.toCharArray();
		StringBuilder sc = new StringBuilder();
		for(int i = ch.length- 1 ; i>=0; i--) {
			sc.append(ch[i]);
		}
		return sc.toString();
	}
}
