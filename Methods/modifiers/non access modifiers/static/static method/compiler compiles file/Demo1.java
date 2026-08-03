class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		m1();
	}
	static void m1(){
		System.out.println("m1");
		Demo2.m2();
	}
}
	class Demo2
	{
		static void m2(){
			System.out.println("m2");
			Demo3.m3();
	}
}
	class Demo3
	{
		static void m3(){
			System.out.println("m3");
			Demo4.m4();
	}
	
}

