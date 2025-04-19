package com.han.web.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("test/html");

		resp.getWriter().append("""
				<html>
				<head>
				<meta charset="UTF-8">
				<title>Hello JSP</title>
				</head>
				<body>

				<h1>Hello There!I am here.b</h1>
mannnn
				</body>
				</html>
				""");
	}  
}
 