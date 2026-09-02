class StaticVarExample5 
{
	static String str = "Global var";
	public static void main(String[] args) 
	{
		System.out.println("main() ");
		m1();
	}
	public static void m1(){
		String str = "local var";
		System.out.println("m1() ");
		System.out.println(str);
		System.out.println(StaticVarExample5.str);
	}
}
