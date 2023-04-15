package P2;
import java.util.*;

public class NewClass {
public static void main(String[] args) {
	var scan = new Scanner(System.in);
	try
	{
	
		System.out.println(0/0);
		
	}
	catch(Exception YEEEEEEE)
	{
		System.out.println(YEEEEEEE);
	}
	finally
	{
		System.out.println("error");
		
	}
	
	System.out.println("hello".contains("h"));
	System.out.println("wa".equals("sans"));
	System.out.println("hello sans".replace("sans", "frisk"));
	System.out.println("wa sans".length());
	System.out.println("index".indexOf("d"));
	System.out.println("wa sans".charAt(5));
	System.out.println("hello. idklol it cant be shown".substring(0, 7));
	//https://beta.octosniff.net/auth?security=8301db16
	
	/**/
	
}
}	

class a
{
	 String op1 = "name=001price=19720type=0"; // YEE	
	String name;
	int price;
	
	public  String info(String a)
	{
		//
			
		name = a.substring(0,a.indexOf("name="));
		name = name.substring(a.indexOf("price="), name.length());
		
		
		
		
		return "";
	}

}




	