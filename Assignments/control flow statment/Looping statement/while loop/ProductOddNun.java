// 14. Product of first 5 odd numbers

class ProductOddNun{
	public static void main(String[] args){
		
		int i = 1;
		int pro = 1;
		int count = 0;
		
		while(count < 5){
		
			pro = pro * i;
			i += 2;
			count++;
		}
		System.out.println(pro);
	}
}