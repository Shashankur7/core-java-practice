// 10. Sum of first 10 even numbers

class SumOfEvenNum{
	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		int i = 1;
		while ( count < 10){
			if(i % 2 == 0){

				sum = sum + i;
				count++;
			}
				i++;
		}	
			System.out.println(sum);
	}
}