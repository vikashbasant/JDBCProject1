package com.acn.lkm.dao;

import com.acn.lkm.been.StudentBean;

public interface StudentDao {
  public Integer addStudent(StudentBean bean);
  public void updateStudent(StudentBean been);
  public void getStudentDetails();
  public void deleteStudent(StudentBean bean);
}
