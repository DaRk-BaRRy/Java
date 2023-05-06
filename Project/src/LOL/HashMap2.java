package LOL;
import java.util.*;

public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	
	hm.put(1, "1");
	System.out.println(hm.get(1));
	Set<Integer> set = hm.keySet();
	for(int yee : set)
	{
		System.out.println(yee);
		System.out.println(hm.get(yee));
	}
	
	var scan = new Scanner(System.in);
	var D = new Dic();
	String w1 = "", w2 = "", t = "";

	hm.put(1, "SCARA");
	// hm.remove();
	// hm.containsValue()
	
	
	
}
}


class Dic
{
	private Map<String, String> map;
}