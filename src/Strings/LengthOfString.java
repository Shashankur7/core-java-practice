package Strings;
import java.util.Scanner;
public class LengthOfString {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
			String res = new Scanner(System.in).nextLine();
			
			stringLength(res);
	}
	public static void stringLength(String res) {
		int count =  0;
		char [] ch = res.toCharArray();
		for(char c : ch) {
			count++;
		}
		System.out.println(count);
	}
}
	
