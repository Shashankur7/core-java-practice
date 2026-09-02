//1.Print each world line by line
package Strings.Words;

public class PrintWordLineByLine {

	public static void main(String[] args) {
		String s = "java is Easy";
		printWords(s);
	}
	public static void printWords(String s) {
		 s = s+" ";
		String res = "";
		for(int i= 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				res += ch;
			}else {
				System.out.println(res);
				res = "";
			}
		}
	}
}
