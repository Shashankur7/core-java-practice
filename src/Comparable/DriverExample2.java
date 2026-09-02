package Comparable;
import java.util.*;
class Marker implements Comparable<Marker>{
	int id;
	String color;
	double price;
	Marker(int id, String color , double price){
		this.id = id;
		this.color = color;
		this.price = price;
		
	}
	public String toString() {
		return id+" "+color +" "+price;
	}
	//assending sort based price
	@Override
	public int compareTo(Marker obj) {
		if(this.price>obj.price) return +1;
		else if(this.price<obj.price) return -1;
		return 0;
	}
//	// id asc sort
//	@Override
//	public int compareTo(Marker obj) {
//		return this.id-obj.id;
//	}
//	//id desc sort
//	@Overrind
//	public int compareTo(Marker obj) {
//		if(obj.id>this.id) return 1;
//		else if(obj.id<this.id) return -1;
//		return 0;
//	}
//	public int compareTo(Marker obj) {
//		if(this.color.compareTo(obj.color)>0) return -1;
//		else if(this.color.compareTo(obj.color)<0) return 1;
//		return 0;
//	}
}


public class DriverExample2 {
	public static void main(String[] args) {
		ArrayList<Marker> list = new ArrayList<Marker>();
		list.add(new Marker(1,"Red",25));
		list.add(new Marker(2,"BLACK",25));
		list.add(new Marker(3,"RED",30));
		list.add(new Marker(4,"BLUE",20));
		
		list.forEach(ele->System.out.println(ele));
		Collections.sort(list);
		
		System.out.println("---------------");
		list.forEach(ele->System.out.println(ele));
		
		System.out.println("-----------------------");
		list.forEach(ele->System.out.println(ele));
	}
}
