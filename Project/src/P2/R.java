package P2;
import java.util.Scanner;

public class R {
public static void main(String[] args) {
	var scan = new Scanner(System.in);
	boolean perm = false;
	String cmd = "";
	while(true)
	{
		System.out.printf("%s ", perm ? "#>" : ">");
		cmd = scan.next();
		switch(cmd)
		{
		case "su":
			System.out.printf("[INPUT] enter password : ");
			if(scan.nextInt() != 154)
			{
				System.out.println("[ERROR] WRONG");
				break;
			}
			perm = true;
			System.out.println("[SUCC] permitted!");
			break;
			
		case "help":
			System.out.printf("[help]\n");
			break;
		
		default:
			System.out.println("[ERROR] invalid conmmand!");
			break;
		}
	}
	
	
	
}


}




class p
{
	p(String name, int age, boolean ifmale)
	{
		info(name, age, ifmale);
	}
	
	protected String name;
	private int age;
	private boolean ifmale;
	
	public void info(String name, int age, boolean ifmale)
	{
		this.name = name;
		this.age = age;
		this.ifmale = ifmale;
	}
	public void info()
	{
		System.out.printf("Name : %s\nAge : %d\nGender : %s\n", this.name, this.age, ifmale ? "male" : "female");
	}
}

class Member extends p
{
	public static void manage(Member m, String type, int v)
	{
		switch(type)
		{
		case "setMoney":
			m.money = v;
			System.out.printf("%s님의 돈이 %d로 설정되었습니다\n", m.name, v = 0);
			break;
		case "ban/unban":
			m.banned = !(m.banned);
			break;
		default:
			System.out.println("무언가를 입력하세요");
			break;
		}
	}
	
	private boolean banned = false;
	String[] list;
	Member(String name, int age, boolean ifmale)
	{
		super(name, age, ifmale);
		n++;
		ID = n;
	}
	private Member t;
	private final int ID;
	public void send(int money, Member target)
	{
		t = target;
		if(this.banned || t.banned)
		{
			System.out.println("본인 혹은 상대의 계좌가 정지된 상태입니다");
			return;
		}
		if(this.money < money)
		{
			System.out.println("돈이 부족합니다");
			return;
		}
		
		this.money -= money;
		t.money += money;
		
		list = new String[list.length+1];
		list[list.length] = String.format("%s ----(%d)----> %s", this.name, money, t.name);
		System.out.println(list[list.length]);
	}
	
	public void viewlist()
	{
		if(this.banned)
		{
			System.out.println("본인의 계좌가 정지된 상태입니다");
			return;
		}
		for (int i = 0; i <= list.length; i++)
		{
			System.out.println(list[i]);
		}
	}
	
	static int n;
	private int money = 0;
	public void info()
	{
		if(this.banned)
		{
			System.out.println("본인의 계좌가 정지된 상태입니다");
			return;
		}
		System.out.printf("Member number : %d\nBalance : %s\n", ID, this.money);
		super.info();
	}
}













