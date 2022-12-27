package com.acn.lkm.service;

import com.acn.lkm.been.StudentBean;

public interface StudentService {
	public Integer addStudent(StudentBean bean);
	  public void updateStudent(StudentBean been);
	  public void getStudentDetails();
	  public void deleteStudent(StudentBean bean);
}
