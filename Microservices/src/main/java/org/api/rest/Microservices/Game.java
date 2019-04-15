package org.api.rest.Microservices;

public class Game {
	int win;
	int loss;
	String name;
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Game(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.loss = 0;
		this.win = 0;
	}

}
