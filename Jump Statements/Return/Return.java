class Return{
	public static void main(String[] args){
		System.out.println("main starts");
		//System.out.println(m1());
		m1();
//		m2();
		System.out.println("main ends");
	}
	public static void m1(){
		System.out.println("m1() starts");
		if(true){
			return;
		}
		System.out.println("m1() ends");
	}
}