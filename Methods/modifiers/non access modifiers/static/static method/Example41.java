class Example41 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		m1();
	}
	public static void m1(){
		System.out.println("m1() form Example41");
		// Example41.m1();
		
	}
}
class Example42
{
	static Example41 obj = new Example41();
	static {
		System.out.println("Static block from example42");
		//Example41.m1();
		obj.m1();
	}

	public static void m2(){
		System.out.println("static method m2() frome Example42");
		// Example41.m1();
		obj.m1();
	}
	static class InnerClassExample32
	{
		public static void m3(){
			System.out.println("m3() static form InnerClassExample42");
			// Example42.m1();
			obj.m1();
		}
	}
}
