package Strings;
import java.util.Scanner;

public class OnlyLovercase {

	 public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String res = new Scanner(System.in).nextLine();
		
		loverCase(res);
	 }
	 public static void loverCase(String res) {
		 //System.out.println(res.toLowerCase());
		 char [] ch = res.toCharArray();
		 for(int i = 0 ; i<ch.length ; i++) {
			 if(ch[i]>='A' && ch[i] <='Z') {
				 System.out.println((char)(ch[i]+32));
			 }
		 }
	 }
}
