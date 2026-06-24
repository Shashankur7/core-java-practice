import java.util.Scanner;
class Example44{
	static String str = "afsdASFAG";
	public static void main(String[] args){
		System.out.println(str);
		char[] arr1 = toCharArray();
		System.out.println(arr1);
	}
	public static char[] toCharArray(){
		char[] arr = new char[str.length()];
		
	for(int i = 0; i<str.length() ; i++){
		char ch = str.charAt(i);
		arr[i] = ch;
	}
	return arr;
    }
}