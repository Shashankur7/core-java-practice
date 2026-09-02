package OOP;
class Animal{
	public void say(){
		String name= "animal";
		System.out.println("this is animal say");
	}

}
class Dog extends Animal{
	String name=  "dog";
	public void say(){
		System.out.println("this.is dog say");
	}
}
class Cat extends Animal{
	public void say(){
		System.out.println("this is cat say");
 	}
}

class Test{
	public static void main(String [] args){
		Animal a = new Dog();
		a.say();
		Animal a1 = new Cat();
		a1.say();
		
	}
}