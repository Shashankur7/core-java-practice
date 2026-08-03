class Demo13{
	public static void main(String[] args){
		char [] c = new char[26];
	
		for(int i = 0; i<c.length; i++){
			char ch = (char)(Math.random()*100);
			
			if(!checkElement(i,ch,c) && ch>='A' && ch <= 'Z'){
				c[i] = ch;
				continue;
			}
			i--;
		}
				
		System.out.println(java.util.Arrays.toString(c));
	}
	public static Boolean checkElement(int end , char ch , char [] c){
		for(int i = 0; i<= end ; i++){
			if(c[i] == ch) return true;
		}
		return false;
	}	
}

