package com.talk.vo;

public class Chat {
	String emp_no;
	String chat_no;
	
	
	public Chat(String emp_no, String chat_no) {
		super();
		this.emp_no = emp_no;
		this.chat_no = chat_no;
	}
	
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getChat_no() {
		return chat_no;
	}
	public void setChat_no(String chat_no) {
		this.chat_no = chat_no;
	}
	
}
