package L;

public class R2 extends Phone
{
	R2(int n1, int n2, int n3, int n4) 
	{
		super(n1, n2, n3, n4);
		super.n4 = 1972;
	}
	
	@Override
	public void get()
	{
		//super.get();
		System.out.printf("WA SANS!! : %d %d %d NTLM\n", n2,n3,n4);
		
	}
	
	
}
