package org.user.rest.REST;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class User{
	
	@Override
	public String toString() {
		return "User [username=" + username + ", projectList=" + projectList + "]";
	}

	public String username;
	public ArrayList<String> projectList;
	
	public User(String  username, List<String> list) {
		this.username = username;
		this.projectList = new ArrayList<>(list);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<String> getProjectList() {
		return projectList;
	}

	public void setProjectList(ArrayList<String> projectList) {
		this.projectList = projectList;
	}
	
	

}
