// 2)Check Even OR Divisible by 5  (num % 2 == 0 || num % 5 == 0 ) 

class EvenOrDivisible{
	public static void main(String[] args){
		int num = 18;
		String res = (num % 2 == 0 || num % 5 == 0) ? " true " : " false" ;
		System.out.println(res);
	}
}