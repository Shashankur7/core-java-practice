package Arrays;
import java.util.Arrays;
class RotationAntyClock{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5};

		int temp = arr[0];
		for(int i = 1 ; i<=arr.length - 1; i++){
			System.out.println(arr[i] +" : " +arr[i - 1]);
			arr[i - 1] = arr[i ];
		}
			arr[arr.length -1] = temp;
			System.out.println(Arrays.toString(arr));
	}		
}
