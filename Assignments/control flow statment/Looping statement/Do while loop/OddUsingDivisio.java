// 6. Print odd numbers (1-20) using division operator

class OddUsingDivisio{
	public static void main(String[] args){
		
		int i = 1;
		do {
			if((i/2) * 2 != i)
			System.out.println(i);
		i++;
		}while(i<=20);
	}
}