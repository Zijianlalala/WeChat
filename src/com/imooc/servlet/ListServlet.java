package com.imooc.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;
import com.imooc.service.QueryService;

/**
 * 列表页面初始化控制
 */
@WebServlet("/List.action")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码格式
		request.setCharacterEncoding("UTF-8");
		//获取页面提交的参数
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		//保存页面提交的参数s
		request.setAttribute("command", command);
		request.setAttribute("description", description);
		//调用业务层，获得查询结果列表
		List<Message> messageList = new QueryService().queryMessageList(command, description);
		//保存并转发到jsp页面
		request.setAttribute("messageList", messageList);
		request.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
