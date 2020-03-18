package ua.lgs.lviv;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class University implements Predicate, Consumer{
		
	private int payment;
	private int auditoryNumber;
	public String name;
	public int yearBased;
	public University(int payment, int auditoryNumber, String name, int yearBased) {
		super();
		this.payment = payment;
		this.auditoryNumber = auditoryNumber;
		this.name = name;
		this.yearBased = yearBased;
	}
	public University(String name, int yearBased) {
		super();
		this.name = name;
		this.yearBased = yearBased;
	}
	public University() {
		super();
	}
	
	public void printCurriculam(String s) {
		System.out.println("This is your curriculam for today..."+s);
	}
	public void printGreeting(String s, int args) {
		for (int i=0; i<args; i++) {
            System.out.println("Score: " + (i+1) + ". "); 
       }
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getAuditoryNumber() {
		return auditoryNumber;
	}
	public void setAuditoryNumber(int auditoryNumber) {
		this.auditoryNumber = auditoryNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBased() {
		return yearBased;
	}
	public void setYearBased(int yearBased) {
		this.yearBased = yearBased;
	}
	@Override
	public String toString() {
		return "University [payment=" + payment + ", auditoryNumber=" + auditoryNumber + ", name=" + name
				+ ", yearBased=" + yearBased + "]";
	}
	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
