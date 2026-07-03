class Pattern7{
	public static void main(String[] args){
		int n = 4;
		int a = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(i%2 != 0)
				System.out.print(a++ +" ");
				else
				System.out.print(a-- +" ");
				if(a <= 10){
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i%2 != 0)a+=(n-1);
			else a+= (n+1);
		}
	}
}

/*
1  2  3  4
8  7  6  5
9  10 11 12
16 15 14 13
*/