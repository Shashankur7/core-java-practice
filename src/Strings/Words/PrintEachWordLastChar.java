//3.Print each world last character
package Strings.Words;

public class PrintEachWordLastChar {

	public static void main(String[] args) {
		String s = "java is easy";
		printLastChar(s);
	}
	public static void printLastChar(String s) {
		s=s+" ";
		String res ="";
		for(int i= s.length()-1; i>0; i--) {
			char ch = s.charAt(i);
			if(ch==' ') {
				System.out.println(s.charAt(i-1));
			}else {
				continue;
			}
		}
	}
}
