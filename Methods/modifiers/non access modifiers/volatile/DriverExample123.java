class Process{
	volatile static int num = 10;
}
class Suresh extends Thread{
	@Override
	public void run(){
		System.out.println("Suresh Exex Starts ");
		while(Process.num == 10){
		}
		System.out.println("Suresh Exec Ends");
	}
}
class Ramesh extends Thread{
	@Override
	public void run(){
	System.out.println("Ramesh Exec Starts");
	System.out.println("Ramesh num (before updt) :" +Process.num);
	
	try{
		System.out.println("Ramesh Thread went in Sleep state");
		Thread.sleep(5000);
	}
	catch(InterruptedException ie){
		System.out.println("Something Went Wtong ");
	}
	Process.num = 15;
	System.out.println("Ramesh num (After updt) :" +Process.num);
	System.out.println("Ramesh Exec ends");
	}
}
class DriverExample123{
	public static void main(String[] args){
		Ramesh thread1 = new Ramesh();
		thread1.start();

		Suresh thread2 = new Suresh();
		thread2.start();
	}
}