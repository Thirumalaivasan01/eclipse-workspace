package com.te.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jackson.beans.Student;

/**
 * Hello world!
 *
 */
public class App2 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		
		String jsonString="{\n" + 
				"  \"s_id\" : 1,\n" + 
				"  \"s_name\" : \"Name\",\n" + 
				"  \"s_age\" : 22,\n" + 
				"  \"s_father_name\" : \"fatherName\",\n" + 
				"  \"s_mother_name\" : \"motherName\",\n" + 
				"  \"s_phone_number\" : 9876654320,\n" + 
				"  \"s_dob\" : \"02/08/3901\",\n" + 
				"  \"s_marks\" : {\n" + 
				"    \"English\" : 40,\n" + 
				"    \"social\" : 70,\n" + 
				"    \"maths\" : 80\n" + 
				"  },\n" + 
				"  \"s_address\" : {\n" + 
				"    \"aId\" : 1,\n" + 
				"    \"aLine01\" : \"Line1\",\n" + 
				"    \"aLine02\" : \"Line2\"\n" + 
				"  }\n" + 
				"}";
		
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.reader().readValue(jsonString, Student.class);
		System.out.println("Json data: " + student);
	}
}
