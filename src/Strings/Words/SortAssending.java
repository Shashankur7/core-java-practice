//14.Sort character in Ascending order

package Strings.Words;

 import java.util.Arrays;
public class SortAssending {

	public static void main(String[] args) {
		String s = "jabaci";
		sortAssending(s);
	}
	public static void sortAssending(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		for(int i = 0 ; i<ch.length; i++) {
			for(int j = i + 1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			
		}
		System.out.println(ch);
	}
}
