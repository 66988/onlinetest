package com.cg.onlinetest.service;

import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.exception.TestException;

public interface TestService
{

	public boolean validateName(String testTitle); 
	public boolean validateUserId(int UserId);
	public int addTest(Test test)throws TestException;
	public void assignTest(int userId,int TestId)throws TestException;
	
}
