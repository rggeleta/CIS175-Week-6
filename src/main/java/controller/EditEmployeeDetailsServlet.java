package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EmployeeList;
import model.EmployeeListDetails;
import model.Employees;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class EditEmployeeDetailsServlet
 */
@WebServlet("/employeeDetailsServlet")
public class EditEmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditEmployeeDetailsServlet() {
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

		// TODO Auto-generated method stub
		EmployeeListHelper elh = new EmployeeListHelper();
		EmployeeHelper eh = new EmployeeHelper();
		EmployeesHelper esh = new EmployeesHelper();

		Integer tempId = Integer.parseInt(request.getParameter("id"));
		EmployeeListDetails listToUpdate = elh.searchForListDetailsById(tempId);

		String newListName = request.getParameter("listName");

		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");

		String employeeName = request.getParameter("employeeName");
		// find our add the new shopper
		Employees newemployee = eh.findEmployee(employeeName);

		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}

		try {
			// items are selected in list to add
			String[] selectedItems = request.getParameterValues("allEmployeeToAdd");
			List<EmployeeList> selectedItemsInList = new ArrayList<EmployeeList>();

			for (int i = 0; i < selectedItems.length; i++) {
				System.out.println(selectedItems[i]);
				EmployeeList el = elh.searchForEmpFirstNameById(Integer.parseInt(selectedItems[i]));
				selectedItemsInList.add(el);

			}
			listToUpdate.setListOfEmployee(selectedItemsInList);
		} catch (NullPointerException ex) {
			// no items selected in list - set to an empty list
			List<EmployeeList> selectedItemsInList = new ArrayList<EmployeeList>();
			listToUpdate.setListOfEmployee(selectedItemsInList);
		}

		listToUpdate.setEmpListName(newListName);
		listToUpdate.setTripDate(ld);
		listToUpdate.setEmpListName(newListName);

//elh.updateEmpListName(listToUpdate);

		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
	}

}
