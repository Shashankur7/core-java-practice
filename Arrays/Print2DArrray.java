//print 2d arr for while and do while
class Print2DArrray{
	public static void main(String[] args){
		System.out.println("____________for__________");
		int [][] arr = {{10,20,30},{40,50,60}};
		System.out.println(java.util.Arrays.deepToString(arr));
		
		for(int i = 0 ; i<arr.length ; i++){
			for(int j = 0 ; j<arr[i].length ; j++){
				
			System.out.print(arr[i][j] +" " );
			}

			System.out.println();
		}

		System.out.println("_______________while loop _______________");
		
		System.out.println(java.util.Arrays.deepToString(arr));

		int w = 0;
		while(w<arr.length){
			int k = 0;
			while(k<arr[w].length){
				System.out.print(arr[w][k] +" ");
				k++;
			}
			w++;		
			System.out.println();
		}
		
		System.out.println("___________do while _____________");
		System.out.println(java.util.Arrays.deepToString(arr));
		int d = 0;
			do{
		             int o = 0;
				do{
				System.out.print(arr[d][o] +" ");	
				o++;
		}while(o<arr[d].length);
		System.out.println();
		d++;	
}while(d<arr.length);
		
	}
}