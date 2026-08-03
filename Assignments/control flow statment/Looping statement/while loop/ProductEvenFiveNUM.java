// 13. Product of first 5 even numbers

class ProductEvenFiveNUM{
	public static void main(String[] args){
		
		int i = 1;
		int count = 0;
		int pro = 1;
		
		while(count < 5){
			if(i%2 == 0){
			count++;
				
			pro = pro * i;
		}
		i++;
		}
		System.out.println(pro);
	}
}			