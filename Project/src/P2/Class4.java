package P2;

public class Class4 {
public static void main(String[] args) {
	//function . . . 
	
	
	System.out.println();
	a(45);
	
	NC nc = new NC();
	nc.method();
	System.out.println(nc.maw);
	nc.call("SCarane");
	
	
	//human
	
	Humanoid MEE6 = new Humanoid("MEE6");
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.grow();
	MEE6.info();
}




static void a(int stream)
{
	System.out.println(stream);
	
	
}



}

class NC
{
	int maw = 5;
	void method()
	{
		System.out.println("MOTHod");
		return;
	}
	
	void call(String name)
	{
		System.out.printf("hey %s!\n", name);
	}
}










class Humanoid
{
	Humanoid(String name)
	{
		this.name = name;
	}
	void grow()
	{
		age++;
		if (age < 20)
		{
			height =+ (age / 20) * 10;
		}
		// the skip
	}
	void chat(String a)
	{
		System.out.printf("%s : %s\n", name, a);
	}
	void eat()
	{
		hunger += 0.3;
		if(hunger > 1.0)
		{
			hunger = 1.0;
		}
	}
	void info()
	{
		System.out.printf("---------------------------\nName : %s\nAge : %d\nHeight(cm) : %d\nCurrent Hunger : %f\n---------------------------\n", name, age, height, hunger);
	}
	
	private double hunger = 1;
	private int age = 0;
	private int height = 30;
	String name;
	
}