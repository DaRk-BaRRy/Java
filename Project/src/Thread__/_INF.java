package Thread__;

public class _INF extends Thread implements thr_
{
	@Override public void run()
	{
		System.out.println("omg");
	}
}


interface thr_
{
	void run();
}