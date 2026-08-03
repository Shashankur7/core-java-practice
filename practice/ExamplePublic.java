

class ExamplePublic extends ExamplePublic1{
	public static void main(String[] args){
		ExamplePublic1 obj = new ExamplePublic1();
		obj.m1();
		
		ExamplePublic1 a = new ExamplePublic();
		a.m1();
		System.out.println(a);
	}
}