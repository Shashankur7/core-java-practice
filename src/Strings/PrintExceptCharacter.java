package Strings;
import java.util.Scanner;
public class PrintExceptCharacter {
	
	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		exceptChar(res);
	}
	public static void exceptChar(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if((ch[i]<'A' || ch[i]> 'Z') && (ch[i]<'a' || ch[i]>'z')) {
			System.out.println(ch[i]);
			
			}
		}
	}
}