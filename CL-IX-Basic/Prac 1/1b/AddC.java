import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected AddC() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	

}
