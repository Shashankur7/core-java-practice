//6.Print each world whose length is odd
package Strings.Words;

public class PrintEachWordOdd {

	public static void main(String[] args) {
		String s = "java is eay f";
		printOdd(s);
	}
	public static void printOdd(String s) {
		s = s+" ";
		String res = "";
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				res += ch;
			}else {
				if(count%2!=0) {
					System.out.println(res);
				}
				res="";
				count =0;
			}
		}
	}
}
