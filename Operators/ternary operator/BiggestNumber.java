class BiggestNumber {
	public static void main(String [] args){

		int a = 10 ;
		int b = 50 ;
		int c = 100;
		int d = 262	;
		
		int max = (a>b ? a : b ) > (c>d ? c : d ) ? (a>b ? a : b) : (c>d ? c : d);
		System.out.println(max);
	}
}