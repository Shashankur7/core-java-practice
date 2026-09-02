class FirstTwoFactorBreak{
	public static void main(String[] args){
		int num = 8 ;
		int count = 0;
		for(int i = 1; num <= 8 ; i++){
			if (num % i == 0){
				System.out.println("i : " +i);
				count++;

			if(count == 2)
				break;
			}
		}
	}
}