package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddEmps {
	public static void main(String[] args) {

//		Project p1=new Project("P111","ERP",4,26000);
//		Project p2=new Project("P112","AcSw",10,60000);
//		Project p3=new Project("P113","Firewall",3,85600);
//		Project p4=new Project("P114","Banking",18,125400);
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		
		Emp e1=new Emp("E111","AAA",50000,"SE");
		e1.getProjects().add(new Project("P111"));
		e1.getProjects().add(new Project("P112"));
		
		Emp e2=new Emp("E112","BBB",80000,"TL");
		e2.getProjects().add(new Project("P111"));
		e2.getProjects().add(new Project("P114"));
		
		session.save(e1); session.save(e2);
		
		tr.commit();
		session.close();
		System.out.println("Emps Added");
		
	}
}
