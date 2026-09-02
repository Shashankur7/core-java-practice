//7.Print each world whose length is 3 
package Strings.Words;

public class PrintWordofLength3 {

	public static void main(String[] args) {
		String s = "Java iss easy don wow";
		printLength3(s);
	}
	public static void printLength3(String s) {
		s = s+" ";
		int count =0;
		String res = "";
		for(int i = 0; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				res+=ch;
			}else {
				if(count%3==0) {
					System.out.println(res);
					
				}
				 res="";
				 count = 0;
			}
		}
	}
}
