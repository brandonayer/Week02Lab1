/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 677571
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String returnMessage = "";
        String currentAge = request.getParameter("currentAge");
        if (currentAge == null || currentAge.equals("")) {
            returnMessage = "Please Enter an Age";
        } else {
            int nextYearAge = getNextYearAge(Integer.parseInt(currentAge));
            returnMessage = "Your age next birthday will be " + nextYearAge;
        }
        request.setAttribute("returnMessage", returnMessage);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    private int getNextYearAge(int currentAge) {
        return currentAge + 1;
    }

}
