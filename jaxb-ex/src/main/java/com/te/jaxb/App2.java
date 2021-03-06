package com.te.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.jaxb.dto.Student;

/**
 * Hello world!
 *
 */
public class App2 {
	public static void main(String[] args) throws JAXBException {
		String xmlCode = "<student>\n" + "    <sAge>29</sAge>\n" + "    <sId>1</sId>\n" + "    <sMarks>\n"
				+ "        <entry>\n" + "            <key>Maths</key>\n" + "            <value>40</value>\n"
				+ "        </entry>\n" + "        <entry>\n" + "            <key>English</key>\n"
				+ "            <value>35</value>\n" + "        </entry>\n" + "        <entry>\n"
				+ "            <key>Science</key>\n" + "            <value>80</value>\n" + "        </entry>\n"
				+ "        <entry>\n" + "            <key>Social Science</key>\n" + "            <value>70</value>\n"
				+ "        </entry>\n" + "    </sMarks>\n" + "    <sName>Name01</sName>\n" + "</student>";
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(xmlCode);
		Object unmarshal = unmarshaller.unmarshal(reader);
		Student student = (Student) unmarshal;
		System.out.println("Unmarshalled Object: " + student);
		
	}
}
