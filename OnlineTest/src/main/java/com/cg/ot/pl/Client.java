package com.cg.ot.pl;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import com.cg.ot.bean.Question;
import com.cg.ot.bean.Test;
import com.cg.ot.bean.User;
import com.cg.ot.exception.TestException;
import com.cg.ot.service.TestService;
import com.cg.ot.service.TestServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		TestService testservice=new TestServiceImpl();
		int choice=0;
		
		Test test=new Test();
	    User user=new User();
		while(choice!=2)
		{
		   System.out.println("1.AddTest");
		   System.out.println("2.AssignTest");
		   System.out.println("Enter the choice");
		   choice=scanner.nextInt();
		    int testId=0;
		    int userId=0;
		    int questionId=0;
		    
		    switch(choice)
		    {
		    case 1:
		       System.out.println("Enter Test Title");
	           scanner.nextLine();
	           String testTitle=scanner.nextLine();
	           
	           System.out.println("Enter test duration");
	           String testDuration= scanner.nextLine();
	           scanner.nextLine();
	           
	           System.out.println("enter total marks");
	           double testTotalMarks=scanner.nextDouble();
	           scanner.nextLine();
	           
	           System.out.println("start Time");
	           LocalDateTime startTime=LocalDateTime.now();
	           System.out.println(startTime);
	           scanner.nextLine();
	         
	           
	           test.setTestTitle(testTitle);
               test.setTestDuration(testDuration);	
               test.setTestTotalMarks(testTotalMarks);
               test.setStartTime(startTime);
             
	           
	           try
	           {
	           int id=testservice.addTest(test);
	           System.out.println("test id " +id);
	           }
	           catch(TestException e)
	           {
	        	   System.err.println(e.getMessage());
	           }
	           break;
		    		
		    case 2:
		    	
		    		System.out.println("Enter the userId");
		    		userId=scanner.nextInt();
		    		System.out.println("enter test id");
		    		testId=scanner.nextInt();
		    		user.setUserId(userId);
		    		test.setTestId(testId);
		    		
		    		try
		    		{
		    		   testservice.assignTest(userId,testId);
		    		   System.out.println("Test is assigned to the given user "+userId);
		    		}
		    		catch(TestException e)
		    	    {
		    		   System.err.println(e.getMessage());
		    	    }
		    		break;
		    		
		    default:
		    	
		    	System.out.println("Invalid choice");
		    	 
		    }
		   
		}

	}

}
