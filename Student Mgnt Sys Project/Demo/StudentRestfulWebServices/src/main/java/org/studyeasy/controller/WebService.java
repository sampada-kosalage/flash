package org.studyeasy.controller;

import java.awt.PageAttributes.MediaType;
import java.text.Normalizer.Form;
import java.util.List;

import javax.swing.text.html.parser.Entity;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;

import com.mysql.cj.xdevapi.Client;

public class WebService {

	 private javax.ws.rs.client.Client client;
	   private String REST_SERVICE_URL = "http://localhost:8080/StudentRestfulWebServices/rest/StudentService/Student";
	   private static final String SUCCESS_RESULT="<result>success</result>";
	   private static final String PASS = "Success123!";
	   private static final String username = "root";
	   
	   private void init(){
		      this.client = ClientBuilder.newClient();
		   }
	   public static void main(String[] args){
		      WebService tester = new WebService();
		      tester.init();
		      tester.GetAllStudent();
		      tester.GetStudent();
		      tester.UpdateStudent();
		      tester.AddStudent();
		      tester.DeleteStudent();
		   }
	   
	   private void GetAllStudent(){
		      GenericType<List<Student>> list = new GenericType<List<Student>>() {};
		      List<Student> student = client
		         .target(REST_SERVICE_URL)
		         .request(MediaType.APPLICATION_XML)
		         .get(list);
		      String result = PASS;
		      if(student.isEmpty()){
		         result = FAIL;
		      }
		      System.out.println("Test case: GetAllStudent, Result: " + result );
		   }
	   private void GetStudent(){
		      Student sampleUser = new Student();
		      sampleStudent.setbirth_date(24-06-1994);

		      Student user = client
		         .target(REST_SERVICE_URL)
		         .path("/{studentbirth_date}")
		         .resolveTemplate("studentbirth_date", 24-06-1994)
		         .request(MediaType.APPLICATION_XML)
		         .get(Student.class);
		      String result = FAIL;
		      if(sampleUser != null && sampleUser.getBirth_date() == student.getBirth_date()){
		         result = PASS;
		      }
		      System.out.println("Test case: GetStudent, Result: " + result );
		   }
	   private void UpdateStudent(){
		      Form form = new Form();
		      form.param("birth_date", "24-06-1994");
		      form.param("displayNanem,", "Samp");
		      form.param("email", "samp@gmail.com");
		      form.param("firstNmae", "Sa");
		      form.param("gender", "Male");
		      form.param("lastName", "Ko");
		      form.param("location", "Delhi");


		      String callResult = client
		         .target(REST_SERVICE_URL)
		         .request(MediaType.APPLICATION_XML)
		         .put(Entity.entity(form,
		            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
		            String.class);
		      String result = PASS;
		      if(!SUCCESS_RESULT.equals(callResult)){
		         result = FAIL;
		      }

		      System.out.println("Test case: UpdateStudent, Result: " + result );
		   }
	   private void AddStudent(){
		      Form form = new Form();
		      form.param("birth_date", 25);
		      form.param("displayNanem,", "Samp");
		      form.param("email", "samp@gmail.com");
		      form.param("firstNmae", "Sa");
		      form.param("gender", "Male");
		      form.param("lastName", "Ko");
		      form.param("location", "Delhi");
		      String callResult = client
		         .target(REST_SERVICE_URL)
		         .request(MediaType.APPLICATION_XML)
		         .post(Entity.entity(form,
		            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
		            String.class);
		   
		      String result = PASS;
		      if(!SUCCESS_RESULT.equals(callResult)){
		         result = FAIL;
		      }

		      System.out.println("Test case: AddStudent, Result: " + result);
		   }
	   private void DeleteStudent(){
		      String callResult = client
		         .target(REST_SERVICE_URL)
		         .path("/{studentbirth_date}")
		         .resolveTemplate("studentbirth_date", 2)
		         .request(MediaType.APPLICATION_XML)
		         .delete(String.class);

		      String result = PASS;
		      if(!SUCCESS_RESULT.equals(callResult)){
		         result = FAIL;
		      }

		      System.out.println("Test case: DeleteStudent, Result: " + result );
		   }
}
