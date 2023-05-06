package Thread__;

public class __Main__ {
public static void main(String[] args) throws InterruptedException {
	var t1 = new Threading__();
	t1.start();
	t1.join();
	var T1 = new T1__();
	var T2 = new T2__();
	T1.start();
	T2.start();
	//synapse has been died! << 
	
}
}


class Threading__ extends Thread
{
	public void run()
	{
		synchronized (this) {
			
			
			while(true)
			{
				System.out.println("A");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
}