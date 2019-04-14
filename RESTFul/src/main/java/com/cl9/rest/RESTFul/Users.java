package com.cl9.rest.RESTFul;

import java.awt.PageAttributes.MediaType;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("Users")
public class Users {
	
	public HashMap<String, ArrayList<String>> userMemo;

	public Users() {
		super();
		this.userMemo= new HashMap<>();
		this.userMemo.put("Mayur", new ArrayList<String>(
			    Arrays.asList("Eat", "Sleep", "Code")));
		this.userMemo.put("Shivansh", new ArrayList<String>(
			    Arrays.asList("Eat", "Wake", "Code")));
		this.userMemo.put("Kunal", new ArrayList<String>(
			    Arrays.asList("Eat", "Sleep", "Eat")));

		
	}

	public HashMap<String, ArrayList<String>> getUserMemo() {
		return userMemo;
	}

	public void setUserMemo(HashMap<String, ArrayList<String>> userMemo) {
		this.userMemo = userMemo;
	}
	
	@GET
	@Path("/getList")
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getList() {
		Users userMemo = new Users();
//		userMemo = new HashMap<>();
//		userMemo.put("Mayur", new ArrayList<String>(
//			    Arrays.asList("Eat", "Sleep", "Code")));
//		userMemo.put("Shivansh", new ArrayList<String>(
//			    Arrays.asList("Eat", "Wake", "Code")));
//		userMemo.put("Kunal", new ArrayList<String>(
//			    Arrays.asList("Eat", "Sleep", "Eat")));
//		System.out.println(userMemo);
//		for (String user: this.userMemo) {
//			
//		}
		return this.userMemo.toString();
//		ArrayList<String> toDOLIST = new ArrayList<>(Arrays.asList("Eat", "Wake", "Code"));
//		ArrayList<String> toDOLIST1 = new ArrayList<>(Arrays.asList("Eat", "Sleep", "Eat"));
//		
//		return toDOLIST.toString();
	}

	@GET
	@Path("/{user}/list")
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getUserList(@PathParam("user") String user) {
		return this.userMemo.get(user).toString();
	}
	
	@GET
	@Path("/users")
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String allUsers() {
		return this.userMemo.keySet().toString();
	}
	
	

}
