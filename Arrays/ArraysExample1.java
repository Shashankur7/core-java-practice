import java.util.Arrays;
class ArraysExample1{
 	public static void main(String[] args){
		int [] arr = {4,3,1,2,3,1,3,4};
		boolean [] b = new boolean[arr.length];
		for(int i = 0 ; i<arr.length ; i++){
		if(b[i]) continue;
		int cnt = 1;
		for(int j = i+1; j<arr.length ; j++){
			if(arr[i] == arr[j] && !b[j]){
				cnt++;
				b[j] = true;
			}
			}
			System.out.println(arr[i]+ " : " +cnt);
		}
	
	}
}
