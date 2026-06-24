// 13. Product of first 5 even numbers

class ProductOfEven{
	public static void main(String[] args){
		
		int i = 1;
		int pro = 1;
		int count = 0;
		do {
			if(i%2 == 0){
				count++;
				pro = pro * i;
			}
			i++;
		}while(count < 5);
		System.out.println(pro);
	}
}