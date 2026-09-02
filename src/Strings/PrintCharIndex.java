//26)WAP to print every character index  line by line 
package Strings;
import java.util.Scanner;

public class PrintCharIndex {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printCharIndex(res);
	}
	public static void printCharIndex(String res) {
		char[] ch  =  res.toCharArray();
		for(int i =0 ; i<ch.length ; i++) {
			System.out.println(i +" : " + ch[i]);
		}
	}
}
