package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author roman - rggeleta@dmacc.edu
 * CIS175 - Spring 2022
 * Feb 15, 2022
 */
@Entity
@Table(name = "employees")
public class Employees {
	
	@Id
	@GeneratedValue
	private int id;
	private String employeeName;
	
	
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}
	
	public Employees( String employeeName) {
		super();
		this.employeeName = employeeName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	@Override
	public String toString() {
		return "Employees [id=" + id + ", employeeName=" + employeeName + "]";
	}


	
}
