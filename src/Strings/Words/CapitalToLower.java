//13.Capitalize each world first character 
package Strings.Words;

public class CapitalToLower {

	public static void main(String[] args) {
		String s = "java is easy";
		lowerToUpper(s);
	}
	public static void lowerToUpper(String s) {
		s = " "+s;
		String res = "";
		for(int i =0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				res += " ";
				i++;
				ch = s.charAt(i);
				res += Character.toUpperCase(ch);
			}else {
				res += ch;
			}
		}
		System.out.println(res);
	}
}
