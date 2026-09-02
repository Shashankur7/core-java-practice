package Arrays;
import java.util.Arrays;
class NumberFrequency{
	public static void main(String[] args){
	
		int []  arr = {1,1,2,3,3,4,1,2,3,6,7,5,6,7,9};
		
		int n = arr.length;
		strFrequency(arr,n);
		distinct(arr,n);
		unique(arr,n);
		duplicate(arr,n);
		
		
	}
	public static void strFrequency(int [] arr , int n){
		boolean [] b = new boolean[n];
		for(int i = 0 ; i<n ; i++){
		if(b[i]) continue;
		int cnt = 1;
		for(int j = i+1; j<n ; j++){
			if(arr[i]==(arr[j]) && !b[j]){
				cnt++;
				b[j] = true;
				}
			}
			System.out.println(arr[i]+ " : " +cnt);
			}
			System.out.println("_______Distinct__________");
	
		}
	
		public static void distinct(int [] arr,int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i<n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i]==(arr[j])){
					cnt++;
					b[j] = true;
					}
				}
				System.out.println(arr[i]);
			}
			System.out.println("__________unique_____");
		}	
		public static void unique(int[] arr, int n){
			boolean [] b =  new boolean[n];
			for(int i = 0 ; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i]==(arr[j])){
					cnt++;
					b[j] = true;
					
				}
		}
		if(cnt == 1)
		System.out.println(arr[i]+ " : " +cnt);
		}
		System.out.println("___________duplicate____________");
	}		
		public static void duplicate(int[] arr, int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i]==(arr[j]))
					cnt++;
					b[j] = true;
				}
				
			if(cnt > 1)
			System.out.println(arr[i] +" : " +cnt);
			}	
	}
}

