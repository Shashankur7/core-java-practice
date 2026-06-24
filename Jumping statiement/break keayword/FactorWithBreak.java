class FactorWithBreak{
	public static void main(String[] args){
		int num = 8 ;
		for(int i = 1; num <= 8 ; i++){
			if (num % i == 0){
				System.out.println("i : " +i);
				break;
			}
		}
	}
}