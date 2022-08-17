package com.ty.oneToOneUni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneUni.dto.Company;
import com.ty.oneToOneUni.dto.Gst;

public class TestCompanySave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Company company = new Company();
		company.setName("TCS");
		company.setPhone(987343444);

		Gst gst = new Gst();
		gst.setGstNumber(764345686);
		gst.setStatus("Pending");
		
		company.setGst(gst);
		
		transaction.begin();
		manager.persist(company);
		manager.persist(gst);
		transaction.commit();
		System.out.println("--------------data stored------------------");

	}

}
