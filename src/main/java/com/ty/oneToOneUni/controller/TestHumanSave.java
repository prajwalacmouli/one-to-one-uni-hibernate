package com.ty.oneToOneUni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneUni.dto.Human;
import com.ty.oneToOneUni.dto.Spectacle;

public class TestHumanSave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Human h1 = new Human();
		h1.setName("Prajwala");
		h1.setAge(25);
		
		Spectacle s1 = new Spectacle();
		s1.setBrand("Vincent Chase");
		s1.setPower("-3.234R -2.45L");
		h1.setSpectacle(s1);
		
		transaction.begin();
		manager.persist(h1);
		manager.persist(s1);
		transaction.commit();
		System.out.println("--------------Data Stored----------------");
		
	}

}
