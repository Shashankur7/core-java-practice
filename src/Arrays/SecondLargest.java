package Arrays;
import java.util.Arrays;
class SecondLargest{
/*	public static void main(String[] args){
		int [] arr = {6,5,6,4,4,1,2,3};
		Arrays.sort(arr);
		int max1 = arr[arr.length-1] , max2 = max1;
		System.out.println(Arrays.toString(arr));

		for(int i = arr.length-2 ; i>= 0 ; i--){
			if(arr[i] != max1){
				
			             max2 = arr[i];
					break;
					
				}
			}
			System.out.println(max1);
			System.out.println(max2);
	}
}*/

	public static void main(String[] args){
			int [] arr =  {6,5,6,4,4,1,2,3};
			Arrays.sort(arr);
			
			int max1 = arr[arr.length - 1];
			System.out.println(max1);
		}
}