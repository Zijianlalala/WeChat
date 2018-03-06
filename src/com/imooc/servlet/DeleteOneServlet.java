package com.imooc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.service.QueryService;
import com.imooc.service.MaintainService;

/**
 * Servlet implementation class DeleteOneServlet
 */
@WebServlet("/DeleteOneServlet.action")
public class DeleteOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码格式
		request.setCharacterEncoding("UTF-8");
		// 获取页面提交的参数
		String id = request.getParameter("id");
		// 调用业务层，获得查询结果列表
		MaintainService service = new MaintainService();
		service.deleteOne(id);
		// 保存并转发到jsp页面
		request.getRequestDispatcher("/List.action").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
