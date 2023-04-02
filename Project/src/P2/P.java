package P2;

public class P {
public static void main(String[] args) {
	Human h = new Human("Azure", true, 19);
	HumanView.info(h);
	
	
	
	
}}

class Human
{
	Human(String name, boolean gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	String name;
	boolean gender;
	int age;
}

class HumanView
{
	static private Human h;
	static public void info(Human h_)
	{
		HumanView.h = h_;
		System.out.printf("Name : %s\nGender : %s\nAge : %d\n", h.name, h.gender ? "Male" : "Female", h.age);
	}
}