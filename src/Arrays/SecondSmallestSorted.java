package Arrays;
import java.util.Arrays;
class SecondSmallestSorted{
	public static void main(String[] args){
		int [] arr = {6,5,6,4,4,1,2,3};
		Arrays.sort(arr);
		int max1 = arr[0] , max2 = max1;
		System.out.println(Arrays.toString(arr));

		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i] != max1){
				
			             max2 = arr[i];
					break;
					
				}
			}
			System.out.println(max1);
			System.out.println(max2);
	}
}

	/*public static void main(String[] args){
			int [] arr =  {6,5,6,4,4,1,2,3};
			Arrays.sort(arr);
			
			int min1 = arr[0];
			System.out.println(min1);
		}
}*/