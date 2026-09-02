//13)WAP to count only Digits character in a given String 
package Strings;
import java.util.Scanner;

public class CountDigit {
 
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String res = new Scanner(System.in).nextLine();
		countDigit(res);
	}
	public static void countDigit(String res) {
		char[] ch = res.toCharArray();
		int count = 0;
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i]>= '1' && ch[i]<='9') {
				count++;
			}
		}
		System.out.println(count);
	}
}
