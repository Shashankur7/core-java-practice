// 10. Sum of first 10 even numbers

class SumOfEven{
	public static void main(String[] args){
		
		int i = 1;
		int sum = 0;
		int count = 0;
		do{
			if(i % 2 == 0){
			count++;
			sum = sum + i;
			}
			i++;
		}while(count  < 10);
		System.out.println(sum);
	}
}