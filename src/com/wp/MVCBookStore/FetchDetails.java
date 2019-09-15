package com.wp.MVCBookStore;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/FetchDetails")
public class FetchDetails extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			//reads the request
			int bookid=Integer.parseInt(request.getParameter("bookid"));
			String name=request.getParameter("name");
			String price=request.getParameter("price");
			String author=request.getParameter("author");
			String booklocation=request.getParameter("booklocation");
			String bookcategory=request.getParameter("bookcategory");
			//process it using dao/service classes
			BookDao dao=new BookDao();
			Book book=new  Book();
			book.setBookid(bookid);
			book.setBookname(name);
			book.setPrice(price);
			book.setAuthor(author);
			book.setBooklocation(booklocation);
			book.setBookcategory(bookcategory);
			dao.saveBook(book);
			//store the model in scope object
			HttpSession session=request.getSession();
			session.setAttribute("bookinfo", book);
			//forwards the request to view
			RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
			rd.forward(request, response);
			
			
	}
		

}