// 6. Print odd numbers (1-20) using division operator

class OddNumUsingDiv{
	public static void main(String[] args) {
		
		int i = 1;
		while( i <= 20 ) {
			if((i/2) * 2 != i) {
				System.out.println("odd :" +i);
			}
			i++;
		}
	}
}