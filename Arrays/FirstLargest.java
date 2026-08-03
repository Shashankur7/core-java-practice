class FirstLargest{
	public static void main(String[] args){
		
		int [] arr = {5,6,7,10,8,2,1};
		System.out.println(java.util.Arrays.toString(arr));
		int max1 = Integer.MIN_VALUE ;
		
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i] > max1){
				max1 = arr[i];
			}
		}
		System.out.println(max1);
	}
}
