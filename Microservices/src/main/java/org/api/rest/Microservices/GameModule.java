package org.api.rest.Microservices;

import java.util.ArrayList;
import java.util.List;

public class GameModule {
	ArrayList<Game> games = new ArrayList<>();
	
	public GameModule() {
		// TODO Auto-generated constructor stub
		
		this.games.add(new Game("g1"));
		this.games.add(new Game("g2"));
		this.games.add(new Game("g3"));
		
	}
	
	public String getWins(String gameName) {
		for (Game game : games) {
			if (game.getName().equals(gameName)) {
				return "" + game.getWin(); 
			}
		}
		return gameName;
	}
	
	public String getLoss(String gameName) {
		for (Game game : games) {
			if (game.getName().equals(gameName)) {
				return "" + game.getLoss(); 
			}
		}
		return gameName;
	}
	
	public void setWin(String gameName) {
		for (Game game : games) {
			if (game.getName().equals(gameName)) {
				game.setWin(game.getWin() + 1); 
			}
		}
//		return gameName;
	}
	
	public void setLoss(String gameName) {
		for (Game game : games) {
			if (game.getName().equals(gameName)) {
				game.setLoss(game.getLoss() + 1); 
			}
		}
//		return gameName;
	}
	
	

}
