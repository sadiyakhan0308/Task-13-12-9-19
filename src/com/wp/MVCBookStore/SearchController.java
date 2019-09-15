package com.wp.MVCBookStore;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reads the request
		int code = Integer.parseInt(request.getParameter("bookid"));
		// process it using dao/service classes
		BookDao dao = new BookDao();

		Book book = new Book();
		dao.searchBook(bookid);
		request.setAttribute("bookinfo", book);

		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);

	}
}