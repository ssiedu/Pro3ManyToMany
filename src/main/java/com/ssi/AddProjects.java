package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddProjects {

	public static void main(String[] args) {

		Project p1=new Project("P111","ERP",4,26000);
		Project p2=new Project("P112","AcSw",10,60000);
		Project p3=new Project("P113","Firewall",3,85600);
		Project p4=new Project("P114","Banking",18,125400);
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(p1); session.save(p2); session.save(p3); session.save(p4);
		tr.commit();
		session.close();
		System.out.println("Projects Added");
		
	}

}
