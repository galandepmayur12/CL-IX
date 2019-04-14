import java.rmi.Remote;

public interface Concat extends Remote{
	public String concat(String str1, String str2) throws Exception;

}
