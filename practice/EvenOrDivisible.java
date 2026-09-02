class EvenOrDivisible{
	public static void main(String [] args){
		int num = 18;
		boolean res = (num % 2 == 0 || num % 5 == 0 ) ?  true : false;
		System.out.println(res);
	}
}