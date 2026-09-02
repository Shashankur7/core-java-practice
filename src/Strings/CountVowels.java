//14)WAP to count only vowels in a given String 
package Strings;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		countVowel(res);
	}
	public static void countVowel(String res) {
		char[] ch = res.toCharArray();
		int count = 0;
		
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I'|| ch[i]== 'O' || ch[i] == 'U' 
					|| ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				 count++;
			}
		}
		System.out.println(count);
	}
}
