class Singleton{
	private static Singleton obj; // Singel
	private Singleton(){
		super();
	}
	public static Singleton getInstance(){
		if(obj == null)
			obj = new Singleton();

		return obj;
	}
}
class DriverSingeltoneExample{
	public static void main(String[] args){
		Singleton obj = Singleton.getInstance();
		System.out.println(obj);

		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);
	}
}