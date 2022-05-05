package com.shiva.product.servlets;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.shiva.product.bo.ProductBO;
import com.shiva.product.bo.ProductBOImpl;
import com.shiva.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductBO bo = new ProductBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID: "+ product.getId());
		out.print("Product Name: "+ product.getName());
		out.print("Product Description: "+ product.getDescription());
		out.print("Product Price: "+ product.getPrice());
		
		
	}

}
