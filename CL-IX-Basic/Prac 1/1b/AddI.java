import java.rmi.Remote;

public interface AddI extends Remote {
	public int add(int a, int b) throws Exception;
}
