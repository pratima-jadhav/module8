package Staticnested;
class OuterClass {
	private static String msg="welcome to nested classes";
	
	public static class NestedStaticClass{
		public void printMessage() {
			System.out.println("message from nested static class: " +msg);
		}
	}
	
	public class InnerClass{
		public void display() {
			System.out.println("message from non static nested  class :" +msg);
		}
	}
	
	
	
	
}
public class ClassesNested {

	public static void main(String[] args) {
		OuterClass.NestedStaticClass printer=new OuterClass.NestedStaticClass();
		printer.printMessage();
		
		OuterClass outer= new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		inner.display();

	}

}
