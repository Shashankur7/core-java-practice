//5)Single Digit OR Two Digit  

class SingleOrTwoDigit{
	public static void main(String[] args){
		int num = 20;
		String res =(num >= -9 && num <=9) || (num >= -99 && num <= 99) ? " single or two digit " : " not " ;
		System.out.println(res);
	}
}