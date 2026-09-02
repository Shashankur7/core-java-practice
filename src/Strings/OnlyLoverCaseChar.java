//4)WAP to print only lowercase character in a given String 
package Strings;
import java.util.Scanner;

public class OnlyLoverCaseChar {

	public static void main(String[] args) {
		 System.out.println("Enter a String :");
		 String res = new Scanner(System.in).nextLine();
		 onlyLowerCase(res);
	}
	public static void onlyLowerCase(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i]>='a' && ch[i] <= 'z') {
				System.out.println(ch[i]);
			}
		}
	}
}
