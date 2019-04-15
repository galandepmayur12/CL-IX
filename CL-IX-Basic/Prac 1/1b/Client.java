import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AddI add = (AddI) Naming.lookup("ADD");
		
		System.out.println("The addition of two numbers is:" + add.add(2, 3));
	}

}
