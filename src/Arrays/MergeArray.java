package Arrays;
import java.util.Arrays;
class MergeArray{
	public static void main(String[] args){
		int [] a = {10,20,30};
		int [] b = {40,50,60,70,80};
		int max = a.length>b.length ? a.length : b.length;
		int [] c = new int[a.length+b.length];
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		//System.out.println(Arrays.toString(c));

		for(int i = 0 , j = 0 ; i<max ; i++){
			if(i<a.length)c[j++] = a[i];
			if(i<b.length)c[j++] = b[i];
		}
				System.out.println(Arrays.toString(c));
	}
}