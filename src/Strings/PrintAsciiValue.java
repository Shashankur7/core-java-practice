//35)WAP to print ASCII value of every character in a given String 
package Strings;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class PrintAsciiValue {

	public static void main(String[] args) {
		System.out.println("Enter A String :");
		String res = new Scanner(System.in).nextLine();
		
		printAscii(res);
		printAsciiVowel(res);
		printAsciiConso( res);
		printAsciiDigts(res);
		printAsciiAlpha(res);
		printAsciiSpecChar(res);
	}
	public static void printAscii(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			System.out.println(((int)(ch[i]))+": "+ch[i]);
		}
		System.out.println("___________Vowels_________________");
	}
	//36)WAP to print ASCII value of only vowels in a given String 
	public static void printAsciiVowel(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i] =='A' || ch[i] == 'E' || ch[i]== 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println(((int)(ch[i]))+": "+ch[i]);
			}
		}
		System.out.println("________________consonent__________________________");
	}
	//37)WAP to print ASCII value of only consonants in a given String 
	
	public static void printAsciiConso(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length ; i++) {
			if(ch[i]!= 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' && ch[i]!='a' && ch[i] != 'o' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'u') {
				System.out.println(((int)(ch[i]))+": "+ch[i]);
			}
		}
		System.out.println("________________Digits___________________");
	}
	
	//38)WAP to print ASCII value of only Digits in a given String
	public static void printAsciiDigts(String res) {
		char[] ch = res.toCharArray();
		for(int i= 0; i<ch.length; i++) {
			if(ch[i]>='0' && ch[i] <='9') {
				System.out.println(((int)(ch[i]))+": "+ch[i]);
			}
		}
		System.out.println("_____________Alphabets____________________");
	}
	
	//39)WAP to print ASCII value of only Alphabets in a given String 
	public static void printAsciiAlpha(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0; i<ch.length ; i++) {
			if((ch[i]>='A' || ch[i]<='Z') && (ch[i]>='a' || ch[i]<='z'));
			System.out.println(((int)(ch[i]))+": "+ch[i]);
		}
		System.out.println("________Special Chaer ________________");
	}
	//40)WAP to print ASCII value of only special character in a given String 
	public static void printAsciiSpecChar(String res) {
		char[] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if((ch[i]<'A' || ch[i]>'Z') && (ch[i]<'a' || ch[i]>'z') &&(ch[i] <'0' || ch[i]>'9')) {
				System.out.println(((int)(ch[i])+" : "+ch[i]));
			}
		}
	}
		
}
