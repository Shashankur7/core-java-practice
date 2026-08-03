class Demo12{
	public static void main(String[] args){
		char [] a = new char[26];

		for(int i = 0 ; i<a.length ; i++){
			char ch = (char)(Math.random()*100);
			if(ch >='A' && ch <= 'Z'){
			a[i] = ch;
			}else{
				i--;
			}
		}
		System.out.println(java.util.Arrays.toString(a));
	}
}