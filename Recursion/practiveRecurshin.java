/*class practiveRecurshin 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int op = printReverse(num , 0);
		System.out.println(num+ " : " +op);
		
	}
	public static int printReverse(int num , int rev){
		if(num == 0) return rev;
		rev = rev * 10 + (num % 10);
		
		return printReverse(num/10,rev);
	}
}*/
class practiveRecurshin {
	public static void main(String[] args){
		int num = 4	;
		int fact = printFactor(num , 1, 1);
		System.out.println(num+ " : " +fact);
	}
	public static int printFactor(int num , int fact, int i){
		if(i > num) return fact;
		fact = fact*i;
		return printFactor(num, fact, ++i);
	}
}