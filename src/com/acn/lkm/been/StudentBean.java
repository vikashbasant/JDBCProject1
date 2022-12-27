package com.acn.lkm.been;

public class StudentBean {
   Integer studentId;
   String studentName;
   String  registrationDate;
   Double cost;
public StudentBean() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentBean(Integer studentId, String studentName,String date1, Double cost) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.registrationDate = date1;
	this.cost = cost;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String  getRegistrationDate() {
	return registrationDate;
}
public void setRegistrationDate(String  registrationDate) {
	this.registrationDate = registrationDate;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", registrationDate="
			+ registrationDate + ", cost=" + cost + "]";
}

}
