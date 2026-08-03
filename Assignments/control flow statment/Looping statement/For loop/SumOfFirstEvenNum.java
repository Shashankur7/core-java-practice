// 10. Sum of first 10 even numbers

class SumOfFirstEvenNum{
	public static void main(String[] args){
		int sumEven = 0;
		for (int i = 1 ; i <= 20; i++){
			if (i % 2 == 0)
			sumEven = sumEven + i;
		}
			System.out.println(sumEven);
	}
}