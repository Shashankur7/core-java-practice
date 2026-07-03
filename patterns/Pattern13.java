class Pattern13{
	public static void main(String[] args){
		int n = 4;	
		char ch = 'a';
		int  num = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j<=n ; j++){
				if(j%2 != 0)
					System.out.print(num++ +" ");
				else
					System.out.print(ch++ +" ");
				
			}
			System.out.println();
		}
	}
}
/*
1 a 2 b
3 c 4 d
5 e 6 f
7 g 8 h
*/			