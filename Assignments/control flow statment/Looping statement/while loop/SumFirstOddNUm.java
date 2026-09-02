// 11. Sum of first 10 odd numbers

class SumFirstOddNUm{
	public static void main(String[] args){
		
		int count = 0;
		int sum = 0;
		int i = 1;
		while(count < 10){
			if(i%2 != 0){
				count++;
				
			sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
