// 7. Print odd numbers (1-10) using % operator

class OddNumUsingMOd {
	public static void main(String[] args) {
	
		int i = 1;
		while(i <= 10) {
			if (i % 2 != 0){
				System.out.println("odd :" +i);
			}
			i++;
		}
	}
}