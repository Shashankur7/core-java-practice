//16)WAP to count only Alphabets in a given String 
package Strings;
import java.util.Scanner;

public class CountAlphabet {

	public static void main(String[] args) {
		System.out.println("Enter a STring :");
		String res = new Scanner(System.in).nextLine();
		
		countAlp(res);
	}
	public static void countAlp(String res) {
		char [] ch = res.toCharArray();
		int count = 0;
		for(int i = 0 ; i<ch.length  ; i++) {
			if((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				count++;
			}
		}
		 System.out.println(count);
	}
}
