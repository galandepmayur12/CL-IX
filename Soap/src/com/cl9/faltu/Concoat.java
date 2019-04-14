package com.cl9.faltu;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Concoat {
	@WebMethod
	public String concat(String str1, String str2) {
		return str1 + str2;
	}
}
