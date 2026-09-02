package Arrays;
class Demo11{
	public static void main(String[] args){
		int [] arr = new int [30];

		for(int i = 0; i<arr.length; i++){
			int num = (int)(Math.random()*100);
			if(!checkElement(i,num,arr) && num>=10){
				arr[i] = num;
				continue;
			}
			i--;
		}
		
		System.out.println(java.util.Arrays.toString(arr));
	}
	public static Boolean checkElement(int end, int num , int[] arr){
		for(int i = 0; i<= end ; i++){
			if(arr[i] == num) return true;
		}	
		return false;
	}
}