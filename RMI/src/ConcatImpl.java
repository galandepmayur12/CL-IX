import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


@SuppressWarnings("serial")
public class ConcatImpl extends UnicastRemoteObject implements Concat {

	protected ConcatImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String concat(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1 + str2;
	}

}
