// 9. Sum of first 10 numbers

class SumOfNun{
	public static void main(String[] args){
		
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		}while(i<= 10);
		System.out.println(sum);

	}
}