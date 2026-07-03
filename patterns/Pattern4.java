class Pattern4{
	public static void main(String[] args){
		char ch = 'a';
		int n = 4;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
} 