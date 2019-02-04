package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Emp e=session.get(Emp.class, "E112");
		System.out.println(e.getEcode());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		List<Project> list=e.getProjects();
		for(Project p:list){
			System.out.println(p);
		}
		session.close();
	}

}
