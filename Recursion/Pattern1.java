class Pattern1 
{
	public static void main(String[] args) 
	{
	int n = 5;
	pattern(n , 1);
	}
	public static void	pattern(int n , int i ){
			if(i > n) return;
			innerPattern(1, i);
			System.out.println();
			pattern(n, i + 1);
	}
	public static void innerPattern(int j , int i){
		if(j > i) return;
		System.out.print("* ");
		innerPattern(j + 1, i);
	}
}
