package ua.lgs.lviv;

public class Faculty extends University{
	
	private String name;
	private int numberOfStudents;
	public Faculty(int payment, int auditoryNumber, String name, int yearBased, String name2, int numberOfStudents) {
		super(payment, auditoryNumber, name, yearBased);
		name = name2;
		this.numberOfStudents = numberOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", numberOfStudents=" + numberOfStudents + "]";
	}
	
	
}
