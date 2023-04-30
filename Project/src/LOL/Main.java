package LOL;
import java.util.*;

public class Main {
public static void main(String[] args) {
	var scan = new Scanner(System.in);
	var S = new Storage();
	while(true)
	{
		System.out.printf("Enter your NAME : ");
		String dummy = scan.next();
		if(dummy == "1")
		{
			S.pf();
		}
		else
		{
			S.add(dummy);
		}
	}
}
}


class Storage
{
	private static int n = 0;
	private HashSet<String> hash = new HashSet<>();
	void add(String Name)
	{
		hash.add(Name);
	}
	void pf()
	{
		Iterator<String> It = hash.iterator();
		/*
		while(It.hasNext())
			System.out.println(It.next());
			*/
		for(String yee : hash)
		{
			System.out.println(yee);
		}
	}
	Storage()
	{
		n++;
		System.out.printf("GENERATED !! total class count : $d\n", n);
	}
}