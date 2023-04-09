package L;

public class R4 extends Phone implements R3
{
	
	R4(int n1, int n2, int n3, int n4) {
		super(n1, n2, n3, n4);
	}

	final static String str = "ReD";
	static String s2 = "F, S skip";
	
	@Override
	public void T1() 
	{
		System.out.println("ReDefine");
	}

	@Override
	public void T2() 
	{
		System.out.println("ReDefine_2");
	}
	
	public static void main(String[] args) {
		System.out.println(s2); /// STATIC!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
}

//EXTEND :: ONLY ONE
//IMPLEMENTS :: INF