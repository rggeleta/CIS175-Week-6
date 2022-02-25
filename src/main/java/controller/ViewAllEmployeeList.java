package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeList;
import model.EmployeeListDetails;

/**
 * Servlet implementation class ViewAllEmployeeList
 */
@WebServlet("/viewAllEmployeeList")
public class ViewAllEmployeeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllEmployeeList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeListHelper elh = new EmployeeListHelper();
		List<EmployeeList> el = elh.showAllEmp();
		request.setAttribute("allemployee", elh);
		if (el.isEmpty()) {
			request.setAttribute("allemployee", " ");
		}
		getServletContext().getRequestDispatcher("/employee-list.jsp").forward(request, response);
			}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
