package com.hcl.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.hcl.controller.exception.InvalidUserException;
import com.hcl.seller.service.AuctionItemService;
import com.hcl.seller.service.AuctionItemServiceImpl;
import com.hcl.user.domain.User;
import com.hcl.user.service.UserService;
import com.hcl.user.service.UserServiceImpl;

@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet("/submitAuctionItem")
public class SubmitAuctionItemServlet extends AbstractAuctionItemServlet {

	private static String getParameterValue(HttpServletRequest request, String paramter)
			throws IOException, ServletException {
		Part part = request.getPart(paramter);

		BufferedReader br = new BufferedReader(new InputStreamReader(part.getInputStream()));

		return br.readLine();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO: There is a serious problem here!!!
		// Validate User and find the User
		User user = null;
		Boolean isContinueTransaction = true;
		try {
			user = getSessionUser(request);
			
		} catch (InvalidUserException e) {
			isContinueTransaction = false;
		}
		
		if(isContinueTransaction) {
			// Get Form Data From Request
			String title = getParameterValue(request, "title");
			String description = getParameterValue(request, "description");
			String condition = getParameterValue(request, "condition");
			Integer timePeriod = Integer.parseInt(getParameterValue(request, "timePeriod"));
			Double startingPrice = Double.parseDouble(getParameterValue(request, "startingPrice"));
			InputStream photo = request.getPart("photo").getInputStream();

			Boolean isInserted = getAuctionItemService()
					.submitAuctionItem(user, title, description, condition, timePeriod, startingPrice,
					photo);
			
			if (isInserted) {
				// TODO: Send Success Message
				RequestDispatcher rd = request.getRequestDispatcher("auctionItems.jsp");
				rd.forward(request, response);
			} else {
				// TODO: Error Message
				RequestDispatcher rd = request.getRequestDispatcher("submitAuctionItem.jsp");
				rd.forward(request, response);
			}
			
		} else {
			// User is not signed in
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		

		

	}

}
