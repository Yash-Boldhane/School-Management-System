package SchoolManagementSystem;

import java.util.List;

public class School {
	private List<Teacher> teacher;
	private List<Student> student;
	private static  int totalMoneyEarned;
	private static int totalMoneySpent;
	/**
	 * @param teacher
	 * @param student
	 */
	public School(List<Teacher> teacher, List<Student> student) {
		super();
		this.teacher = teacher;
		this.student = student;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher.add(teacher);
	}
	
	public List<Student> getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void setTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+=MoneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public static  void setTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent;
	}
	
	
	
	
	
	
}
