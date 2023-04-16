package NC;

public class get {
public static void main(String[] args) {
	var get = Instance.getinstance();
	get.print();
	get.v = 15;
	
	
	var get2 = Instance.getinstance();
	get2.print();
	System.out.println(get2.v);
}
}
	