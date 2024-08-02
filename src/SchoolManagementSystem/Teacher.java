package SchoolManagementSystem;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salear;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salear=0;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void receiveSal(int sal)
	{
		 salear+=sal;
		 School.setTotalMoneySpent(sal);
	}
	
	
}
