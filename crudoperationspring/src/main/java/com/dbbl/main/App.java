package com.dbbl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dbbl.resources.springconfigurationfile;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")

		ApplicationContext context = new AnnotationConfigApplicationContext(springconfigurationfile.class);

		JdbcTemplate myjdbcJdbcTemplate = context.getBean(JdbcTemplate.class);

		// insert operation------------------------------------------
//
		int roll = 109;
		String name = "Mohit";
		int id = 111;

 String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";

		int count = myjdbcJdbcTemplate.update(insert_sql_query, roll, name, id);
		if (count > 0) {
			System.out.println("Inserting succesful");

		} else {

			System.out.println("Insert unsuccessful");

		}
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
	}
}