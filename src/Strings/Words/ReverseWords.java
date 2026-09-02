//10.Reverse each world in its place
package Strings.Words;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "Java ak  avaj";
		reverse(s);
	}
	public static void reverse(String s) {
		char[] ch = s.toCharArray();
		int i=0, j=ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		System.out.println(ch);
	}
}
