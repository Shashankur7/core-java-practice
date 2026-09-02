//11)WAP to count only upper case character in  a given String
package Strings;
import java.util.Scanner;

public class CountUpperCase {
	public static void main(String[] args) {
		System.out.println("Enter a String :");
			String res = new Scanner(System.in).nextLine();
			countUppercase(res);
		}
		public static void countUppercase(String res) {
			int count = 0;
			char[] ch = res.toCharArray();
			for(int i = 0 ; i<ch.length;i++) {
				if(ch[i]>='A' && ch[i]<='Z') {
					count++;
				}
			}
			System.out.println(count);
	}

}
