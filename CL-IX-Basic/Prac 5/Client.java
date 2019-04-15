import org.mayur.prac.CalculatorService;
import org.mayur.prac.CalculatorServiceService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorServiceService cs = new CalculatorServiceService();
		CalculatorService sei = cs.getCalculatorServicePort();
		System.out.println(sei.addService(4, 3));
	}

}
