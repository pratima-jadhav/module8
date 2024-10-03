package Stringpack;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("pratima");
		sb.append(" cdac nashik");
		System.out.println(sb);
		int i=sb.indexOf("t");
		System.out.println("i is "+i);
		int i2=sb.indexOf("t");
		System.out.println("i2 is "+i2);
		sb.replace(5, 8, "new");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		
		
		
		
		
	}

}
