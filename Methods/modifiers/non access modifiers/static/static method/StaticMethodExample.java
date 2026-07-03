class StaticMethodExample 
{
	static {
		System.out.println("static blocl");
		m1();
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		m1();
		m2();
		innerClass.m3();
	}
	public static void m1(){
		System.out.println("m1() start method");
	}
	public static void m2(){
		System.out.println("m2() static method");
		m1();
	}
	static class innerClass
	{
		public static void m3(){
			System.out.println("m3() froem innerclass starts");
			m1();
		}
	}
}
	