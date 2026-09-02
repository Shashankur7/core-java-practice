class RevRecursion 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int rev = reverseNumber(num, 0);
		System.out.println(num+ " : " +rev);
		
	}
	public static int reverseNumber(int num, int rev){
		if(num == 0) return rev;
		rev = rev * 10 + (num % 10);
		return reverseNumber(num/10,rev);
	}	
}
