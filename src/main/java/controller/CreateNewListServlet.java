package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeList;
import model.EmployeeListDetails;
import model.Employees;

/**
 * Servlet implementation class CreateNewListServlet
 */
@WebServlet("/createNewListServlet")
public class CreateNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		EmployeeListHelper elh = new EmployeeListHelper();
    		Employees employees = new Employees();
    		EmployeeListDetails eld = new EmployeeListDetails(0, null, null, employees, null);
    		String employeeName = request.getParameter("employeeName");
    		System.out.println("Employee Name: "+ employeeName);
    		String month = request.getParameter("month");
    		String day = request.getParameter("day");
    		String year = request.getParameter("year");
    		String empName = request.getParameter("employeeName");
    		LocalDate ld;
    		try {
    		ld = LocalDate.of(Integer.parseInt(year), 
    		Integer.parseInt(month), Integer.parseInt(day));
    		}catch(NumberFormatException ex) {
    		ld = LocalDate.now();
    		}
    		String[] employee = request.getParameterValues("allEmployeesToAdd");
    		ArrayList<EmployeeList> employeesInList =
    				new ArrayList<EmployeeList>();
    		
    		if (employees != null && employeesInList.size() > 0) 
    		{
    		for(int i = 0; i<employeesInList.size(); i++) {
    		System.out.println(employee[i]);
    		EmployeeList el = 
    		elh.searchForEmpFirstNameById(Integer.parseInt(employee[i]));
    		employeesInList.add(el);
    		}
    		}
    	
    		elh.setEmployees(employeesInList);
    		EmployeeListHelper elist = new EmployeeListHelper();
    		elist.insertEmp(elist);
    		System.out.println("Success!");
    		System.out.println(eld.toString());
    		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
    		

    	response.getWriter().append("Served at: ").append(request.getContextPath());

    	}

    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    	 *      response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		doGet(request, response);
    	}

    }
