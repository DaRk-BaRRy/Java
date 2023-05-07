package __Network;
import java.io.*;
import java.net.*;
import java.util.*;
import NC.Instance;

public class __server extends Thread
{	
	String ip;
	int port = 8080;
	//접속용, 통신용 소켓
	ServerSocket server_socket; //접속용
	Socket socket; //통신용
	
	Map<String, ClientHandler> clients = new HashMap<>();
	private __server() 
	{
		try {
			server_socket = new ServerSocket(port); //open
			System.out.println("server opened");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void run()
	{
		while(true)
		{
			try {
				server_socket.accept();
				String IP_ = socket.getInetAddress().toString();
				System.out.printf("%s connected !\n", IP_);
				var client = new ClientHandler(socket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	//singleinstance
	private static __server instance;
	public static __server getinstance()
	{
		if(instance == null)
			instance = new __server();
		return instance;
	}
}

class ClientHandler extends Thread
{
	Socket socket;
	String client_IP = socket.getInetAddress().toString();
	ClientHandler(Socket socket)
	{
		this.socket = socket;
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			InS = new ObjectInputStream(is);
			OutS = new ObjectOutputStream(os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run()
	{
		while(true)
		{
			
			try {
				String m = String.format("%s : %s", client_IP, InS.readObject());
				OutS.writeObject(m);
			} catch (IOException e) {
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	InputStream is;
	OutputStream os;
	ObjectInputStream InS;
	ObjectOutputStream OutS;
}
