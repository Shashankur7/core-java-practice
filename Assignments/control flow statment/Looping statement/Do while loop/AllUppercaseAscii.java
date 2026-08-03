// 21. Print all uppercase character ASCII value

class AllUppercaseAscii{
	public static void main(String[] args){
		
		char ch = 'A';
		do{
			System.out.println((int) ch);
			ch++;
		}while(ch <= 'Z');
	}
}