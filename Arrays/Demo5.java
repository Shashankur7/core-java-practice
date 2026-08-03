import java.util.Arrays;
class Demo5{
	public static void main(String[] args){
		int [] arr = new int[100];

		System.out.println(Arrays.toString(arr));
		
		for(int i = 0,j =10; i< arr.length; i++,j+=10){
			arr[i] = j;
		}
		System.out.println(Arrays.toString(arr));
	}
}