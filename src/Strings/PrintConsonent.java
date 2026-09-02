package Strings;
import java.util.Scanner;

public class PrintConsonent {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		consonent(res);
	}
	public static void consonent(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i]!='A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' && 
					ch[i] != 'a' && ch[i]!= 'e' && ch[i] != 'o' && ch[i] != 'i' && ch[i] != 'u') {
				System.out.println(ch[i]);
			}
			
		}
	}
}
