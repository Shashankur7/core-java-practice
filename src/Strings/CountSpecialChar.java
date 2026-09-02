//17)WAP to count only special character in a given String 
package Strings;
import java.util.Scanner;
public class CountSpecialChar {

	public static void main(String[] args) {
		System.out.println("Entera a String :");
		String res = new Scanner(System.in).nextLine();
		
		countSpeChar(res);
	}
	public static void countSpeChar(String res) {
		int count = 0;
		char[] ch = res.toCharArray();
		for(int i = 0; i<ch.length ; i++) {
			if((ch[i]<'A' || ch[i]>'Z') && (ch[i]<'a' || ch[i]>'z') && (ch[i]<0 || ch[i]>9)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
