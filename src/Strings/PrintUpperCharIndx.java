//27)WAP to print only upper case character index in given String
package Strings;
import java.util.Scanner;

public class PrintUpperCharIndx {

	public static void main(String[] args) {
		System.out.println("Enter A String :");
		String res = new Scanner(System.in).nextLine();
		
		printUppCharIndx(res);
	}
	public static void printUppCharIndx(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i <ch.length ; i++) {
			if(ch[i] >='A' && ch[i] <= 'Z') {
				System.out.println(i + " : " +ch[i]);
			}
		}
	}
}
