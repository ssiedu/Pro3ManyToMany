package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private String ecode;
	private String ename;
	private int sal;
	private String desg;
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();
	
	
	
	public Emp() {
		super();
	}
	public Emp(String ecode, String ename, int sal, String desg) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
	}
	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", ename=" + ename + ", sal=" + sal
				+ ", desg=" + desg + "]";
	}
	
}
