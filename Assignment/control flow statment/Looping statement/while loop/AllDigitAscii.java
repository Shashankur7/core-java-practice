// 23. Print all digits character ASCII value

class AllDigitAscii{
	public static void main(String[] args){
		
		char ch = '0' ;
		while( ch <= '9' ) {
			System.out.println((int) ch);
			ch++;
		}
	}
}