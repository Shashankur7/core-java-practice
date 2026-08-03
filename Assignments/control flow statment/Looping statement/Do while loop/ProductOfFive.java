// 12. Product of first 5 numbers

class ProductOfFive{
	public static void main(String[] args){

		int i = 1;
		int pro = 1;
		do{
			pro = pro * i;
			i++;
		}while(i <= 5);
		System.out.println(pro);
	}
}