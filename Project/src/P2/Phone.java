package P2;

public interface Phone
{
	@Override
	public void call()
	{
		System.out.println("call");
	}
	@Override
	public void msg()
	{
		System.out.println("msg");
	}
	@Override
	public void internet()
	{
		System.out.println("internet");
	}
}

public class Phone implements Phone
{
	
}

public class Phone2 implements Phone
{
	
}