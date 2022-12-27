package StudentSite;
import java.util.Scanner;

import com.acn.lkm.been.StudentBean;
import com.acn.lkm.service.StudentService;
import com.acn.lkm.service.StudentServiceImp;

public class StudentClient {
	static Scanner sc=new Scanner(System.in);
	public static StudentBean enterStduentDetails()
	{
			System.out.println("Enter Student Details:----");
			System.out.println("Enter Unique Id:-");
			int id=sc.nextInt();
			System.out.println("Enter Student Name:-");
			String name=sc.next();
			System.out.println("Enter Student Registration Date  (YYYY-MM-DD):-");
			String date1=sc.next();
//	        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
//	        String cinput = sc.nextLine();
//	        if(null != cinput && cinput.trim().length() > 0){
//	             try {
//					date1 = format.parse(cinput);
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	        }
//	        System.out.print(date1); 
			System.out.println("Enter Student Fess:-");
			double cost=sc.nextDouble();
			StudentBean st=new StudentBean(id, name, date1, cost);
			return st;
	}
     public static void main(String[] args) {
    	 StudentBean st=enterStduentDetails();
		StudentService service=new StudentServiceImp();
		service.addStudent(st);
		service.getStudentDetails();
		System.out.println("If You Want to Delete Existing Student Record then Press Y OtherWise N:--");
		char ch=sc.next().charAt(0);
		if(ch=='Y')
		{
			System.out.println("Enter Stdudent Details You want to delete:-");
			StudentBean st1=enterStduentDetails();
			service.deleteStudent(st1);
			service.getStudentDetails();
		}
	}
}
