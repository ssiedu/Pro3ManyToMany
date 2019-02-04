package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchProject {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Project p=session.get(Project.class, "P113");
		System.out.println(p.getPcode());
		System.out.println(p.getPtitle());
		System.out.println(p.getDuration());
		System.out.println(p.getCost());
		List<Emp> list=p.getEmps();
		for(Emp e:list){
			System.out.println(e);
		}
		
		session.close();

	}

}
