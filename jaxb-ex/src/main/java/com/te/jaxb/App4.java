package com.te.jaxb;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.jaxb.dto.Address;
import com.te.jaxb.dto.CollegeStudent;
import com.te.jaxb.dto.Student;

/**
 * Hello world!
 *
 */
public class App4 {
	public static void main(String[] args) throws JAXBException {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Maths", 40);
		marks.put("English", 35);
		marks.put("Science", 80);
		marks.put("Social Science", 70);

		Address address = new Address();
		address.setaId(1);
		address.setaLine01("Line1");
		address.setaLine02("Line2");

		CollegeStudent student = new CollegeStudent();
		student.setsAge(29);
		student.setsId(1);
		student.setsMarks(marks);
		student.setsName("Name01");
		student.setAddress(address);

		System.out.println("Java Object : \n" + student);

		JAXBContext jaxbContext = JAXBContext.newInstance(CollegeStudent.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter handler = new StringWriter();
		//File handler1 = new File("src/main/java/xml-code.xml");
		marshaller.marshal(student, handler);
		//marshaller.marshal(student, handler1);
		System.out.println("Xml Code: \n" + handler);

	}
}
