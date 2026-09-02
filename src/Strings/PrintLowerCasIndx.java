//28)WAP to print only lowercase character index in a given String 
package Strings;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class PrintLowerCasIndx {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		
		printLoweIndx( res);
	}
	public static void printLoweIndx(String res) {
		char [] ch = res.toCharArray();
		for(int i = 0; i<ch.length ; i++) {
			if(ch[i]>='a' && ch[i] <= 'z') {
			System.out.println(i+" : " + ch[i]);
			}
		}
	}
}
