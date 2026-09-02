package Strings;
import java.util.Scanner;

public class VovelsInString {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		String res = new Scanner(System.in).nextLine();
		printVovels(res);
	}
	public static void printVovels(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I'|| ch[i] == 'O' || ch[i] == 'U') {
				System.out.println(ch[i]);
			}
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'e'|| ch[i] == 'i' || ch[i] == 'o') {
				System.out.println(ch[i]);
			}
		}
		
	}
}
