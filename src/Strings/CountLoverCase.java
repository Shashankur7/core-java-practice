//12)WAP to count only lowercase character in a given String 
package Strings;
import java.util.Scanner;

public class CountLoverCase {
	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		countLowerCase(res);
	}
	public static void countLowerCase(String res) {
		char [] ch = res.toCharArray();
		int count = 0;
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
