//12.Find the smallest world in a given String
package Strings.Words;

public class SmallestWord {

	public static void main(String[] args) {
		String s = "java is eaasy";
		smallestWord(s);
	}
	public static void smallestWord(String s) {
		s = s+" ";
		String res ="";
		String res1= "";
		int count =0;
		int temp = Integer.MAX_VALUE;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				res+=ch;
			}else {
				if(count<temp) {
					temp = count;
					res1 = res;
				}
				count = 0;
				res="";
			}
			}
			System.out.println(res1);
		
	}
}
