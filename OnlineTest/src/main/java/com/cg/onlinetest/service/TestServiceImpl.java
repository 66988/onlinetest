package com.cg.onlinetest.service;

import java.util.Random;

import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.dao.TestDao;
import com.cg.onlinetest.dao.TestDaoMapImpl;
import com.cg.onlinetest.exception.TestException;


public class TestServiceImpl implements TestService
{


	private TestDao testDao;
	public TestServiceImpl()
	{
		testDao = new TestDaoMapImpl();
	}
	
	@Override
	public boolean validateName(String testTitle)
	{
	   boolean flag=false;
		
	   flag=testTitle.matches("[a-zA-z]+");
	   return flag;
	}
	
	public boolean validateUserId(int UserId)
	{
		String userId  = String.valueOf(UserId);

		boolean validateId = userId.matches("[0-9]{2}");
		return validateId;
	}

	
	public int addTest(Test test) throws TestException 
	{
		
		//validating TestTitle
		String name=test.getTestTitle();
		boolean flag=validateName(name);
		if(!flag)
		{
			throw new TestException("Name should contain only characters");
		} 
		
		Random random=new Random();
		
		int testId=random.nextInt(100)+1000;
		test.setTestId(testId);
		testId=testDao.addTest(test);
			
		return test.getTestId();
	}
	
	public void assignTest(int userId, int testId) throws TestException 
	{

		//validating userId
		boolean validateId = validateUserId(userId);
		if(!validateId)
		{
			throw new TestException("Id should be 2 digit");
		}
		
       testDao.assignTest(userId,testId);
       
		
	}

}
