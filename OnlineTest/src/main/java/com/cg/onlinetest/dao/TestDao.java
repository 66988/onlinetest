package com.cg.onlinetest.dao;


import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.exception.TestException;

public interface TestDao 
{

	public int addTest(Test test)throws TestException;
	public void assignTest(int userId,int TestId)throws TestException;
}
