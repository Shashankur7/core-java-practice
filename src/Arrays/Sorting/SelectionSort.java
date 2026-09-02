package Arrays.Sorting;
import java.util.Arrays;
class SelectionSort{
	public static void main(String[] args){
		int [] arr = {2,4,5,6,1,3,2,4,5,8,9,7};
		System.out.println("Befor :" +Arrays.toString(arr));
		selectionSort( arr, arr.length);
		System.out.println("After : " +Arrays.toString(arr));
	}
	public static void selectionSort(int [] arr, int n){
		for(int i = 0 ; i<n ; i++){
			int m = i ;
			for(int j = i+1; j<n ; j++){
				if(arr[j] < arr[m]){
					m = j;
				}
			}
			int temp = arr[m];
					arr[m] = arr[i];
					arr[i] = temp;

		}
	}
}