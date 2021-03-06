package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method was called");
		PrintWriter pw = res.getWriter();
		pw.println("Hello World");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method was called");
	}
	
	public void destroy() {
		System.out.println("Destroy method was called");
	}
	
}