package app;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by viskyo on 24/09/2015.
 */
public class AwesomeServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException {

        // Do required initialization
        message = "Spring + Selenium = Love";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1 class='love-text'>" + message + "</h1>");
    }

    public void destroy() {
        // do nothing.
    }
}
