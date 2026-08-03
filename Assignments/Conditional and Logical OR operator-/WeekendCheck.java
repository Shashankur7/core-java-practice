// 7)Weekend Check  (day == 6 || day == 7 ) 

class WeekendCheck{
	public static void main(String [] args){
		int day = 5;
		String res = (day == 6 || day == 7) ? "weekend" : " week day";
		System.out.println(res);
	}
}