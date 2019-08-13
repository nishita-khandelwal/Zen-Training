package com.zensar.services;
 
 
import java.time.LocalDate;
import java.util.Date;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/zenparam")
public class HelloParam {
 
	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
	public  Response getMessage(@PathParam("nm") String name){
		return Response
		.status(200)
		.entity("<p> Hello <b><i>" +  name  +"</i></b> Welcome to Zensar </p>")
		.build();
	}
 
	@Path("/welcomebirth/{d}/{m}/{y}")
	@GET
	@Produces("text/html")
	public Response getBirthDay(@PathParam("d")int day,@PathParam("m") int month,@PathParam("y")int year)
	{
		return Response
				.status(200)
				.entity("<p> BirthDate is <b><i>" + day +"/"+ month+"/" + year+"<i><b>Happy Birthday</P>" )
				.build();
	}
 
	@Path("/welcomebirthdate/{d}/{m}/{y}")
	@GET
	@Produces("text/html")
	public Response getBirthDate(@PathParam("d")int day,@PathParam("m") int month,@PathParam("y")int year)
	{
 
 
	  LocalDate date=LocalDate.of(year, month, day);
		return Response
				.status(200)
				.entity("Happy Birthday " +date.toString())
				.build(); 
	}
 
 
 
 
 
 
 
}