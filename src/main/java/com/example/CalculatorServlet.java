package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operator = request.getParameter("operator");

        double result = 0;
        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num2 != 0 ? num1 / num2 : 0; break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Result: " + result + "</h2>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
    }
}
