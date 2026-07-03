class Example 
{
	String str = "non stataic str";
	public static void main(String[] args) 
	{
		System.out.println("main");
		m2();
		//obj.m1();
	}
	public static void m2(){
		System.out.println("m2() static ");
		Example obj = new Example();
		//System.out.println(str);
		System.out.println(obj.str);
		obj.m1();
	}
	void m1(){
		System.out.println("non - static m1()");
	}
}
