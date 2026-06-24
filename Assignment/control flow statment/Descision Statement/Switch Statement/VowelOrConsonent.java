//6)Write a program to print vowel or consonant using switch 

import java.util.Scanner;
class VowelOrConsonent	{
	public static void main(String[] args){

		final char ch1 = 'a';
		final char ch2 = 'e';
		final char ch3 = 'i';
		final char ch4= 'o';
		final char ch5 = 'u';

		Scanner sc = new Scanner(System.in);
		System.out.println("enter char :");
		char choice = sc.next().charAt(0);

		switch(choice){
		
			case ch1:
				System.out.println("vowel"); break;
			case ch2:
				System.out.println("vowel"); break;
			case ch3:
				System.out.println("vowel"); break;
			case ch4:
				System.out.println("vowel"); break;
			case ch5:
				System.out.println("vowel"); break;
			default:
				System.out.println("consonent");
			

		}
	}
}