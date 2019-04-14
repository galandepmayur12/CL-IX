import java.rmi.Naming;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Concat concat = (Concat) Naming.lookup("ccat");
		
		System.out.println(concat.concat("Hello", " World"));

	}

}
