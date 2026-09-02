class ReturnExample{
	public static void main(String[] args){
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1(){
		System.out.println("m1() starts");
		System.out.println("Hello java ");
		System.out.println("Hello 2");
		if(true) return; //We can write return statement to take an early exit from method block
		System.out.println("hello 3");
		System.out.println("heloo 4 ");
		System.out.println("m1() ends");
	}
}