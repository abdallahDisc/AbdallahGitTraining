package org.discover.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TextServlet", urlPatterns = {"/text/*"}, loadOnStartup = 1)
public class TextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("array", "");
        request.getRequestDispatcher("todoresponse.jsp").forward(request, response);
    }
}