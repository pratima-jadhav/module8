package Stringpack;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("pratima");
		sb.insert(7, " new text ");
		System.out.println(sb);
		
		sb.append(" cdac nashik");
		System.out.println(sb);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		int i=sb.indexOf("m");                                  
		System.out.println("i is "+i);
		int i2=sb.indexOf("t");
		System.out.println("i2 is "+i2);
		sb.replace(4, 7, "new");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		
		}

}
