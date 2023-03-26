package P2;
import java.util.Scanner;

public class Class2 {
public static void main(String[] args) {
	
	var scan = new Scanner(System.in);
	
	if (4>3)
	{
		System.out.println("wa sans! ! ! ! !");
	}
	else
	{
		System.out.println("what");
	}
	
	//idklol
	
	//source code
	
	
	// input
	
	
	String str = "와 샍";
	int num = 0;
	double d = 0.0;
	
	str = Integer.toString(num);
	num = Integer.parseInt(str);
	
	System.out.printf("input something : ");
	long some = scan.nextLong();
	System.out.println(some);
	for(int i = 0; i<some; i++)
	{
		System.out.printf("%s", "hummmmmmm ");
	}
	System.out.println();
	
	
	switch(1)
	{
	case 1:
		System.out.printf("WA SANS!! ");
	case 2:
		System.out.println("PAPYRUS!! ");
		switch(3)// 이중 su위치 해봐야지 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		{
		case 1:
			System.out.println("WA SANS! ! ! ! ! ! ! !");
			break;
		}
		break;
	default:
		System.out.println("idk");
		break;
	}
	
	// NUMBER GUESSING GAME
	
	int attemp = 0;
	int iValue = (int)(Math.random() * 9999);
	// System.out.println(iValue);
	while (true)
	{
		System.out.printf("enter correct password(4 int) to break this INF LOOP : ");
		int a = scan.nextInt();
		attemp++;
		if (a == iValue)
		{
			break;
		}
		System.out.printf("not correct lol\n%s\n", a < iValue ? "올라가":"내려가");
		
		continue;
	} //civBreak
	System.out.printf("what..? it was correct;; how you guessed?!! (attemps : %d)\n", attemp);//
	
	
	
}}