import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket sv = new ServerSocket(3375);
		System.out.println("Server up and running");
        Socket ss = sv.accept();
        DataInputStream is =null;
        Scanner scanner = new Scanner(System.in);
        String client = new String();
        DataOutputStream os = null;
        os = new DataOutputStream(ss.getOutputStream());
        is =new DataInputStream(ss.getInputStream());
        while(!client.equals("bye"))
        {
        
        
        client = is.readUTF();
        System.out.println("Client says : "+client);
        
        
        System.out.println("You say : " + calc(client));

        os.writeUTF("Result is:" + calc(client));
        
        os.flush();
        

        }
        
        os.close();
    
        ss.close();
        sv.close();

    }
    public static int calc(String exp){
		
    	int result = 0;
    	
    	String [] variables = exp.split(" ");
    	for( int i = 0; i < variables.length; i++){
//    		System.out.println("char at " + Integer.parseInt(variables[i-1]));
    		if(i != 0){
    			
    			if (variables[i].equals("+")) {
    				result += Integer.parseInt(variables[i-1]);
    				result += Integer.parseInt(variables[i+1]);
				} else if (variables[i].equals("-")) {
					result = Integer.parseInt(variables[i-1]) - Integer.parseInt(variables[i+1]);
				} else if (variables[i].equals("*")) { 
					result = Integer.parseInt(variables[i-1]) * Integer.parseInt(variables[i+1]);
				} else if (variables[i].equals("/")) {
					result = Integer.parseInt(variables[i-1]) / Integer.parseInt(variables[i+1]);
				} else {
					
				}
    		
//	    		switch(variables[i].charAt(0)){
//	    			case '+' : result += Integer.getInteger(variables[i-1]).intValue();
//	    				break;
//	    			case '-' : result -= Integer.getInteger(variables[i-1]);
//						break;
//	    			case '*' : result *= Integer.getInteger(variables[i-1]);
//						break;
//	    			case '/' : result /= Integer.getInteger(variables[i-1]);
//						break;
//					default:
//						break;
//	    		}
    		}
    	}
    	
    	
    	return result;
    	
    }


}
