package com.te.jackson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jackson.beans.Address;
import com.te.jackson.beans.Student;

/**
 * Hello world!
 *
 */
public class App3 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Address address = new Address();
		address.setaId(1);
		address.setaLine01("Line1");
		address.setaLine02("Line2");

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("English", 40);
		marks.put("maths", 80);
		marks.put("social", 70);

		Date date = new Date();
		date.setDate(2);
		date.setMonth(7);
		date.setYear(2001);

		Student student = new Student(1, "Name", 22, "fatherName", "motherName", 9876654320l, date, marks, address);

		ObjectMapper mapper = new ObjectMapper();
		FileWriter fileWriter = new FileWriter("json_code.json");
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(fileWriter, student);
	}
}
