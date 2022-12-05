package by.home.test.servletex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("Successful login");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String name = request.getParameter("name");

		String parameter = login + " " + password + " " + name;
		String path = "/src/main/java/by/home/test/servletex/NewFile.txt";

		try (FileWriter writer = new FileWriter(path, true)) {

			writer.write(parameter);
			writer.append('\n');

		} catch (IOException e) {

			e.printStackTrace();

		}

		PrintWriter out = response.getWriter();

		out.println("Successful registration \n");

	}

}
