package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolDriver {
	public static void main(String[] args) {
		Teacher T1=new Teacher(1, "Amit", 5000);
		Teacher T2=new Teacher(2, "Sanket", 4000);
		Teacher T3=new Teacher(3, "Sahil", 7000);
		
		List<Teacher> teacherlist=new ArrayList<Teacher>();
		teacherlist.add(T1);
		teacherlist.add(T2);
		teacherlist.add(T3);
		
		
		Student s1=new Student(101,"Yash");
		Student s2=new Student(102, "Harmane");
		Student s3=new Student(103, "Kailash");
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		
		School WHS=new School(teacherlist, studentlist);
		s1.Feespaid(2000);
		System.out.println(WHS.getTotalMoneyEarned());
		s2.Feespaid(50000);
		System.out.println(WHS.getTotalMoneyEarned());
		
		T1.receiveSal(T1.getSalary());
		System.out.println(T1.getSalary());
		System.out.println(WHS.getTotalMoneyEarned());
		System.out.println(WHS.getTotalMoneySpent());
		System.out.println(T1);
	}
}
