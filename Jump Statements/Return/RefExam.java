class RefExam{
	public static void main(String[] args){
		System.out.println("main starts");
		System.out.println(m1()); // CTE void type not allowed
		m2();
		System.out.println("main ends");
	}
	public static void m2(){
		return 123;  // cte 
	}
	public static void m1(){
		System.out.println("m1() start");
		System.out.println("m1() ends");
		return;
	}
}