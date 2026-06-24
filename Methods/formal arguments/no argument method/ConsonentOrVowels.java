import java.util.Scanner;
class  ConsonentOrVowels
{
	static void isConsonentOrVowel(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		
		
		
	
			if( ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
				System.out.println(ch+ "is a consonent");
			else
				System.out.println(ch+ "is vowel");
			ch++;
		}
	
		public static void main(String[] args){
			isConsonentOrVowel();
		}
		
}
