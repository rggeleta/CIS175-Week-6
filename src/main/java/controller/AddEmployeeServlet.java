package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.EmployeeListHelper;
import model.EmployeeList;


/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empFirstName = request.getParameter("empFirstName");
		String empLastName = request.getParameter("empLastName");

		System.out.println("Inside doPost");
		
		EmployeeList el = new EmployeeList(empFirstName, empLastName);
		EmployeeListHelper elh = new EmployeeListHelper();
		elh.insertEmp(el);

		getServletContext().getRequestDispatcher("/index.html").forward(request, response);

		
	}

}
