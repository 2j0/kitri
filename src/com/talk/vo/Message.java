package com.talk.vo;

import java.util.Date;

public class Message {
	String emp_no;
	String chat_no;
	String msg_no;
	String msg_text;
	Date msg_date;
	
	
	public Message(String emp_no, String chat_no, String msg_no, String msg_text, Date msg_date) {
		super();
		this.emp_no = emp_no;
		this.chat_no = chat_no;
		this.msg_no = msg_no;
		this.msg_text = msg_text;
		this.msg_date = msg_date;
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
	public String getMsg_no() {
		return msg_no;
	}
	public void setMsg_no(String msg_no) {
		this.msg_no = msg_no;
	}
	public String getMsg_text() {
		return msg_text;
	}
	public void setMsg_text(String msg_text) {
		this.msg_text = msg_text;
	}
	public Date getMsg_date() {
		return msg_date;
	}
	public void setMsg_date(Date msg_date) {
		this.msg_date = msg_date;
	}
	
}
