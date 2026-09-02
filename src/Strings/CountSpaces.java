//10)WAP to count only spaces in a given String 
package Strings;
import java.util.Scanner;

public class CountSpaces {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String res = new Scanner(System.in).nextLine();
		
		countSpace(res);
	}
	public static void countSpace(String res) {
		char [] ch = res.toCharArray();
			//char a = "";
			int count = 0;
			for(int i = 0 ; i<ch.length; i++) {
				if(ch[i] == ' ' ) {
					count++;
				}
			}
			System.out.println(count);
	}
}
