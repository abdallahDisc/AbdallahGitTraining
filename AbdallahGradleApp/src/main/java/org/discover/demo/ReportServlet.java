package org.discover.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ReportServlet", urlPatterns = {"/report/*"}, loadOnStartup = 1)
public class ReportServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("student", new Student(12345, "Boi", "If you don't", 4.00f));
        request.getRequestDispatcher("reportresponse.jsp").forward(request, response);
    }
}