//15.Sort character in Descending order
package Strings.Words;

public class SortDecinding {

	public static void main(String[] args) {
		String s = "javaz";
		sortDecinding(s);
	}
	public static void sortDecinding(String s) {
		char[] ch = s.toCharArray();
		for(int i = 0 ; i<ch.length;i++) {
			for(int j = i+1;j<ch.length; j++) {
				if(ch[i]<ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
	}
}
