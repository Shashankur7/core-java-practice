class Demo5 
{
	public static void main(String[] args) 
	{
			m1();
		}
		
		public static void m1(){
			int a = 12;
			int b = m2(a);
			System.out.println(a);
			System.out.println(b);
		
		}
		
		public static int m2(int a){
			int b = 13;
			System.out.println(b);
			System.out.println(a);
			return b;
		}
}
