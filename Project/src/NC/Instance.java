package NC;

public class Instance {
	private Instance() {}
	private static Instance instance;
	
	public static Instance getinstance()
	{
		if(instance == null)
			instance = new Instance();
		return instance;
	}
	
	public void print()
	{
		System.out.println("singoleton pattern class");
	}
	public int v = 0;
}	