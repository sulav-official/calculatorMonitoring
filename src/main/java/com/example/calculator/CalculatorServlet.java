package com.example.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int num3 = Integer.parseInt(request.getParameter("num3"));
		String operation = request.getParameter("operation");

		SimpleCalculator calculator = new SimpleCalculator();
		double result = 0;

		switch (operation) {
			case "add":
				result = calculator.add(num1, num2, num3);
				break;
			case "subtract":
				result = calculator.subtract(num1, num2, num3);
				break;
			case "multiply":
				result = calculator.multiply(num1, num2, num3);
				break;
			case "divide":
				try {
					result = calculator.divide(num1, num2, num3);
				} catch (IllegalArgumentException e) {
					response.getWriter().write("Error: " + e.getMessage());
					return;
				}
				break;
			default:
				response.getWriter().write("Invalid operation");
				return;
		}

		response.getWriter().write("Result: " + result);
	}
}