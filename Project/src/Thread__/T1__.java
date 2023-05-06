package Thread__;

public class T1__ extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("im thread 1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
