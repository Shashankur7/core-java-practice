package Arrays;
import java.util.Arrays;
class RotationClockwise{

	public static void main(String[] args){
		int [] arr = {1,2,3,4,5,7};
		System.out.println(Arrays.toString(arr));
			
		int temp = arr[arr.length-1];
		System.out.println(temp);
		for(int i = arr.length - 1 ; i > 0 ; i--){
			System.out.println(arr[i] +" : " +arr[i -1]); 
			arr[i] = arr[i - 1];
		}	
			arr[0] = temp;
			System.out.println(Arrays.toString(arr));
	}
}