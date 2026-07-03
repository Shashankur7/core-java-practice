class Example44 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		m1();
		
	}
	public static void m1(){
		System.out.println("m1() form Example44");
		// Example41.m1();
		
	}
}
class Example45
{
	static Example44 obj = new Example44();
	 {
		System.out.println("non-Static block from example45");
		Example44.m1();
		//obj.m1();
	}

	public  void m2(){
		System.out.println("static method m2() frome Example45");
		// Example41.m1();
		obj.m1();
	}
	 class  InnerClassExample45
	{
		public static  void m3(){
			System.out.println("m3() static form InnerClassExample45");
			 Example44.m1();
			obj.m1();
		}
	}
}