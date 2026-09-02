package Arrays;
class Demo7{
	public static void main(String[] args){
		char [] arr = new char[26];
		System.out.println(java.util.Arrays.toString(arr));

		for(int i = arr.length-1; i>= 0; i--){
			arr[i] = (char)(122-i);
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}

/*class Demo6{
	public static void main(String[] args){
		char [] arr = new char[26];
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length ; i++){
			arr[i] = (char)(i+65);
		}
		System.out.println(Arrays.toString(arr));

	}
}*/