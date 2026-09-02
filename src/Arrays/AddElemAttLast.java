package Arrays;
import java.util.Arrays;
class AddElemAttLast{
	public static void main(String[] args){
		int [] arr = {10,20,30,40,50,60};
			
		System.out.println(Arrays.toString(arr));
		int ele = 70;
		int [] newArr= new int[arr.length + 1];

		for(int i = 0 ; i < arr.length ; i++){
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = ele;
		
		System.out.println(Arrays.toString(newArr));
	}
}