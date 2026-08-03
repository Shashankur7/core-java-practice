class SecondSmallest{
	public static void main(String[] args){
		int [] arr = {5,6,7,10,8,2,1};
		System.out.println(java.util.Arrays.toString(arr));
		int min1 = Integer.MAX_VALUE , min2 = min1 ;
		
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i] < min1){
				min2 = min1;
				min1 = arr[i];
			}else if(arr[i]<min2 && arr[i] != min1){
				min2 = arr[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
	}
}
