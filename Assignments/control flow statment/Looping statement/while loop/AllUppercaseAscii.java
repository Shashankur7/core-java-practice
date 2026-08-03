// 21. Print all uppercase character ASCII value

class AllUppercaseAscii{
	public static void main(String[] args){
		
		char ch = 'A';
		while(ch <= 'Z'){
			ch++;
			System.out.println((int)ch);
		}
	}
}