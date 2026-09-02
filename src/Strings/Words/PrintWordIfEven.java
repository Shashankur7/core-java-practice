//5.Print each world whose length is even
package Strings.Words;

public class PrintWordIfEven {

	public static void main(String[] args) {
		String s = "java is easy fss";
		printEvenWord(s);
	}
	public static void printEvenWord(String s) {
		s = s+" ";
		int count = 0;
		String res = "";
		for(int i = 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				res += ch;
			}else {
				if(count%2==0) {
					System.out.println(res);
					
				}
				count = 0;
				res = "";
			}
		}
	}
}
