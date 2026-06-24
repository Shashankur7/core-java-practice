// 11. Sum of first 10 odd numbers

class SumOfOddTen{
	public static void main(String[] args){
		int sum = 0;
	
		for (int i = 1; i <= 20 ; i += 2){
			sum += i;
			}
		System.out.println(sum+ "odd");
	}
}