<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String username = (String) session.getAttribute("username");

	if(username == null) {
		
		RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
		rd.forward(request, response);
		
	}
%>