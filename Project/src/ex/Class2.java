package ex;
import java.util.Scanner;

public class Class2 {
public static void main(String[] args) {
	System.out.println("string"=="string"||"string"=="string");
	System.out.println(true && false);
	System.out.println(!true);
	System.out.println(4<=3);
	
	
	
	boolean a = true;
	a = !a;
	
	System.out.println(true ? 3:2);
	
	
	//code flow
	/*
	 * \>
	 * 
	 * CONTROL . . .
	 * 
	 * and label
	 * 
	 */
	
	if(true)
	{
		System.out.println(true);
		
	}
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.print("input num : ");
	System.out.printf("%s\n",scan.nextInt() >= 90 ? "우등생입니다":"우등생 아닙니다 ㅅㄱ");
	
	if(true)
	{
		
	}
	else
	{
		System.out.println("i gonna die :<");
	}

	//aI
	
}}
