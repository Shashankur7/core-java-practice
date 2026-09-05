package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Train{
	String name;
	String trainNumber;
	String departure;
	String destination;
	
	public Train(String name,String trainNumber,
				String departure, String destination)
	{
	super();
	this.name= name;
	this.trainNumber=trainNumber;
	this.departure=departure;
	this.destination = destination;
	}
	@Override
	public String toString() {
	return "Train [name=" + name +", trainNumber" +trainNumber +", departure"+departure +", destination"+
	destination+"]";		
	}
}

class Ticket{
	static int seat = 12321;
	String name;
	String gender;
	int age;
	String seatNumber;
	Train train;
	
	public Ticket(String name, String gender,
			int age , Train train)
	{
		super();
		this.name = name;
		this.gender= gender;
		this.age = age;
		this.seatNumber= "VB"+seat++;
		this.train= train;
	}
	@Override
	public String toString() {
		return "Ticket [ seatNumber=" +seatNumber +"]";
	}
}

class Passenger{
	String name;
	String gender;
	int age;
	long contact;
	Ticket ticket;
	
	public Passenger(String name, String gender,
			int age, long contact, Train train)
	{
		super();
		this.name = name;
		this.gender= gender;
		this.age= age;
		this.contact = contact;
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Passenger [name" + name+ ", gender+" +gender+
							",age= " +age +", contact=" +contact+",ticket="
									+ticket +"]";
	}
}
class SortNameAssending implements Comparator<Passenger>{
	@Override
	public int compare(Passenger p1, Passenger p2) {
		if(p1.name.compareTo(p2.name)>0) return 1;
		else if(p1.name.compareTo(p2.name)<0) return -1;
		return 0;
	}
}
class SortNameDesending implements Comparator{
	@Override
	public int compare(Object o1 , Object o2) {
		Passenger p1 = (Passenger) o1;
		Passenger p2 = (Passenger)o2;
		
		return p2.name.compareTo(p1.name);
	}
}
class SortAgeDescending implements Comparator<Passenger>{
	@Override
	public int compare(Passenger p1 , Passenger p2) {
		return p2.age - p1.age;
	}
}
class IRCTC{
	Train train = new Train("VandeBharat","VB23424","pune","Delhi");
	ArrayList<Passenger> list = new ArrayList<Passenger>();
	{
		list.add(new Passenger("Ramesh","Male",25,987362723345l,train));
		list.add(new Passenger("Rajesh","Male",23,98743223345l,train));
		list.add(new Passenger("Ram","Male",22,98736224245l,train));
		list.add(new Passenger("Tanvi","Female",45,9873342345l,train));
		list.add(new Passenger("Arav","Male",11,982445323345l,train));
		list.add(new Passenger("om","Male",66,98736423445l,train));
		list.add(new Passenger("Akshay","Male",22,98442223345l,train));
		list.add(new Passenger("Sadie","Female",35,9424322723345l,train));
		list.add(new Passenger("Milli","Feale",26,983242723345l,train));
	}
	public void Features() {
		while(true){
			System.out.println("\n WELCOME TO IRCTC");
			System.out.println("1. View All Passengers");
			System.out.println("2 . Sort");
			System.out.println("Enter your option :");
			int opt = new Scanner(System.in).nextInt();
			switch(opt) {
			case 1 -> viewAllPassenger();
			case 2 -> sort();
			}
		}
	}
	private void sort() {
		System.out.println("\n OPTIONS :");
		System.out.println("1. Name Assending");
		System.out.println("2. Name Descending");
		System.out.println("3. Gender(M-F)");
		System.out.println("4. Age Descinding");
		System.out.println("5. Age Ascending");
		System.out.println("6. Ticket Ascending");
		System.out.println("Enter and option :");
		int opt = new Scanner(System.in).nextInt();
		switch(opt){
			case 1 -> nameAscending();
			case 2 -> nameDescending();
			case 3 -> ageDescinding();
			case 4 -> ageAscending();
		}
	}
	private void ageAscending() {
		Collections.sort(list,(p1,p2)->{
			if(p1.age>p2.age) return +1;
			else if(p1.age<p2.age) return -1;
			return 0;
		});
		Collections.sort(list,(p1,p2)->p1.age-p2.age);
	}
	private void ageDescinding() {
		Collections.sort(list, new SortAgeDescending());
		
	}
	private void nameDescending() {
		Collections.sort(list, new SortNameDesending());
	}
	private void nameAscending() {
		Collections.sort(list, new SortNameAssending());
	}
	private void viewAllPassenger() {
		System.out.println("\n All PASSENGERS");
		for(Passenger passenger : list) {
			System.out.println(passenger);
		}
	}
}
	public class DriverExampleIRCTC {
		public static void main(String[] args) {
			new IRCTC().Features();
		}
}
