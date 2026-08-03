// 3)Check Negative OR Odd  (num < 0 || num % 2 != 0 ) 

class NegativeOrOdd{
	public static void main(String[] args){
		int num = 20;
		String res = (num < 0 || num % 2 != 0) ? " true" : " false" ;
		System.out.println(res);
	}
}