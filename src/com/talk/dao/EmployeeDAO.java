package com.talk.dao;

import java.util.List;

import com.talk.exception.InsertException;
import com.talk.exception.SelectException;
import com.talk.vo.Employee;

public interface EmployeeDAO {
	/**
	 * 사원을 사원목록에 저장한다. 단,중복된 사원은 "이미존재하는 사원입니다"메시지를 갖는 
	 * InsertException예외 발생한다.
	 * 중복된 사원이란 사번이 같은 사원 객체를 말한다.
	 * 
	 * @param e 등록할 사원
	 * @throws InsertException
	 */
	public abstract void insert(Employee e) throws InsertException;
	
	public abstract void update(Employee e) throws InsertException;
	
	Employee selectEmployeeByNo(String emp_no) throws SelectException;
	List<Employee> selectAll() throws SelectException;
	List<Employee> selectEmployeeByLikeName(String word) throws SelectException;
}
