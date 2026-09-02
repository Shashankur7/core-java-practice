package Strings;
import java.util.Scanner;

public class AlphabetOnly {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String res = new Scanner(System.in).nextLine();
		onlyAlphabet(res);
		
	}
	public static void onlyAlphabet(String res) {
			char[] ch = res.toCharArray();
			for(int i = 0 ;i<ch.length; i++) {
				if((ch[i]>='a' && ch[i]<='z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
					System.out.println(ch[i]);
				}
			}
	}
}
