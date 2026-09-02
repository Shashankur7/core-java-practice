class RetExample{
	public static void main(String[] args){
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1(){
		System.out.println("m1() starts");
		System.out.println("m1() ends");
	}
}

/*

  RetExample();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String main starts
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: invokestatic  #21                 // Method m1:()V
      11: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      14: ldc           #26                 // String main ends
      16: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: return

  public static void m1();
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #28                 // String m1() starts
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #30                 // String m1() ends
      13: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: return  --- compiler added it implicetly
}
*/