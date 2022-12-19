package com.springdemospock.app;

import java.util.List;

public class StudentDatabase implements IStudentDatabase{

	@Override
	public List<Float> getStudentScores(String studentId) {
		return null;
	}

	@Override
	public void updateStudentGrade(String studentId, String grade) {
		
	}

	@Override
	public String getStudentGrade(String studentId) {
		return null;
	}

}
