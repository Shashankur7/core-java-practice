//class a final 

final class Pitaji{
	public  void loan();
}
class Beta extends Pitaji{
	@Override
	public void loan(){
		System.out.println("Loan Cleared");
	}
}
class Example66{
	public static void main(String[] args){
		Beta obj = new Beta();
		obj.loan();
	}
}