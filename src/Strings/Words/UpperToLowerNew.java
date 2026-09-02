package Strings.Words;

public class UpperToLowerNew {

	public static void main(String[] args) {
		String s = "Java Iss EaEy";
		upperTolower(s);
	}
	public static void upperTolower(String s) {
		s = " "+s;
		String res  = "";
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				 res += " ";
				i++;
				ch= s.charAt(i);
				res += Character.toLowerCase(ch);
				
			}else {
				res += ch;
				
			}
		}
		System.out.println(res);
	}
}
