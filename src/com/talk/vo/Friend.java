package com.talk.vo;

public class Friend {
	String emp_no;
	String friend_no;
	
	public Friend(String emp_no, String friend_no) {
		super();
		this.emp_no = emp_no;
		this.friend_no = friend_no;
	}
	
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getFriend_no() {
		return friend_no;
	}
	public void setFriend_no(String friend_no) {
		this.friend_no = friend_no;
	}
}
