package Arrays;
import java.util.Arrays;
class Example15{
	public static void main(String[] args){
		int[] arr = {1,2,3,5,2,5,6,7,7,8,1};
		System.out.println(Arrays.toString(arr));
		int min = Integer.MAX_VALUE;	
		int ele = 0;
		boolean[] b = new boolean[arr.length];
		for(int i = 0 ; i<arr.length ; i++){
			if(b[i]) continue;
			int cnt = 0;
			for(int j = 0 ; j<arr.length ; j++){
				if(arr[i] == arr[j] && !b[j]){
					cnt++;
					b[j] = true;
				}
			}
			if(cnt < min){
				min = cnt;
				ele = arr[i];
			}
		}	
		System.out.println(ele +" : " +min);
	}
}