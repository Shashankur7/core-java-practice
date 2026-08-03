import java.util.*;
class TernarySearch{
	public static void main(String[] args){
		int [] arr = new int[20];
		for(int i = 0 ; i<arr.length; i++)
		arr[i] = (int)(Math.random()*100);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter ele :");
		int key = new Scanner(System.in).nextInt();
		int indx = ternarySearch(arr,key);
		System.out.println(key+" : "+(indx!= -1 ? indx : "not found"));

	}
	public static int ternarySearch(int [] arr , int key){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid1 = low+(high-low)/3;
			int mid2 = high-(high-low)/3;
			if(key == arr[mid1]) return mid1;
			if(key == arr[mid2]) return mid2;
			if(key<arr[mid1]) high = mid1-1;
			else if(key>arr[mid2]) low = mid2+1;

			else{
				low = mid1 + 1;
				high = mid2 - 1;
			}

		}
		return -1;
	}
}