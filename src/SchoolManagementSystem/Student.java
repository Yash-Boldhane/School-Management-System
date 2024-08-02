package SchoolManagementSystem;

public class Student {
	private int id;
	private String name;
	private String grade;
	private int feespaid;
	private int totalfees;
	/**
	 * @param id
	 * @param name
	 * @param grade
	 * @param feespaid
	 * @param totalfees
	 */
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.feespaid = 0;
		this.totalfees = 60000;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", grade=" + grade + ", feespaid=" + feespaid + ", totalfees="
				+ totalfees + "]";
	}
	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getFeespaid() {
		return feespaid;
	}
	public void Feespaid(int fees) {
		feespaid+=fees;
		School.setTotalMoneyEarned(feespaid);
	}
	public int getTotalfees() {
		return totalfees;
	}
	public void setTotalfees(int totalfees) {
		this.totalfees = totalfees;
	}
	
	
	
	public int getRemaining()
	{
		return totalfees-feespaid;
	}
	
	
	
}
