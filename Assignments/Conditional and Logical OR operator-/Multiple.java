//4)Multiple of 3 OR 7  
class Multiple{
	public static void main(String[] args){
		int a = 6;
		String res = (a % 3 == 0 || a % 7 == 0) ? "multiple " : " not multiple";
		System.out.println(res);
	}
}