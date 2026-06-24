class OneToHunRecurshonEven 
{
	static int num = 1;
	public static void main(String[] args) 
	{
		printEven();
	}
	public static void printEven(){
		if(num % 2 == 0)
			System.out.print (num+ " ");
		if(num++ == 100) return;
		printEven();
	}
}
