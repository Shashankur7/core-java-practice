import java.util.Scanner;
class Demo9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int num = sc.nextInt();
		int [] arr = new int [10];
		
		System.out.println(java.util.Arrays.toString(arr));
				
		for(int i = 0 ; i < arr.length; i++){
			arr[i]= num * (i+ 1);
		}
		System.out.println(java.util.Arrays.toString(arr));
	
	}
}
		
		