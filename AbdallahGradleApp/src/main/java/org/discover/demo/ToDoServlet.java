package org.discover.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;

@WebServlet(name = "ToDoServlet", urlPatterns = {"/todo/*"}, loadOnStartup = 1)
public class ToDoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] arr = {"Jump the fence",
                        "Break into neighbors house",
                        "Find the dog",
                        "Steal the dog",
                        "Play with the dog",
                        "The dog is yours now",
                        "His name is Buck"
                        };

        request.setAttribute("array", arr);
        request.getRequestDispatcher("todoresponse.jsp").forward(request, response);
    }
}