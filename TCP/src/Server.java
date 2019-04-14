import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1234);
		System.out.println("Server is up");
		while(true) {
		
			Socket soc = ss.accept();
		
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			
			
			Thread ch = new ClientHandler(soc, dis, dos);
			
			ch.start();
//			soc.close();
			
		}
		
		
	}

}

