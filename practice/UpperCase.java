class UpperCase{
	public static void main(String [] args){
		char ch1 = 'A';
		char ch2 = 'a';
		String res1 = (ch1 >= 'A' && ch1<= 'Z') ? "Uppercase " : " Lowercase";
		String res2 = (ch2 >= 'A' && ch2<= 'Z') ? "Uppercase " : " Lowercase";
		System.out.println(res1);
		System.out.println(res2);

	}
}