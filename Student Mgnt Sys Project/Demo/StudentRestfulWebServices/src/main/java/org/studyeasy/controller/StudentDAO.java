package org.studyeasy.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public static List<Student> getAllStudent(){
	 List<Student> studentList = null;
	try {
		File file = new File("Student.dat");
		if(!file.exists()) {
			Student student = new Student(24,"Sampada","sampada.padgilwar@gmail.com","Sam","Female","Kosalage","Pune");
			studentList = new ArrayList<Student>();
			studentList.add(student);
			saveStudentList(studentList);
		}
		else {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			studentList = (List<Student>) ois.readObject();
			ois.close();
		}
	}catch(IOException e) {
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return studentList;
	}
	
	public static Student getStudent(int birth_date) {
		List<Student> students = getAllStudent();
		
		for(Student student: students) {
			if(student.getBirth_date() == birth_date) {
				return student;
			}
		}
		return null;
	}
	public int addStudent(Student pStudent) {
		List<Student> userList = getAllStudent();
	      boolean userExists = false;
	      for(Student user: studentList){
	         if(user.getBirth_date() == pStudent.getBirth_date()){
	            userExists = true;
	            break;
	         }
	      }		
	      if(!userExists){
	         userList.add(pStudent);
	         saveStudentList(userList);
	         return 1;
	      }
	      return 0;
	}
	 public int updateStudent(Student pUser){
	      List<Student> userList = getAllStudent();

	      for(Student user: studentList){
	        if(Student.getBirth_date() == pStudent.getBirth_date()){
					    int index = userList.indexOf(user);			
					    userList.set(index, getStudent(0));
					    saveStudentList(studentList);
					    return 1;
					}
			    }		
	      return 0;
	   }
	 public static  int deleteStudent(int dirth_date){
	      List<Student> userList = getAllStudent();

	      for(Student student: studentList){
	         if(student.getBirth_date() == dirth_date){
	            int index = userList.indexOf(student);			
	            userList.remove(index);
	            saveStudentList(userList);
	            return 1;   
	         }
	      }		
	      return 0;
	   }
	
	private static void saveStudentList(List<Student> studentList) {
		try {
			File file = new File("Student.dat");
			FileOutputStream fos;
			fos = FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studentList);
			oos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static FileOutputStream FileOutputStream(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}
