import java.util.Arrays;
class LinerSearchPractice{
	public static void main(String[] args){
		int [] arr = new int[20];
		for(int i = 0 ; i<arr.length; i++){
			arr[i] =(int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));	
		System.out.println("Enter key : ");
		int key = new java.util.Scanner(System.in).nextInt();
		int indx =  linearSearch(arr, key);
		System.out.println(key+ " : " +(indx != -1 ? indx : "not found"));
	}
	public static int linearSearch(int [] arr , int key){
		for(int i = 0 ; i<arr.length ; i++){
			if(key == arr[i]) return i;
		
		}
		return -1;
	}
}