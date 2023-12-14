package org.step;

public class Details {
	
	private String companyname;
	private String Emailid;

	public Details(String companyname, String emailid) {
		super();
		this.companyname = companyname;
		Emailid = emailid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

}
