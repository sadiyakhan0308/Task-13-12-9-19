package com.wp.MVCBookStore;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookDao dao = new BookDao();
		int bookid = Integer.parseInt(request.getParameter("bookid"));

		Book book = dao.DeleteBook(bookid);
		HttpSession session = request.getSession();
		session.setAttribute("bookinfo", book);

		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);

	}
}