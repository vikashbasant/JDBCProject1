package com.acn.lkm.service;

import com.acn.lkm.been.StudentBean;
import com.acn.lkm.dao.StudentDao;
import com.acn.lkm.dao.StudentIMP;

public class StudentServiceImp implements StudentService{
	     StudentDao std=new StudentIMP();
      public Integer addStudent(StudentBean bean)
      {
    	  return std.addStudent(bean);
      }
      public void updateStudent(StudentBean been)
      {
    	  std.updateStudent(been);
      }
      public void getStudentDetails() {
    	  std.getStudentDetails();
      }
      public void deleteStudent(StudentBean bean) {
    	  std.deleteStudent(bean);
      }
}
