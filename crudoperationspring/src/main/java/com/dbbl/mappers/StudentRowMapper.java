package com.dbbl.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dbbl.Beans.Student;

public class StudentRowMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	Student std = new Student();
	std.setRoll(rs.getInt("std_roll"));
	std.setName(rs.getString("std_name"));
	std.setId(rs.getInt("std_id"));
	
		return std;
	}

}
