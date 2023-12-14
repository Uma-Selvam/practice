package org.step;

public class REsponsetime {
	
	private String name;
	 
	private String Job;
	private String[] skills;
	private Details details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public REsponsetime(String name, String job, String[] skills, Details details) {
		super();
		this.name = name;
		Job = job;
		this.skills = skills;
		this.details = details;
	}
	
	
	
	

}
