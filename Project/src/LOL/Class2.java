package LOL;

import java.util.*;

public class Class2 {
public static void main(String[] args) {
	var r = new R();
	r.info();
	
	
}
}

class R
{
	private String v[] = new String[1972];
	private ArrayList<String> list = new ArrayList<>();
	
	R()
	{
		for(int i = 0; i < 10; i++)
		{
			list.add(i + "");
		}
	}
	void info()
	{
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}