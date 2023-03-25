package P2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class3 {
public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String command;

    while (true) {
        try {
            System.out.print("> ");
            command = reader.readLine();
            if (command.equals("exit")) {
                break;
            }
            //System.out.println("Command entered: " + command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}}
