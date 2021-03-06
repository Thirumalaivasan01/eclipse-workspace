package com.te.jaxb;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.jaxb.dto.Student;

/**
 * Hello world!
 *
 */
public class App3 {
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		File reader = new File("src/main/java/xml-code.xml");

		Object unmarshal = unmarshaller.unmarshal(reader);
		Student student = (Student) unmarshal;
		System.out.println("Unmarshalled Object: " + student);

	}
}
