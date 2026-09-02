//2)WAP to print every character line by line 
package Strings;
import java.util.Scanner;
public class CharLinebyLine {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String res = new Scanner(System.in).nextLine();
		lineByLine(res);
	}
	public static void lineByLine(String res) {
		char [] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
