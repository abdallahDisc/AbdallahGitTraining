package org.discover.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VolumeServlet", urlPatterns = {"/volume/*"}, loadOnStartup = 1)
public class VolumeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String x = request.getParameter("x");
        if (x == null || x.compareTo("") == 0) x = "0";
        String y = request.getParameter("y");
        if (y == null || y.compareTo("") == 0) y = "0";
        String z = request.getParameter("z");
        if (z == null || z.compareTo("") == 0) z = "0";
        request.setAttribute("xval", x);
        request.setAttribute("yval", y);
        request.setAttribute("zval", z);
        request.setAttribute("volume",
                (Integer.parseInt(x) * Integer.parseInt(y) * Integer.parseInt(z))
        );
        request.getRequestDispatcher("volumeresponse.jsp").forward(request, response);
    }
}