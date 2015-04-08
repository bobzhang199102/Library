package com.itheima.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.android.mygson.http.HttpUtils;
import com.android.mygson.json.GsonTools;
import com.json.domain.Book;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doPost(req, resp);
//		System.out.println("Post");
//		doGet(req, resp);

		String username = req.getParameter("username"); // iso 8859-1
		String password = req.getParameter("password");
		String json = req.getParameter("book");
		System.out.println(json);
//		String json = "[{\"productname\":\"Thinking, Fast and Slow\",\"upc\":\"9780141033570\",\"price\":5.95,\"amount\":0},{\"productname\":\"Thinking, Fast and Slow\",\"upc\":\"9780141033570\",\"price\":5.95,\"amount\":0}]";
//		System.out.println(request);
		//parse json
		
		System.out.println(json);
		// System.out.println("username:"+new
		// String(username.getBytes("iso-8859-1"),"gbk"));
		// System.out.println("password:"+password);
		
		List<Book> list = GsonTools.getBooks(json, Book.class);
		
		for(Object o:list){
			   System.out.println(o);
			   Book book = (Book)o;
			   System.out.println("amout="+book.getAmount());
			   System.out.println("amout="+book.getPrice());
			   System.out.println("amout="+book.getProductname());
			   
			}

		if (username == null || username.equals("") || password == null || password.equals("")) {
			resp.getOutputStream().write("0".getBytes("utf-8"));
		} else {
			if ("zhangsan".equals(username) && "123".equals(password)) {
				resp.getOutputStream().write(
						"1".getBytes("utf-8"));
				
				System.out.println("success....");
				//parse json
//				for(Object o:list){
//					   System.out.println(o);
//					}


			} else {
				resp.getOutputStream().write(
						"0".getBytes("utf-8"));

			}
		}
	}

}
