// 13. Product of first 5 even numbers

class ProductOfEvenNum{
	public static void main(String[] args){
		int pro = 1;
		
		for (int i = 2; i <= 10; i += 2){
			pro *= i;
		}
		System.out.println(pro);
	}
}