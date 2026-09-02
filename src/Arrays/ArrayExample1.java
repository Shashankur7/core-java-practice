package Arrays;
import java.util.Arrays;
class ArrayExample1{
	public static void main(String[] args){
		String [] a = new String[3];
		System.out.println(Arrays.toString(a));
		a[0] = "hi";
		a[1] = "hello";
		a[2] = "heiii";	
		System.out.println(Arrays.toString(a));
	}
}