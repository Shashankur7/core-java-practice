package Arrays;
import java.util.Arrays;
class ArrayExample{
	public static void main(String[] args){
		char[] a = new char[5];
		System.out.println(Arrays.toString(a));
		a[0] = 'a';
		a[1] = 'e';
		a[2] = 'i';
		a[3] = 'o';
		a[4] = 'u';
		System.out.println(Arrays.toString(a));
	}
}