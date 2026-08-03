import java.util.Arrays;
class Demo6{
	public static void main(String[] args){
		char [] arr = new char[26];
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length ; i++){
			arr[i] = (char)(i+65);
		}
		System.out.println(Arrays.toString(arr));

	}
}