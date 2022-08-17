package com.ty.oneToOneUni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneUni.dto.Company;

public class GetCompanyById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Company company = manager.find(Company.class, 3);
		System.out.println(company);
	
		System.out.println("--------------------Data saved--------------------");

	}


}
