class DriverExample1{
	public static void main(String[] args){
		Task task = new Task();
	
		MyThread t1 = new MyThread("Ramesh ", task);
		t1.start();

		MyThread t2 = new MyThread("Suresh", task);
		t2.start();
	
		MyThread t3 = new MyThread("Mahesh ", task);
		t3.start();
	}
}
class MyThread extends Thread{
	
	String threadName;
	Task task;

	MyThread(String threadName , Task task){
		this.threadName = threadName;
		this.task = task;
	}
	
	@Override
	public void run(){
		try{
			task.printNumber(threadName);	
		}
		catch(Exception e){
			System.out.println("Something went wront ");
		}
	}
}

class Task {
	public synchronized void printNumber(String threadName)
		throws InterruptedException{
			for(int i = 1; i <= 10; i++){
				System.out.println(threadName+ " : " +i);
				//Thread.sleep(1000);
			}
	}
}