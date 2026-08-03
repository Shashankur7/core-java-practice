// 22. Print all lowercase character ASCII value


class AllLowercaseAscii{
	public static void main(String[] args){
		
		char ch = 'a';
		while(ch <= 'z'){
			System.out.println((int) ch);
			ch++;
		}
	}
}