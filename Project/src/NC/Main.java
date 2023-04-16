package NC;
import java.text.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
	var time = new Time();
	while(true)
	{
		System.out.println(time.dataTime());
		//Thread.sleep(1000);
	}
	
	
	
	
	//System.out.println("?");
}}


class Time
{
	private String v;
	
	public String dataTime()
	{
		return main("yyyy.MM.dd HH:mm:ss", 0);
	}
	
	public String dataTime(String format)
	{
		return main(format, 0);
	}
	
	public String add(int af)
	{
		return main("yyyy.MM.dd HH:mm:ss", af);
	}
	
	private String main(String format, int add)
	{
		var CAL = Calendar.getInstance();	
		if (add > 0)
		{
			CAL.add(Calendar.SECOND, add);	
		}
		var data = CAL.getTime();
		var sdf = new SimpleDateFormat(format);
		
		v = sdf.format(data);
		return v;
	}
}