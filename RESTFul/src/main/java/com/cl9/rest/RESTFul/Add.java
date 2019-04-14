package com.cl9.rest.RESTFul;





import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


// "/String/ksadhkjah?method=dkas;d"
@Path("String")
public class Add {
	
	@Path("/{String}")
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String name(@PathParam("String") String str, @QueryParam("method") String method) {
		if(method.equals("concat"))
			return str + " Hello";
		else 
			return str;
	}

}
