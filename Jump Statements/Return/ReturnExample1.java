class ReturnExample1{
	public static void main(String[] args){
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1(){
		System.out.println("m1() starts");
		if(true){
			System.out.println("hello");
		}
		System.out.println("m1() ends");
	}
}