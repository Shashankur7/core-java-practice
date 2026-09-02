package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String  s = "madam";
		String rev = rev(s);
		String res = rev(s);
		if(s.equals(res)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+"not palindrome");
		}
	}
	public static String rev(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = s.length()-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(s);
	}
}
