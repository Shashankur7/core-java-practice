//15)WAP to count only consonants in a given String 

package Strings;
import java.util.Scanner;

public class CountConsonent {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		countConsonent(res);
	}
	public static void countConsonent(String res) {
		char [] ch = res.toCharArray();
		int count = 0;
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' && ch[i] != 'a'
					&& ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'e' && ch[i] != 'i') {
				count ++;
			}
		}
		System.out.println(count);
	}
}
