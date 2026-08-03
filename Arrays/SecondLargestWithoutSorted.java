class SecondLargestWithoutSorted{
	public static void main(String[] args){
		int [] arr = {5,6,7,10,8,2,1};
		System.out.println(java.util.Arrays.toString(arr));
		int max1 = Integer.MIN_VALUE , max2 = max1 ;
		
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i] > max1){
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i]>max2 && arr[i] != max1){
				max2 = arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}
