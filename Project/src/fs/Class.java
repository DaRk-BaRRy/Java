package fs;
import java.io.*;
import java.util.*;

public class Class {
	public void main(String[] args) 
	{
		Find("C:/");
		
	}
	
	File file;
	FileInputStream fs;
	FileOutputStream fo;
	public void Find(String path) 
	{
		file = new File(path);
		for(String name : file.list())
		{
			System.out.printf("File : %d\n", name);
		}
	}
		public void read(String path) {
			// FileInputStream : 파일(File)에 있는 데이터를 내 프로그램으로(Stream) 가져온다(Input)
			FileInputStream fis = null;		// null을 넣는 이유는 try-catch 때문
			
			try {
				// 파일에 있는 데이터를 읽어 (1바이트 단위로)
				fis = new FileInputStream(path);
				// utf-8 로 변환
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String str = null;
				while((str = br.readLine()) != null) {		// 한줄을 읽어 str에 저장하고 null인지 비교
					System.out.println(str);			// 읽어왔다면 출력
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("파일 읽기 실패..");
			} catch(Exception e){
				System.out.println("변환 실패");
			} finally {
				try {fis.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
	public void create(String path, String name)
	{
		file = new File(String.format("%s%s.txt", path, name));
		if(file.exists())
			return;
		try
		{
			file.createNewFile();
			System.out.println("Created ! !");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void write(String path)
	{
		System.out.printf("type something to write : ");
		var scan = new Scanner(System.in);
		String v = scan.next();
		try
		{
			fo = new FileOutputStream(path);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			byte[] B = v.getBytes();
			fo.write(B);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}

	