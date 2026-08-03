import java.util.*;
class ExponentialSearch{
	public static void main(String[] args){
		int [] arr = new int[20];
		for(int i = 0, ele =10; i<arr.length;i++,ele+=10){
			arr[i]= ele;

		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter an ele :");
		int key = new Scanner(System.in).nextInt();
		int indx = exponentialSearch(arr, arr.length,key);
		System.out.println(key+ " : " +(indx!=-1?indx:"not found"));
	}

	public static int exponentialSearch(int [] arr, int n , int key){

		if(arr[0] == key ) return 0;
		int i = 1;
		while(i<n && arr[i]<= key){
			i*=2;
		}
		return binarySearch(arr, key , i/2, Math.min(i,n));
	}
	public static int binarySearch(int [] arr, int key , int l , int h){
		while(l<=h){
			int mid = l+(h-l)/2;
			if(key > arr[mid]) l=mid+1;
			else if(key < arr[mid]) h = mid-1;
			else return mid;
		}
		return -1;
	}
}