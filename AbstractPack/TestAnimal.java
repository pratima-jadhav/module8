package AbstractPack;
abstract class Animal{
	final int legs=4;
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	public void classInfo(String type) {
	System.out.println("I belongs to " + type + " has "+ legs + "legs ");
}
}
class Dog extends Animal{
	public void sound(){
		System.out.println("The Dog Barks..");
		
	}
	public void fun1() {
		System.out.println("this is fun1");
	}
	public void fun2() {
		System.out.println("this is fun2");
	}
}
class Lion extends Dog{
	public void sound(){
		System.out.println("The lion roar..");
		
	}
	public void fun1() {
		System.out.println("this is fun1");
	}
	public void fun2() {
		System.out.println("this is fun2");
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
	Dog tuffy=new Dog();
	tuffy.classInfo("Dog");
	tuffy.sound();
	tuffy.fun1();
	tuffy.fun2();
	
	Lion lion=new Lion();
	lion.classInfo("Lion");
	lion.sound();
	lion.fun1();
	lion.fun2();

	}

}
