package Arrays;
class Demo14{
	public static void main(String[] args){
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int pro = 1;
		for(int i = 0; i<a.length; i++){
			pro *= a[i];
		}
		System.out.println(pro);
	}
} 