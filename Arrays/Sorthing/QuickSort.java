import java.util.Arrays;
class QuickSort{
	public static void main(String[] args){

		int [] arr = {4,3,1,2,3,4,5,7,8,9,0};
		System.out.println("Befor : " +Arrays.toString(arr));
		quicksort(arr, 0 , arr.length-1);
		System.out.println("After :" +Arrays.toString(arr));
	}
	public static void quicksort(int [] arr, int l , int h){
		if(l<h){
			int pivotIndex = partition(arr, l ,h);
			quicksort(arr, l , pivotIndex-1);
			quicksort(arr, pivotIndex+1 , h);
		}
	}
	public static int  partition(int [] arr, int l , int h){
		int pivot = arr[h];
		int i = l - 1;

		for(int j = l ; j<h ; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
	
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;

		return i+1;
	}
}
