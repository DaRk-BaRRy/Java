package __Network;
import java.io.*;
import java.net.*;
import java.util.*;

public class __client extends Thread
{
Socket socket = new Socket();
InputStream is;
OutputStream os;
ObjectInputStream InS;
ObjectOutputStream OutS;
Scanner scan = new Scanner(System.in);

String IP;
int port;
__client(String name, int port)
{
	IP = name;
	this.port = port;
	try {
		socket = new Socket(name, port);
		os = socket.getOutputStream();
		is = socket.getInputStream();
		OutS = new ObjectOutputStream(os);
		InS = new ObjectInputStream(is);
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
String name;
@Override
public void run()
{
	while(true)
	{
		System.out.printf("Send message : ");
		send(scan.nextLine());
		System.out.println(recive());
		
	}
}

public void send(String message)
{
	try {
		OutS.writeObject(String.format("%s : %s", "a", message));
		OutS.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public String recive()
{
	try {
		return (String) InS.readObject();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	};
	return "ERROR! failed to recv";
}
}