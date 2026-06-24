class RecursionCharacter
{
	static char ch = 'A';
	public static void main(String[] args) 
	{
		printAlphabet();
	}
	public static void printAlphabet(){
		System.out.println(ch+ " ");
		if(ch++ ==90) return;
		 printAlphabet();
	}
}
