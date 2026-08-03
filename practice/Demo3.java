class Demo3{
	public static void main(String [] args){
		int e = 1;
		int f = 2;
		int g = 3;
		e = e++ + f++ + g++;
		f = e++ + f++ + g++;
		g = g++ + f++ + g++;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}