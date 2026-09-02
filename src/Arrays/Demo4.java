package Arrays;
import java.util.Scanner;
import java.util.Arrays;
class Demo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i = 0; i<size ; i++){
			System.out.println("Enter " +(i+1)+" ele :");	

			int ele = sc.nextInt();
			arr[i] = ele ;
		}
		System.out.println(Arrays.toString(arr));
	}
}