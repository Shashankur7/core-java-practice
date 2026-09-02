package Arrays;
import java.util.Arrays;
class MergeExample1{
	public static void main(String[] args){
		int [] a = {10,20,30};
		int [] b = {40,50,60,70};
		int [] c = new int[a.length + b.length];
	
		
		for(int i = 0; i<c.length; i++){
			if(i<a.length){
				c[i] = a[i];
			}else{
				c[i] = b[i - a.length];
		}
	}
			System.out.println(Arrays.toString(c));
		}
}
			