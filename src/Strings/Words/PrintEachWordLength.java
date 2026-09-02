//4.Print each world length
package Strings.Words;

public class PrintEachWordLength {

	public static void main(String[] args) {
		String s = "Java is easy";
		countLength(s);
	}
	public static void countLength(String s) {
		s = s+" ";
		int count =0;
		for(int i =0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
			}else {
				System.out.println(count);
				count = 0;
			}
			
		}
	}
}
