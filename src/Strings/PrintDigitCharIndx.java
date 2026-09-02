//29)WAP to print only Digits character  index in a given String 
package Strings;
import java.util.Scanner;

public class PrintDigitCharIndx {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printDigitInds(res);
	}
	public static void printDigitInds(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				System.out.println(i+" : "+ch[i]);
			}
	
		}
	}
}
