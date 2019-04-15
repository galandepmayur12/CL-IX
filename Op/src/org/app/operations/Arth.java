package org.app.operations;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Arth {
	@WebMethod
	public double operations(double op1, double op2, char ope) {
//		return 1.0 + 2.0;
		
		double result = 1;
		switch (ope) {
		case '+':
			result = 0;
			result = op1 + op2;
			
			break;
		case '-':
			result = 0;
			result = op1 - op2;		
			break;
		case '*':
			result = op1*op2;
			
			break;
		case '/':
			result = op1/op2;
			break;

		default:
			break;
		}
		return result;
	}
}
