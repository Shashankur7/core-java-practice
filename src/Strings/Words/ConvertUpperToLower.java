//9.Convert upper case to lowercase of each world first character
package Strings.Words;

public class ConvertUpperToLower {

	public static void main(String[] args) {
		String s="Java Is Easy";
		upperToLower(s);
	}
	public static void upperToLower(String s) {
		 s = " "+s;
		String res = "";
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				res+=ch;
				char con = s.charAt(i+1);
				System.out.println((char)(con+32)+res);
			}else {
				res="";
			}
		}
		
	}    
}
