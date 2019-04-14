import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket soc = new Socket("localhost", 1234);
		
		Scanner sc = new Scanner(System.in);
		
		DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
		DataInputStream dis = new DataInputStream(soc.getInputStream());
		
		dos.writeUTF("Hello this is client");
		System.out.println(dis.readUTF());
		
		
		System.out.print("You Say: ");
		dos.writeUTF(sc.nextLine());
		System.out.println("Result " + dis.readUTF());
		
		
		soc.close();

	}

}
