package com.te.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jackson.beans.Student;

/**
 * Hello world!
 *
 */
public class App4 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		File file = new File("json_code.json");
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.reader().readValue(file, Student.class);
		System.out.println("Json data: " + student);
	}
}
