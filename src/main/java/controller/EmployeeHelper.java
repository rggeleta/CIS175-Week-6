package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employees;

/**
 * @author roman - rggeleta@dmacc.edu
 * CIS175 - Spring 2022
 * Feb 15, 2022
 */
public class EmployeeHelper {
	static EntityManagerFactory emfactory = 
			Persistence.createEntityManagerFactory("EmployeeList");


	public void insertShopper(Employees e) {
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	em.persist(e);
	em.getTransaction().commit();
	em.close();
	}
	
	public List<Employees> showAllEmployees() {
		EntityManager em = emfactory.createEntityManager();
		List<Employees> allEmployees = em.createQuery("SELECT e FROM Employees e").getResultList();
		return allEmployees;
		}

	/**
	 * @param employeeName
	 * @return
	 */
	public Employees findEmployee(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

}


