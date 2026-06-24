class FactorialWithReturn
{
	public static void main(String[] args) 
	{
		int num = 5;
		int fact = findFactorial(num , 1 , 1);
		System.out.println(num+ " : " +fact);
	}
	public static int findFactorial(int num , int i , int op){
		if( i > num ) return op;
		op = op * i;
		return findFactorial(num , ++i , op);
		// return op this will not distroy the earlier frame and will return the last vale as 1
	}
}
