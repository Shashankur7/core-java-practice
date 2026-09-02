import java.util.Scanner;
class Example{
	static String str;
	static String strr;
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a String :");
		str = sc.next();
		
		System.out.println("enter a string :");
		strr = sc.next();

		System.out.println("str befote :" +str);
		toUpperCase();
		System.out.println("str afte :" +str);

		System.out.println("strr befote :" +strr);
		toLowerCase();
		System.out.println("strr afte :" +strr);
	}
	public static void toUpperCase(){
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 97 && ch <=122){
				newStr += (char) (ch - 32);
			}
			else{
				newStr += ((char)ch);
			}

		}
			str = newStr;
			return;
	}


	public static void toLowerCase(){
		String newStrr = " ";
		
		for(int i = 0 ; i < strr.length(); i++){
			char ch = strr.charAt(i);
			if( ch >= 65 && ch <= 90){
				newStrr += (char) (ch + 32);
			}
			else{
				newStrr += (char) (ch);
			}
		}
			strr	 = newStrr;
			return;
		
	}
}
