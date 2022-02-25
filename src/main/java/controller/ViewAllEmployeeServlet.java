package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeList;

/**
 * Servlet implementation class ViewAllEmployeeServlet
 */
@WebServlet("/viewAllEmployeeServlet")
public class ViewAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EmployeeListHelper elh = new EmployeeListHelper();
		request.setAttribute("allEmployee", elh.showAllEmp());
		
		
		  for(EmployeeList el : elh.showAllEmp()) {
		  System.out.println(el.empDetails()); }
		 
		String path = "/employee-list.jsp";
		if(elh.showAllEmp().isEmpty()){
		path = "/index.html";
		}
	}


}