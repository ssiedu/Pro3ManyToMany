package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private String pcode;
	private String ptitle;
	private int duration;
	private int cost;
	@ManyToMany (mappedBy="projects")
	private List<Emp> emps=new ArrayList<Emp>();
	
	public Project(String pcode) {
		super();
		this.pcode = pcode;
	}
	public Project() {
		super();
	}
	public Project(String pcode, String ptitle, int duration, int cost) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.duration = duration;
		this.cost = cost;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", duration="
				+ duration + ", cost=" + cost + "]";
	}
	
}
