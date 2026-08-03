// 6. Print odd numbers (1-20) using division operator
class OddNumDivision{
	public static void main(String[] args){
		for (int i = 1 ; i <= 20 ; i++ ){
			if (i/2 * 2 != i)
			System.out.println(i+ "odd");
		}
	}
}