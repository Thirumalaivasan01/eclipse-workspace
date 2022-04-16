package com.te.hibernate.hibernate_two;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.hibernate_two.dto.Student;

public class JPQL01 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String str="from Student";
		Query query=entityManager.createQuery(str);
		List resultList=query.getResultList();
		for (Object object : resultList) {
			Student student=(Student) object;
			System.out.println(student);
		}
		String str1="from Student where sId=1";
		Query query1=entityManager.createQuery(str1);
		Object single=query1.getSingleResult();
		Student student=(Student)single;
		System.out.println(student);
		
	}

}
