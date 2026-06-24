class Demo4 
{
	public static void main(String[] args) 
	{
		// m1(int a = 10);
		m1(10*2+2);
		int a = 123123;
		m1(a);
		m1(12312);
		
		int b;
		m1(b = 4321);
		
	}
	
	public static void m1(int a){
		System.out.println("m1 (int a) ");
		System.out.println(a);
	}
}
