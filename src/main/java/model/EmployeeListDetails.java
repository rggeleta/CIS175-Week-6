package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author roman - rggeleta@dmacc.edu
 * CIS175 - Spring 2022
 * Feb 15, 2022
 */
@Entity
public class EmployeeListDetails {
	
	@Id
	@GeneratedValue
	private int id;
	private String empListName;
	private LocalDate hireDate;
	private Employees employees;
	private List<EmployeeList> listOfEmployee;
	
	public EmployeeListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeListDetails(int id, String empListName, LocalDate hireDate, Employees employees,
			List<EmployeeList> listOfEmployee) {
		super();
		this.id = id;
		this.empListName = empListName;
		this.hireDate = hireDate;
		this.employees = employees;
		this.listOfEmployee = listOfEmployee;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpListName() {
		return empListName;
	}

	public void setEmpListName(String empListName) {
		this.empListName = empListName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public List<EmployeeList> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<EmployeeList> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}


	@Override
	public String toString() {
		return "EmployeeListDetails [id=" + id + ", empListName=" + empListName + ", hireDate=" + hireDate
				+ ", employees=" + employees + ", listOfEmployee=" + listOfEmployee + "]";
	}

	/**
	 * @param ld
	 */
	public void setTripDate(LocalDate ld) {
		// TODO Auto-generated method stub
		
	}
	
	


}
