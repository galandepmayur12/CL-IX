package org.user.rest.REST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	List<User> list = new ArrayList<User>();
	public UserService() {
		User u1 = new User("kunal", Arrays.asList("Eat", "Sleep", "Code"));
		User u2 = new User("mayur", Arrays.asList("Eat2", "Sleep2", "Code2"));
		User u3 = new User("john", Arrays.asList("Eat1", "Sleep1", "Code1"));
		
		this.list.add(u1);
		this.list.add(u2);
		this.list.add(u3);
		// TODO Auto-generated constructor stub
	}

	public List<User> getAllUserData(){
		return this.list;
	}
	/*
	 * [
	 * {username: kunal, projectlist:[eat, sleep , code]}, {..}, {..}
	 * ]
	 */
	
	public List<String> getUsernames() {
		List <String> username = new ArrayList<String>();
		for (User user : this.list) {
			username.add(user.getUsername());
		}
		return username;
	}

	public User getUserdata(String username) {
		// TODO Auto-generated method stub
		for (User user : this.list) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

}