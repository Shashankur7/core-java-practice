//import java.util.Arrays;
package Arrays;

class Demo3{
	public static void main(String[] args){
		int [] a = {10,20,30,40,50,60};
		for(int i = a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
		System.out.println("_________while_____________");
		int i = a.length-1;
		while(i>=0){
			System.out.println(a[i]);
			i--;
		}
		System.out.println("___________do while_____________");
		int j = a.length-1;
		do{
			System.out.println(a[j]);	
			j--;
		}while(j>=0);
	}
}