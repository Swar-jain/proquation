package com.proquation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.dao.TeacherRegistrationDAO;
import com.proquation.dao.TeacherUsernameSearch;
//Author name: Rahul Suresh
@WebServlet("/teacherregister")
public class TeacherRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TeacherRegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("firstname");
		String username = request.getParameter("username");
		String grade = request.getParameter("grade");
		String password = request.getParameter("password");
		TeacherUsernameSearch teacherUsernameSearch = new TeacherUsernameSearch();
		boolean usernameNotExists = teacherUsernameSearch.CheckUsernameExists(username);
		if (usernameNotExists) {
			TeacherRegistrationDAO teacherRegistrationDao = new TeacherRegistrationDAO();
			teacherRegistrationDao.registerTeacher(name, username, password, grade);
		} else
			response.sendRedirect("teacheLogin.jsp");
		String message = "Teacher successfully added";
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("teacherLogin.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
