// Example of final with methods

class Ramesh{
	public final void business(){
		System.out.println("Business : " + " Gold");
	}
	//public void final something(){
	//	System.out.println("sdfasf");
	//}
}
class Suresh extends Ramesh{
	
}
class Mahesh extends Ramesh{
	@Override
	public void business(){
		System.out.println("Buisness :" + "Diamond");
	}
}
class Example55{
	public static void main(String[] args){
		Suresh obj = new Suresh();
		obj.business();

		Mahesh obj1 = new Mahesh();
		obj1.business();
	}
}