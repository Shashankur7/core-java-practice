// 8) Vowel Check (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) 

class CheckVowel{
	public static void main(String[] args){
		char ch = 'a';
		String res =(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "vowel" : "consonent";
		System.out.println(res);
	}
}