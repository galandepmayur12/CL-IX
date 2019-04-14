import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {
	private Socket soc;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	public ClientHandler(Socket soc, DataInputStream dis, DataOutputStream dos) {
		super();
		this.soc = soc;
		this.dis = dis;
		this.dos = dos;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		String str = null;
		
		try {
			System.out.println("Client " + this.soc.toString() + " says: " +  this.dis.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.dos.writeUTF("Yes ik ur client " + this.soc.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			str = this.dis.readUTF();
			System.out.println("Client " + this.soc.toString() + " says: " +  str);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			this.dos.writeUTF(operation(str));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			soc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String operation(String str) {
		// TODO Auto-generated method stub
		// a,b
		
		String arr[] = str.split(",");
		int result = 1;
		for (String string : arr) {
//			System.out.println(string + "int " + Integer.parseInt(string));
			result *= Integer.parseInt(string);
		}
		
		return result + "";
	}
	
	
}
