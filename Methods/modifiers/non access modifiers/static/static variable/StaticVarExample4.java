class StaticVarExample4 
{
	static String str = "Static ver form Example4";
	public static void main(String[] args) 
	{
	  Example2 obj = new Example2();
		obj.m1();
		Example2.InnerClass obj1 = obj.new InnerClass();
		obj1.m2();
	}
}
class Example2
{
	{
		System.out.println("non static block from Example2 " +StaticVarExample4.str);
	}
	public void m1(){
		System.out.println("non static m1() " +StaticVarExample4.str);
	}
	class InnerClass
	{
		public void m2(){
			System.out.println("non static m2() form InnerClass " +StaticVarExample4.str);
		}
	}
}
