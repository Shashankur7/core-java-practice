//32)WAP to print only Alphabets index in a given String 
package Strings;
import java.util.Scanner;

public class PrintAlphabetIndx {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printAlphaIndex(res);
	}
	public static void printAlphaIndex(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if((ch[i]>='A' && ch[i]<='Z' ) || (ch[i]>='a' && ch[i]<='z')) {
				System.out.println(i+" : " +ch[i]);
			}
		}
	}
}
