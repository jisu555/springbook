package com.spring.controller;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ActionController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	
	//doGet, doPost �� �Ѿ���� Ŭ���̾�Ʈ ��û�� process() �޼ҵ忡�� �ѹ��� ó��
	private void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Ŭ���̾�Ʈ ��û ������ �����ؾ���. path ������ �Ҵ�.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
			System.out.println(uri);
			System.out.println(path);
				
		if (path.equals("/login.action")) {
			System.out.println("login.action �� ��û�߽��ϴ�.");
				
		}else if (path.equals("/logout.action")) {
				System.out.println("logout.action �� ��û�߽��ϴ�.");
		}
		
	}

}
