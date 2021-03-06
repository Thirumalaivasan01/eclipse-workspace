package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.te.spring.core.one.beans.Address;
import com.te.spring.core.one.beans.Student;

public class AppConfig {
	@Bean(name="student")
	public Student getStudentObj() {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("SName01");
		student.setStudentAge(29);
		return student;
	}

	@Bean
	public Address getAddressObj() {
		Address address = new Address();
		address.setaId(1);
		address.setCity("Thanjavur");
		address.setState("Tamilnadu");
		return address;
	}
}
