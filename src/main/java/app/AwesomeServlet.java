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

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html lang=\"en\">");
        out.println("<head>\n");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Awesome Automation</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header style=\"width: 100%;\">");
        out.println("<div class=\"header-container\" style=\"width: 50%; margin: 0 auto;\">");
        out.println("<h1 id=\"title\" style=\"color: red;\">Spring + Selenium = Love</h1>");
        out.println("</div>");
        out.println("</header>");
        out.println("<div style=\"width: 100%;\">");
        out.println("<div class=\"body-container\" style=\"width: 80%; margin: 0 auto;\">");
        out.println("<h3>That Darn Katz!</h3>");
        out.println("<p>Yes, if you make it look like an electrical fire. When you do things right, people won't be sure you've done anything at all. You guys realize you live in a sewer, right? Oh sure! Blame the wizards! You wouldn't. Ask anyway! You wouldn't. Ask anyway! Bender! Ship! Stop bickering or I'm going to come back there and change your opinions manually!</p>");
        out.println("<h4>A Big Piece of Garbage</h4>");
        out.println("<p>This opera's as lousy as it is brilliant!  Your lyrics lack subtlety. You can't just have your characters announce how they feel. That makes me feel angry! I just told you! You've killed me! Is the Space Pope reptilian!?</p>");
        out.println("<div class=\"button\" style=\"width: 150px; height: 40px; border-radius: 10px; color: #001f3f; background-color: #7fdbff; box-shadow: 0 5px 5px 0 #0074d9; padding-top: 15px; text-align: center; font-size: 20px; line-height: 22px;\">");
        out.println("Awesome Button");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<footer>");
        out.println("<span style=\"float: right;\">&copy; We did it!</span>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
        // do nothing.
    }
}
