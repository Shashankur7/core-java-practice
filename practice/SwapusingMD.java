class SwapusingMD{
	public static void main(String [] args){
		int a = 10 ;
		int b = 20 ;
		System.out.println("Before swapping");
		System.out.println("a : " +a);
		System.out.println(" b : " +b);

		a = a * b; // 10 * 20 = 200
		b = a / b; // 200 / 20 = 10
		a = a / b; // 200 / 10 = 20
		System.out.println("Swapped a : " + a);
		System.out.println("Swapped b : " + b);
	}
}