package com.te.jaxb;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.jaxb.dto.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JAXBException {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Maths", 40);
		marks.put("English", 35);
		marks.put("Science", 80);
		marks.put("Social Science", 70);

		Student student = new Student();
		student.setsAge(29);
		student.setsId(1);
		student.setsMarks(marks);
		student.setsName("Name01");

		System.out.println("Java Object : \n" + student);

		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter handler = new StringWriter();
		File handler1 = new File("src/main/java/xml-code.xml");
		marshaller.marshal(student, handler);
		marshaller.marshal(student, handler1);
		System.out.println("Xml Code: \n" + handler);

	}
}
