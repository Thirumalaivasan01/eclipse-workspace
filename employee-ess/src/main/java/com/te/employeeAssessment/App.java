package com.te.employeeAssessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.employeeAssessment.beans.EmployeeInfo;
import com.te.employeeAssessment.beans.EmployeeLeave;


/**
 * Hello world!
 *
 */
public class App 
{
	 static boolean isManager=false;
	
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("PU01");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	//boolean isManager=false;
    	Scanner sc=new Scanner(System.in);
    	int choice;
    	boolean exit=false;
    	boolean status;
    	EmployeeInfo currentEmp=null;
    	boolean empexit=false;
    	boolean managerexit=false;
    	do {
    		System.out.println("Press 1 to register employee");
    		System.out.println("Press 2 to login");
    		System.out.println("Press 3 to exit");
    		choice=sc.nextInt();
    		switch(choice) {
    		case 1:{
    			doRegister(entityTransaction,entityManager);
    		break;	
    		}
    		case 2:{
    			currentEmp=doLogin(entityManager);
    			if(currentEmp!=null) {
    				status=true;
    			}
    			else {status=false;}
    			System.out.println("\n==================");
    			System.out.println("Login status:"+status+" "+(status?" Login Successful!!":" Please Check Your Username and password..."));
    			System.out.println("==================");
    			if(status==true && currentEmp.getEmpType().equalsIgnoreCase("Manager")) {
    				System.out.println(currentEmp.getEmpType());
    				do{
    					System.out.println("Press 1 to show all leave request");
    				
    				System.out.println("Press 2 Approve/Reject leave request");
    				System.out.println("Press 3 to exit");
    				choice=sc.nextInt();
    				switch(choice) {
    				case 1: {
    					showAllRequest(entityTransaction,entityManager);
    					break;
    				}
    				case 2:{
    					ApproveRequest(entityTransaction,entityManager);
    					break;
    				}
    				case 3: {
    					managerexit=true;
    					break;
    				}
    				}
    				
    			}while(!managerexit);
    			}
    			else if(status==true) {
    				do {
    				System.out.println("Press 1 to show all status of leave requests");
    				System.out.println("Press 2 to request for leave");
    				System.out.println("Press 3 to exit");
    				choice=sc.nextInt();
    				switch(choice) {
    				case 1:{
    					showMyRequest(entityTransaction,entityManager, currentEmp);
    					break;
    				}
    				case 2: {
    					requestLeave(entityTransaction,entityManager,currentEmp);
    					break;
    				}
    				case 3: {
    					empexit=true;
    					break;
    				}
    				}
    					
    				}while(!empexit);
    			}
    			break;
    		}
    		case 3:{
    			exit=true;
    			break;
    		}
    		}
    		
    	}while(!exit);
        System.out.println( "Hello World!" );
    }
    public static void doRegister(EntityTransaction entityTransaction, EntityManager entityManager) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Details of Employee");
    	System.out.println("ENter Employee Name: ");
    	String empName=sc.nextLine();
    	System.out.println("Enter employee type: ");
    	String empType=sc.nextLine();
    	System.out.println("Enter E-mail: ");
    	String email=sc.nextLine();
    	System.out.println("Enter Password: ");
    	String password=sc.nextLine();
    	
    	EmployeeInfo employee=new EmployeeInfo();
    	EmployeeLeave leave=new EmployeeLeave();
    	
    	employee.setEmpName(empName);
    	employee.setEmpType(empType);
    	employee.setEmail(email);
    	employee.setPassword(password);
    	
    	leave.setLeaveDate("August 22");
    	leave.setLeaveStatus("Requested");
    	leave.setEmployee(employee);
    	List<EmployeeLeave> leaveList=new ArrayList<EmployeeLeave>();
    	employee.setEmpLeave(leaveList);
    	
    	entityTransaction.begin();
    	entityManager.persist(employee);
    	//entityManager.persist(leave);
    	entityTransaction.commit();
    	
    	
    }
    public static EmployeeInfo doLogin(EntityManager entityManager) {
    	Scanner sc=new Scanner(System.in);
    	//boolean result = false;
    	System.out.println("Enter Employee UserName: ");
    	String loginName=sc.nextLine();
    	System.out.println("Enter Password: ");
    	String loginPassword=sc.nextLine();
    	
    	String str1="from EmployeeInfo where empName=:loginName";
		Query query1=entityManager.createQuery(str1);
		query1.setParameter("loginName", loginName);
		List<Object> employee=query1.getResultList();
		if(employee.size()>0) {
		EmployeeInfo emp=(EmployeeInfo)employee.get(0);
		System.out.println(emp);
		if(emp.getPassword().equals(loginPassword)) {
			
			return emp;
		}
		}
		else {
			System.err.println("Invalid UserName...");
			
		}
		
    	return null;
    }
    public static void showAllRequest(EntityTransaction entityTransaction,EntityManager entityManager) {
    	String str1="from EmployeeLeave ";
		Query query1=entityManager.createQuery(str1);
		
		List<Object> employee=query1.getResultList();
		for (Object object : employee) {
			EmployeeLeave empLeave=(EmployeeLeave)object;
			entityManager.refresh(empLeave);
		}
		//entityManager.refresh(employee);
		for (Object object : employee) {
			EmployeeLeave empLeave=(EmployeeLeave)object;
			//entityManager.refresh(empLeave);
			System.out.println(empLeave);
		}
    }
    public static void ApproveRequest(EntityTransaction entityTransaction,EntityManager entityManager) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter leaveId: ");
    	int leaveId=sc.nextInt();
    	sc.nextLine();;
    	System.out.println("Enter update stutus: ");
    	String leaveStatus=sc.nextLine();
    	
    	String str1 = "update EmployeeLeave set leaveStatus=:leaveStatus where leaveId=:leaveId";

		Query query1 = entityManager.createQuery(str1);
		query1.setParameter("leaveId", leaveId);
		query1.setParameter("leaveStatus", leaveStatus);
		// Object single = query1.getSingleResult();
		entityTransaction.begin();
		int affected = query1.executeUpdate();
		entityTransaction.commit();
    }
    
    public static void showMyRequest(EntityTransaction entityTransaction,EntityManager entityManager,EmployeeInfo emp) {
    	int empId=emp.getEmpId();
    	String str1="from EmployeeLeave where employee.empId=:empId ";
		Query query1=entityManager.createQuery(str1);
		query1.setParameter("empId", empId);
		List<Object> employee=query1.getResultList();
		for (Object object : employee) {
			EmployeeLeave empLeave=(EmployeeLeave)object;
			System.out.println(empLeave);
		}
    }
    public static void requestLeave(EntityTransaction entityTransaction, EntityManager entityManager,EmployeeInfo emp) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter leaveDate: ");
    	String leaveDate=sc.nextLine();
    	EmployeeLeave leave=new EmployeeLeave();
    	leave.setLeaveDate(leaveDate);
    	leave.setLeaveStatus("Requested");
    	leave.setEmployee(emp);
    	entityTransaction.begin();
    	entityManager.persist(leave);
    	entityTransaction.commit();
    	
    	
    }
}
