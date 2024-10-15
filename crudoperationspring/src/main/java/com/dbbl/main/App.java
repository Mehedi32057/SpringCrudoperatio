package com.dbbl.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dbbl.Beans.Student;
import com.dbbl.mappers.StudentRowMapper;
import com.dbbl.resources.springconfigurationfile;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")

		ApplicationContext context = new AnnotationConfigApplicationContext(springconfigurationfile.class);

		JdbcTemplate myjdbcJdbcTemplate = context.getBean(JdbcTemplate.class);

		// insert operation------------------------------------------
//
//		int roll = 109;
//		String name = "Mohit";
//		int id = 111;
//
// String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//
//		int count = myjdbcJdbcTemplate.update(insert_sql_query, roll, name, id);
//		if (count > 0) {
//			System.out.println("Inserting succesful");
//
//		} else {
//
//			System.out.println("Insert unsuccessful");
//
//		}
//
//		String name ="Bnis";
//		int id = 103;
//
//		String update_sql_query = "UPDATE student SET std_name=? WHERE std_id=?";
//		int count = myjdbcJdbcTemplate.update(update_sql_query, name, id);
//		if (count > 0) {
//			System.out.println("Update succesfull");
//
//		} else {
//			System.out.println("update unsuccessfull");
//		}

//		int roll = 102;
//		String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//		int count = myjdbcJdbcTemplate.update(delete_sql_query, roll);
//		if (count > 0) {
//			System.out.println("deletation is success");
//
//		} else {
//			System.out.println("Deletation is not successful");
//		}
		
		//--------------------select option------------------
//	
//	String select_sql_query ="SELECT * FROM student";
//List<Student> std_list=	myjdbcJdbcTemplate.query(select_sql_query, new StudentRowMapper());
//	for(Student std :std_list) {
//		System.out.println("Rollno : "+std.getRoll());
//		System.out.println("Name : "+std.getName());
//	    System.out.println("Id : "+ std.getId());
//		System.out.println("================");
//	}
     //----------------select operation 2-----------------
//      int  roll=102;
//		String select_sql_query ="SELECT * FROM student WHERE std_roll=?";
//	List<Student> std_list=	myjdbcJdbcTemplate.query(select_sql_query, new StudentRowMapper(),roll);
//		for(Student std :std_list) {
//			System.out.println("Rollno : "+std.getRoll());
//			System.out.println("Name : "+std.getName());
//		    System.out.println("Id : "+ std.getId());
//			System.out.println("================");
//		}
//	
		//----------------select operation 3--------------------------
	
		 int  roll=102;
			String select_sql_query ="SELECT * FROM student WHERE std_roll=?";
		Student std=	myjdbcJdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),roll);
			
				System.out.println("Rollno : "+std.getRoll());
				System.out.println("Name : "+std.getName());
			    System.out.println("Id : "+ std.getId());
				System.out.println("================");
	
	
	
}}