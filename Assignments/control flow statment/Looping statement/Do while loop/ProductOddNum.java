// 14. Product of first 5 odd numbers

class ProductOddNum{
	public static void  main(String[] args){
		
		int i = 1;
		int pro = 1;
		do{
			if(i % 2 != 0){
			pro = pro* i;
		 	}
			i++;
		}while(i <= 10);
		System.out.println(pro);
	}
}