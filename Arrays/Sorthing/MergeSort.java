import java.util.Arrays;
class MergeSort{
	public static void main(String [] args){
		int [] arr = {9,5,6,4,3,6,2,8,1,0};
		System.out.println("Before :" +Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("After :" +Arrays.toString(arr));
	}
	public static void mergeSort(int []arr, int l , int r){
		if(l<r){
			int mid = l+(r- l)/ 2;
			mergeSort(arr, l, mid);
			mergeSort(arr,mid+1, r);
			merge(arr, l, mid , r);
		}
	}
	public static void merge(int [] arr, int l , int mid , int r){
		int leftLen = mid - l + 1;
		int rightLen = r - mid;
		
		int [] leftArr = new int[leftLen];
		int [] rightArr = new int[rightLen];
		
		for(int i = 0 ; i<leftLen ; i++) leftArr[i] = arr[l+i];
		for(int i = 0 ; i<rightLen; i++) rightArr[i] = arr[mid + 1 +i ];
		
		int i = 0, j = 0, k = l;
		while(i<leftLen && j <rightLen){
			if(leftArr[i] < rightArr[j]) arr[k++] = leftArr[i++];
			else arr[k++] = rightArr[j++];
		}
		while(i<leftLen) arr[k++] = leftArr[i++];
		while(j<rightLen) arr[k++] = rightArr[j++];
	}
}