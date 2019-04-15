import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress inet = InetAddress.getLocalHost();
    	
    	DataOutputStream os = null;
        DataInputStream is = null;
        Socket soc = new Socket(inet.getHostName(),3375);
        Scanner sc =new Scanner(System.in);
        String server=new String();
        os = new DataOutputStream(soc.getOutputStream());
        is = new DataInputStream(soc.getInputStream());
        while(!server.equals("bye"))
        {
            
            System.out.print("You say  : ");

            os.writeUTF(sc.nextLine());
            os.flush();
            
           
            server = is.readUTF();
            System.out.println("Server says : "+ server);
           
        }
        
        soc.close();


	}

}
