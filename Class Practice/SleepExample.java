class SleepExample{
	public static void main(String[] args) throws InterruptedException{
		
		int duration = 200;
		for (char ch = 'A' ; ch <= 'Z'; ch++){
			System.out.println(ch);
			Thread.sleep(duration);
			duration += 100;
		}
	}
}