package com.cg.onlinetest.bean;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;
import java.util.Set;

public class Test
{
	private int testId;
    private String testTitle;
    private String testDuration; 
    Set<Question> testQuestions;
    private double testTotalMarks;
    private double testMarksScored;
    Question currentQuestion;
    LocalDateTime startTime;
    LocalDateTime endTime;
    
    Map<Integer, Question> map;
    
	public Test(int testId, String testTitle, String testDuration, Set<Question> testQuestions, double testTotalMarks,
			double testMarksScored, Question currentQuestion, LocalDateTime startTime, LocalDateTime endTime) 
	{
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Test() 
	{
		super();
	}
	
	
	public int getTestId() 
	{
		return testId;
	}
	public void setTestId(int testId) 
	{
		this.testId = testId;
	}
	
	
	public String getTestTitle() 
	{
		return testTitle;
	}
	public void setTestTitle(String testTitle) 
	{
		this.testTitle = testTitle;
	}
	
	
	public String getTestDuration() 
	{
		return testDuration;
	}
	public void setTestDuration(String testDuration) 
	{
		this.testDuration = testDuration;
	}
	
	
	public Set<Question> getTestQuestions()
	{
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) 
	{
		this.testQuestions = testQuestions;
	}
	
	
	public double getTestTotalMarks() 
	{
		return testTotalMarks;
	}
	public void setTestTotalMarks(double testTotalMarks)
	{
		this.testTotalMarks = testTotalMarks;
	}
	
	
	public double getTestMarksScored() 
	{
		return testMarksScored;
	}
	{
		this.testMarksScored = testMarksScored;
	}
	
	
	public Question getCurrentQuestion() 
	{
		return currentQuestion;
	}
	public void setCurrentQuestion(Question currentQuestion) 
	{
		this.currentQuestion = currentQuestion;
	}
	
	
	public LocalDateTime getStartTime() 
	{
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) 
	{
		this.startTime = startTime;
	}
	
	
	public LocalDateTime getEndTime() 
	{
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) 
	{
		this.endTime = endTime;
	}

	
}
