package Arrays;
import java.util.Arrays;
class MergeArray2D{
/*	public static void main(String[] args){
		int [][] arr = {{10,20},{30,40,50},{60,70,80,90,100}};
		System.out.println(Arrays.deepToString(arr));
		int sum = 0;
		for(int i = 0 ; i<arr.length; i++){
			sum += arr[i].length;
		}
		
		int [] b= new int [sum];
		for(int i= 0 , k= 0 ; i<arr.length ;i++){
			for(int  j = 0; j<arr[i].length ; j++){
				b[k++] = arr[i][j];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}*/

		public static void main(String[] args){
			int [][] arr = {{10,20},{30,40,50},{60,70,80,90}};
				System.out.println(Arrays.deepToString(arr));

			int sum = 0;
			for(int i = 0; i<arr.length; i++){
				sum += arr[i].length;
			}
			int [] b = new int [sum];
			for(int i = 0 , k = 0; i<arr.length; i++){
				for(int j = 0; j<arr[i].length ; j++){
				b[k++] = arr[i][j];
			}
			
		}
		System.out.println(Arrays.toString(b));
	}
}