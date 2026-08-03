import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		int [] arr = new int[20];
		for(int i = 0 ; i<arr.length; i++){
			 arr[i] = (int)(Math.random()*100);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a elem :");
		int key = new Scanner(System.in).nextInt();
		int indx = binarySearch(arr, key);
		System.out.println(key+ " : " +(indx != -1 ? indx : "not found "));
	}
	public static int binarySearch(int [] arr , int key){
		int l = 0 , h = arr.length - 1;
		while(l<=h){
		int mid = l + (h-l)/2;
		
			if(key < arr[mid]) h = mid - 1;
			else if( key > arr[mid] ) l = mid + 1;
			else return mid;
		}
		return -1;
	}
}