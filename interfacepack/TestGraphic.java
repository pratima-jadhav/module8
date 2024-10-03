package interfacepack;

public class TestGraphic {

	public static void main(String[] args) {
		Circle circle =new Circle(6);
		System.out.println("Area is "+circle.area());
		System.out.println("perimeter is "+circle.perimeter());
		
		Rectangle rectangle =new Rectangle(5,6);
System.out.println("rectangle area = " +rectangle.area());
System.out.println("rectangle perimeter = "  +rectangle.perimeter());
	}

}
