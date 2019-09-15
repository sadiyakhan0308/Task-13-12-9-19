package com.wp.MVCBookStore;



public class Book {
	private int bookid;
	private String bookname;
	private String price;
	private String author;
	private String booklocation;
	private String bookcategory;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + ", author=" + author
				+ ", booklocation=" + booklocation + ", bookcategory=" + bookcategory + "]";
	}
	public Book() {
		super();
	}
	public Book(int bookid) {
        this.bookid = bookid;
    }
	public Book(int bookid, String bookname, String price2, String author, String booklocation, String bookcategory) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price2;
		this.author = author;
		this.booklocation = booklocation;
		this.bookcategory = bookcategory;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBooklocation() {
		return booklocation;
	}
	public void setBooklocation(String booklocation) {
		this.booklocation = booklocation;
	}

	public String getBookcategory() {
		return bookcategory;
	}
	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
}
