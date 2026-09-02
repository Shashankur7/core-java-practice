//2.Print each world first character 
package Strings.Words;

public class PrintEachWordFirstChar {

	public static void main(String[] args) {
		String s = "java is Easy";
		printFirstChar(s);
	}
	public static void printFirstChar(String s) {
		s = " "+s;
		String res = "";
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				System.out.println(s.charAt(i+1));
			}else {
				continue;
			}
		}
	}
}
