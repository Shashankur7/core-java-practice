class CheckLowerCase{

	public static void main(String[] args){
		char ch = 'a';
		String res = (ch >= 'a' && ch <= 'z') ? "LOWERCASE" : "NOT LOWERCASE";
		System.out.println(res);
	}
}