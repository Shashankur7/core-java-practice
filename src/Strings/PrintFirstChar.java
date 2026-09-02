//Print each word first char
package Strings;

public class PrintFirstChar {

	public static void main(String[] args) {
		String s = "Java is Easy";
		countFirstChar(s);
		
	}
	public static void countFirstChar(String s) {
		s =" "+s;
//		String res = "";
		for(int i = 0; i<s.length();i++) {
//			char ch = s.charAt(i);
			if(s.charAt(i) ==' ') {
				System.out.println(s.charAt(i+1));
				
			}else {
//				System.out.println(res.charAt(0));
				continue;
				
			}
		}
	}
}
