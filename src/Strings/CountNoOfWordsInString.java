package Strings;
// count no of words in a string
public class CountNoOfWordsInString {
	public static void main(String[] args) {
		String s = "Java is easy";
		countWords(s);
		
		
	}
	public static void countWords(String s) {
		s=s+" ";
		String res ="";
		int count = 0;
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				count++;
				
				
			}else {
				continue;
			}
		
		}
		System.out.println(count);
	}
}
