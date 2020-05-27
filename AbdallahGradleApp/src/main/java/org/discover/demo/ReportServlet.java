package org.discover.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ReportServlet", urlPatterns = {"/report/*"}, loadOnStartup = 1)
public class ReportServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(12345, "Boi", "If you don't", 4.00f));
        students.add(new Student(67890, "Peter", "Zezima", 4.00f));
        for (Student st: students
             ) {
            System.out.println(st.getFirstName());
        }
        request.setAttribute("students", students);
        request.getRequestDispatcher("reportresponse.jsp").forward(request, response);
    }
}