import java.util.Arrays;
class BubbleSort{
	public static void main(String[] args){
		int [] arr = {5,6,3,5,6,7,1,2,3};
		System.out.println("Before sort " +Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("After sort :" +Arrays.toString(arr));
	}
	
	/*public static void bubbleSort(int [] arr, int n){
		for(int i = 0; i<n ; i++){
			for(int j = 0; j<n-1-i ; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}*/

	public static void bubbleSort(int [] arr, int n){
		for(int i = 0 ; i<n; i++){
			for(int j = i + 1; j<n ; j++){
				if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	}
}