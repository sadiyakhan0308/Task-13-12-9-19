<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Book Entry</h3>
	<form action="FetchDetails">
		<table align="center" border="0">
			<tr>
				<td>BookId</td>
				<td><input type="text" name="bookid" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td>Book Location</td>
				<td><input type="text" name="booklocation" /></td>
			</tr>

			<tr>
				<td>Book Category</td>
				<td><input type="text" name="bookcategory" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>