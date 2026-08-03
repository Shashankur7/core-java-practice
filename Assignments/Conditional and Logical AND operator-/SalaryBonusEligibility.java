import java.util.Scanner;

class SalaryBonusEligibility{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Salary :");
	int salary = sc.nextInt();
	
	System.out.println("exp :");
	int exp = sc.nextInt();

	String res = (salary >= 25000 && exp >= 2) ? "Bonus Eligible " : " not eligible";
	System.out.println(res);
 	}
}