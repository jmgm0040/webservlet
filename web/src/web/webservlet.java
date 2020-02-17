package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/")


public class webservlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
		pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
		pw.println("<H2>Leyendo parámetros desde un formulario html</H2><P>");
		pw.println("<UL>\n");
		pw.println("Te llamas " + req.getParameter("NOM") + "<BR>");
		pw.println("y tienes "  + req.getParameter("EDA") + " años<BR>");
		pw.println("</BODY></HTML>");
		pw.close();
	}
} 