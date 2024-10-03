package Stringpack;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String ("  Pratima Suresh Jadhav");
		String str2=new String ("  Jadhav");
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(2, 8));
		
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim().toLowerCase()); //nested fun
		System.out.println(str.indexOf("r"));
		System.out.println(str.replace("i", "ee"));
		System.out.println(str.concat(str2));
		
		if(str.equals(str2));
		System.out.println("same");
		String[]arr=str.split(" ");
		for (String s:arr) {
			System.out.println(s);
		}
		
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

}
