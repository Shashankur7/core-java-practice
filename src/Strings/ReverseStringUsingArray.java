//Write a program to reverse String.
package Strings;

public class ReverseStringUsingArray {

	public static void main(String[] args) {
		String s = "java";
		String res = revString(s);
		System.out.println(s);
		System.out.println(res);
		
	}
	public static String revString(String s) {
		char[] ch = s.toCharArray();
		int i = 0 ,j = ch.length-1;
		while(i<j){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
}
