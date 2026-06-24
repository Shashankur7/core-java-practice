// 23. Print all digits character ASCII value

class PrintDigitsAscii{
	public static void main(String[] args){
		
		char ch = '0';
		do{
			System.out.println((int)ch);
			ch++;
		}while(ch <= '9');
	}
}