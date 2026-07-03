class DecrementalPattern 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = n * n;
		for (int i = 1; i <= n ; i++ )
		{
			for(int j = 1; j <= n; j++)
				System.out.print(j++ +" ");
		}
		System.out.println();
	}
}
