//11.Find the longest world in a String
package Strings.Words;

public class LongestWordIndString {

	public static void main(String[] args) {
		String s = "java is easyily";
		longestWord(s);
	}
	public static void longestWord(String s) {
		s = s+" ";
		String res = "";
		 String tempRes = "";
		int count = 0;
		int temp = Integer.MAX_VALUE;
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				res += ch;
			}else {
				  if(count < temp) {
	                    temp = count;
	                    tempRes = res;
	               }
				  count = 0;
		          res = "";
			}
			
		}
	  System.out.println(tempRes);
	}
}
