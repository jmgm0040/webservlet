package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/")
public class webservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        
        out.println("<h1>Java Servlet Tutorial</h1>");
        out.println("<p>Este es mi primer <b>Servlet</b>.</p>");
        out.println("<p>Por: <a href=\"http://acodigo.blogspot.com\">Tutor de Programacion</a> </p>");
    }
}
