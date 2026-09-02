package Arrays;
class Demo10{
	public static void main(String[] args){
		int [] arr = new int [30];
		
		for(int i = 0 ; i<arr.length ; i++){
			int num = (int)(Math.random()*100);
			arr[i] = num;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}