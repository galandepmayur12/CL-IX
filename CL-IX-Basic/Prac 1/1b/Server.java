import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server extends AddC {

	protected Server() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		AddC add = new AddC(); 
		Naming.rebind("ADD", add);
		System.out.println("Server Up and running");
	}

}
