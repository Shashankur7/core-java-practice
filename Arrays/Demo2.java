import java.util.Arrays;
class Demo2{
	public static void main(String[] args){
		int [] a = {10,20,30,40,50,60};
		for(int i = 0 ; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("____while________");
		int i = 0;
		while(i<a.length){
			System.out.println(a[i]);
			i++;
		}
		System.out.println("_____________do while_______");
		int j = 0;
		do{
			System.out.println(a[j]);
			j++;
		}while(j<a.length);
	}
}