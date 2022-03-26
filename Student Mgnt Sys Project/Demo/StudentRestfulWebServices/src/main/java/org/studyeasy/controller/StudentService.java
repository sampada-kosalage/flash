package org.studyeasy.controller;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

public class StudentService {

	StudentDAO studentDAO= new StudentDAO();
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudent(){
		return studentDAO.getAllStudent();
	}
	   @GET
	   @Path("/student/{studentBirth_date}")
	   @Produces(MediaType.APPLICATION_XML)
	   public Student getStudent(@PathParam("studentBirth_date") int studentBirth_date){
	      return StudentDAO.getStudent(studentBirth_date);
	   }
	   @POST
	   @Path("/Student")
	   @Produces(MediaType.APPLICATION_XML)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String createUser(@FormParam("birth_date") int birth_date,
	      @FormParam("displayName") String displayName,
	      @FormParam("email") String email,
	      @FormParam("firstName") String firstName,
	      @FormParam("gender") String gender,
	      @FormParam("lastName") String lastName,
	      @FormParam("location") String location,

	      @Context HttpServletResponse servletResponse) throws IOException{
	      Student student = new Student(birth_date, displayName, email,firstName,gender,lastName,location);
	      int result = studentDAO.addStudent(student);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }
	   @PUT
	   @Path("/student")
	   @Produces(MediaType.APPLICATION_XML)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String updateStudent(@FormParam("birth_date") int birth_date,
			      @FormParam("displayName") String displayName,
			      @FormParam("email") String email,
			      @FormParam("firstName") String firstName,
			      @FormParam("gender") String gender,
			      @FormParam("lastName") String lastName,
			      @FormParam("location") String location,

			      @Context HttpServletResponse servletResponse) throws IOException{
			      Student student = new Student(birth_date, displayName, email,firstName,gender,lastName,location);
			      int result = studentDAO.addStudent(student);
			      if(result == 1){
			         return SUCCESS_RESULT;
			      }
			      return FAILURE_RESULT;
			   }
	   @DELETE
	   @Path("/student/{studentBirth_date}")
	   @Produces(MediaType.APPLICATION_XML)
	   public String deleteStudent(@PathParam("studentdirth_date") int studentdirth_date){
	      int result = StudentDAO.deleteStudent(studentdirth_date);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }
	   @OPTIONS
	   @Path("/student")
	   @Produces(MediaType.APPLICATION_XML)
	   public String getSupportedOperations(){
	      return "<operations>GET, PUT, POST, DELETE</operations>";
	   }
	}

	

