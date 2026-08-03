// 14. Product of first 5 odd numbers

class ProductOfFive{
	public static void main(String[] args){

		int num = 1;
		for (int i = 1; i <= 9 ; i += 2){
			num *= i;
		}
		System.out.println(num);
	}
}