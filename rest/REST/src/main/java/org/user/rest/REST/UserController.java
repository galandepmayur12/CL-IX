package org.user.rest.REST;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Users")
public class UserController {
	
	UserService us = new UserService();
	
	@Path("/data")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<User> getData(){
		return us.getAllUserData();
	}
	
	
	@Path("/userList")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String getUsers1() {
	
		return us.getUsernames().toString();
	}
	
	@Path("/{user}") 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserProject(@PathParam("user") String username) {
		return us.getUserdata(username);
	}
	


}
