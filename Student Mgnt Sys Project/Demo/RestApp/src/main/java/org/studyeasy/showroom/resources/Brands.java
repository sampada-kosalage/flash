package org.studyeasy.showroom.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {

	@GET
	@Path("/getBrands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands"; 
	}
	@GET
	@POST
	//@Path("/getBrands")
	@Path("/getBrands")
    @Produces(MediaType.TEXT_PLAIN)
	//public String setBrands() {
	 public String postBrands() {
         //return "Add a new brands"; 
         return "post the list of brands"; 
         }
	@GET
	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands() {
		return "Post the list of brands"; 
	}
	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands() {
		return "Add a new brand"; 
	}
}
