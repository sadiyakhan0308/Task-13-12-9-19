package com.wp.MVCBookStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDao {

	private Connection conn;

	public void saveBook(Book book) {
		try {
			String sql = "INSERT INTO bookinfo VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, book.getBookid());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getPrice());
			ps.setString(4, book.getAuthor());
			ps.setString(5, book.getBooklocation());
			ps.setString(6, book.getBookcategory());
			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Book DeleteBook(int bookid) {
		Book book = searchBook(bookid);
		String sql = "Delete FROM books WHERE bookid=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bookid);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;

	}

	public Book searchBook(int bookid) {
		Book book = null;
		String sql = "SELECT * FROM books WHERE bookid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bookid);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				book = new Book();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setPrice(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setBooklocation(rs.getString(5));
				book.setBookcategory(rs.getString(6));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public List<Book> getAllBooks() {
		return null;
	}

	public BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}