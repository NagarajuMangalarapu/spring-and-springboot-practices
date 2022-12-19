package com.springdemospock.app;

import java.util.List;

public interface IStudentDatabase {

	public List<Float> getStudentScores(String studentId);
	
	public void updateStudentGrade(String studentId,String grade);
	
	public String getStudentGrade(String studentId);
	
}
