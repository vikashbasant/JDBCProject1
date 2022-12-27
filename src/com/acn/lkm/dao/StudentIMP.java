package com.acn.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acn.lkm.been.StudentBean;
import com.acn.lkm.resource.ConnectDB;

public class StudentIMP implements StudentDao{
       public Integer addStudent(StudentBean been)
       {
    	   Integer result=0;
    	   Connection con=ConnectDB.getConnection();
    	   try {
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?)");
			pstmt.setInt(1,been.getStudentId());
			pstmt.setString(2,been.getStudentName());
			pstmt.setString(3,been.getRegistrationDate());
			pstmt.setDouble(4,been.getCost());
			result=pstmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   return result;
       }
       public void updateStudent(StudentBean been)
       {
    	   Connection con=ConnectDB.getConnection();
    	   try {
   			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?)");
   			pstmt.setInt(1,been.getStudentId());
   			pstmt.setString(2,been.getStudentName());
   			pstmt.setString(3,been.getRegistrationDate());
   			pstmt.setDouble(4,been.getCost());
   			pstmt.executeUpdate();
   			con.close();
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
       }
       public void getStudentDetails()
       {
    	   Connection con=ConnectDB.getConnection();
    	   PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("select * from student");
			ResultSet set=pstmt.executeQuery();
			while(set.next())
			{
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getDouble(4));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       public void deleteStudent(StudentBean been)
       {
    	   Connection con=ConnectDB.getConnection();
    	   try {
			PreparedStatement pstmt=con.prepareStatement("delete from student where studentId=?");
			pstmt.setInt(1,been.getStudentId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }
       
}
