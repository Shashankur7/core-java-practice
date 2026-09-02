// 12. Product of first 5 numbers

class ProductOfNUm{
	public static void main(String[] args){
		
		int pro = 1;
		int i = 1;
		int count = 0;
	
		while(count < 5){
			pro = pro * i;
			//i++;
			count++;
			i++;
		}
		System.out.println(pro);
	}
}  