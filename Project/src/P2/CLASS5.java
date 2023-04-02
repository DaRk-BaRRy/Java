package P2;

public class CLASS5 {
public static void main(String[] args) {
	AC ac = new AC();
	ac.m1();
	ac.m1();
	while(true)
	{
		ac.m1();
		AC.n++;
		if(AC.n > 90)
		{
			break;
		}
		
	}
	
	System.out.println(3^7);
	System.out.println(ac.m2());
	
	AC2 ac2 = new AC2();
	fu(ac2);
	
	
	
	
}

static void fu(AC2 ac)
{
	ac.v("idk");
	System.out.println(ac.v());
}



}




class AC
{
	AC()
	{
		//zira role manager is trash :<
		System.out.println("GENERATED  ! ! ! ! !");
	}
	
	static int n;
	void m1()
	{
		System.out.println("only for code recycle");
	}
	int m2()
	{
		return 45;
	}
}

class AC2
{
	private String w = "";
	String v()
	{
		//code here
		return w;
	}
	void v(String w)
	{
		this.w = w;
		//System.out.println(w);
		return;
	}
	
	//only for usage
	
	
	
}







