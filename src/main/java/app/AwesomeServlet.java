package app;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by viskyo on 24/09/2015.
 */
public class AwesomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type and redirect
        response.setContentType("text/html");
        response.sendRedirect("index.html");
    }

    public void destroy() {
        // do nothing.
    }
}
