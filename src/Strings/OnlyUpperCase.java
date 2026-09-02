package Strings;
import java.util.Scanner;

public class OnlyUpperCase {
	
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String res = new Scanner(System.in).nextLine();
		upperCase(res);
	}
	public static void upperCase(String res) {
		//System.out.println(res.toUpperCase());
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				System.out.println((char)(ch[i]-32));
			}
		}
	}
}
