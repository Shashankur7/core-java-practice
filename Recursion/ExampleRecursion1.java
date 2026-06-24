class ExampleRecursion1 
{
	public static void main(String[] args) 
	{
		printNumber(1);
	}
	public static void printNumber(int num){
	System.out.println(num+ " ");
	if(num++ == 10) return;
	printNumber(num);
	
	}
	
}