package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.one.beans.Address;
import com.te.spring.core.one.beans.Student;

public class AppConfig {
	@Bean(name = "student")
	public Student getStudentObj() {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("SName01");
		student.setStudentAge(29);
		return student;
	}

	@Bean(name="address1")
	public Address getAddressObj() {
		Address address = new Address();
		address.setaId(1);
		address.setCity("Thanjavur");
		address.setState("Tamilnadu");
		return address;
	}

	@Bean(name="address2")
	@Primary
	public Address getAddressObj2() {
		Address address = new Address();
		address.setaId(2);
		address.setCity("city 2");
		address.setState("state 2");
		return address;
	}

	@Bean(name="address3")
	public Address getAddressObj3() {
		Address address = new Address();
		address.setaId(1);
		address.setCity("city 3");
		address.setState("state 3");
		return address;
	}
}
