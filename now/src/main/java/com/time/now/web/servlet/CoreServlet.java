package com.time.now.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoreServlet
 */
public class CoreServlet extends HttpServlet{
	private static final long	serialVersionUID	= 1L;
	
	/**
	 * Default constructor.
	 */
	public CoreServlet(){}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("GET REQUEST FOR CoreServlet");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.write("GET: present moment");
		out.flush();
		out.close();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("POST REQUEST FOR CoreServlet");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.write("POST: present moment");
		out.flush();
		out.close();
	}
}