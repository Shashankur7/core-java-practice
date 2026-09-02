package Arrays;
import java.util.Arrays;
class StringFriquency{
	public static void main(String[] args){
	
		String str = "java is easy and arrays are more easy ";
		String [] arr = str.split(" ");
		int n = arr.length;
		strFrequency(arr,n);
		distinct(arr,n);
		unique(arr,n);
		duplicate(arr,n);
		
		
	}
	public static void strFrequency(String [] arr , int n){
		boolean [] b = new boolean[n];
		for(int i = 0 ; i<n ; i++){
		if(b[i]) continue;
		int cnt = 1;
		for(int j = i+1; j<n ; j++){
			if(arr[i].equals(arr[j]) && !b[j]){
				cnt++;
				b[j] = true;
				}
			}
			System.out.println(arr[i]+ " : " +cnt);
			}
			System.out.println("_______Distinct__________");
	
		}
	
		public static void distinct(String [] arr,int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i<n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i].equals(arr[j])){
					cnt++;
					b[j] = true;
					}
				}
				System.out.println(arr[i]);
			}
			System.out.println("__________unique_____");
		}	
		public static void unique(String[] arr, int n){
			boolean [] b =  new boolean[n];
			for(int i = 0 ; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i].equals(arr[j])){
					cnt++;
					b[j] = true;
					
				}
		}
		if(cnt == 1)
		System.out.println(arr[i]+ " : " +cnt);
		}
		System.out.println("___________duplicate____________");
	}		
		public static void duplicate(String[] arr, int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(arr[i].equals(arr[j])){
					cnt++;
					b[j] = true;
				}
			}
			if(cnt > 1)
			System.out.println(arr[i] +" : " +cnt);
		}	
	}
}

