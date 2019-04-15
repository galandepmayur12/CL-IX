package org.api.rest.Microservices;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("games")
@Singleton
public class Controller {
	GameModule gameModule = new GameModule();
	
	@Path("/getWin/{g1}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getWin(@PathParam("g1") String gameName) {
		return gameModule.getWins(gameName);
	}
	
	@Path("/getLoss/{g1}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getLoss(@PathParam("g1") String gameName) {
		return gameModule.getLoss(gameName);
	}
	
	@Path("/setLoss/{g1}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setLoss(@PathParam("g1") String gameName) {
		gameModule.setLoss(gameName);
		return "Loss set for " + gameName;
	}
	
	@Path("/setWin/{g1}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setWin(@PathParam("g1") String gameName) {
		gameModule.setWin(gameName);
		return "Win set for " + gameName;
	}
	
	
	

}
