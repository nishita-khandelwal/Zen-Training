package com.zensar.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class fileDownloadService {
	private static final String FILE_PATH="D:/NISHITA/hello.txt";
	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getFile() {
		File file= new File(FILE_PATH);
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment;filename=hello_file.txt");
		return responseBuilder.build();
	}
	
	@GET
	@Path("/image")
	@Produces("image/jpg")
	public Response getImage() {
		File file= new File("d:/NISHITA/download.jpg");
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment;filename=download.jpg");
		return responseBuilder.build();
		
	}

}
