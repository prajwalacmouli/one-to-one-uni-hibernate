package com.ty.oneToOneUni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneUni.dto.Person;

public class GetPersonById {
	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person person = manager.find(Person.class, 2);
		System.out.println("Person name is : "+person.getName());
		Thread.sleep(2000);
	
		System.out.println("-------------------------------------");
		
		System.out.println("Pan is :"+person.getPan());

	}
}
