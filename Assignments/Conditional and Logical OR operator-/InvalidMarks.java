// 6)Invalid Marks  (marks < 0 || marks > 100 ) 

class InvalidMarks{
	public static void main(String[] args){
		int marks = 150;
		String res = marks < 0 || marks > 100 ? " invalid " : " valid " ;
		System.out.println(res);
	}
}
		