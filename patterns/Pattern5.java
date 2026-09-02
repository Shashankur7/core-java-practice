class Pattern5{
	public static void main(String[] args){
		int n = 3;
		int num = 1;
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= n ; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}