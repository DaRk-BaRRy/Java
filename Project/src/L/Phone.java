package L;

public class Phone
{
	Phone(int n1,int n2,int n3,int n4)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
	private int n1;
	int n2;
	protected int n3;
	public int n4;
	
	public void set(int n1,int n2,int n3,int n4)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		
	}
	
	public void get()
	{
		System.out.printf("%d %d %d %d\n", n1, n2 ,n3, n4);
	}
	
	public static void main(String[] args) {
		
	}
}