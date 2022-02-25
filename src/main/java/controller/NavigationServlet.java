package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeList;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet("/navigationServlet")
public class NavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NavigationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String act = request.getParameter("doThisToEmployee");
		EmployeeListHelper elh = new EmployeeListHelper();
		String path = "/viewAllEmployeeServlet";
		if (act.equals("delete")) {
		} else if (act.equals("edit")) {
		} else if (act.equals("add")) {
			path = "/index.html";

		} else if (act.equals("edit")) {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			EmployeeList employeeToEdit = elh.searchForEmpFirstNameById(tempId);
			request.setAttribute("employeeToEdit", employeeToEdit);
			path = "/edit-item.jsp";
		}

		getServletContext().getRequestDispatcher(path).forward(request, response);

	}

}
