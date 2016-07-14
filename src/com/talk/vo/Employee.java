package com.talk.vo;

public class Employee {
	private String emp_no;
	private String emp_name;
	private String emp_pw;
	private String emp_job;
	private String emp_dept;
	private String emp_ip;
	
	public Employee(String emp_no, String emp_name, String emp_pw, String emp_job, String emp_dept, String emp_ip) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.emp_pw = emp_pw;
		this.emp_job = emp_job;
		this.emp_dept = emp_dept;
		this.emp_ip = emp_ip;
	}
	
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_pw() {
		return emp_pw;
	}
	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}
	public String getEmp_job() {
		return emp_job;
	}
	public void setEmp_job(String emp_job) {
		this.emp_job = emp_job;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public String getEmp_ip() {
		return emp_ip;
	}
	public void setEmp_ip(String emp_ip) {
		this.emp_ip = emp_ip;
	}
	
	
}
