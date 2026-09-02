class Assignmen{
	public static void main(String [] args){
		int a = 5; 
		int b = 6;
		int c = 7;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);

		a = b = c ;
		c = b = a;
		b = a = b ;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
	}
}