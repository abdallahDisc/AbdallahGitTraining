package org.discover.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmbedServlet", urlPatterns = {"/embed/*"}, loadOnStartup = 1)
public class EmbedServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("array", "");
        request.getRequestDispatcher("embedresponse.jsp").forward(request, response);
    }
}