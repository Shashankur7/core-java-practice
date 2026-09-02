//23)WAP to print Except consonants in a given String 
package Strings;
import java.util.Scanner;

public class PrintExceptConsonent {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printExceptConsonect( res);
		
	}
	public static void printExceptConsonect(String res) {
		char[] ch = res.toCharArray();
		
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a' || ch[i] == 'e' ||  ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println(ch[i]);
			}
		}
		
	}
}
