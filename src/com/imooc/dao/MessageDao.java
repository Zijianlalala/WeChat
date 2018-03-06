package com.imooc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;

/**
 * 操作数据库的类
 * @author wuzijian
 *
 */
public class MessageDao {
	/**
	 * 根据查询条件查询信息列表
	 * @param command 要求
	 * @param description 描述
	 * @return 信息列表
	 */
	public static List<Message> queryMessageList(String command, String description) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Message> messageList = new ArrayList<>();
		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);
		try {
			sqlSession = dBAccess.getSqlSession();
			//通过SqlSession执行SQL语句
			messageList = sqlSession.selectList("queryMessageList", message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}
	/**
	 * 删除单条信息
	 */
	public static void deleteOne(int id) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dBAccess.getSqlSession();
			//通过SqlSession执行SQL语句
			sqlSession.delete("deleteOne", id);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 删除多条信息
	 */
	public static void deleteBatch(List<Integer> id) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dBAccess.getSqlSession();
			//通过SqlSession执行SQL语句
			sqlSession.delete("deleteBatch", id);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	/**
	 * 添加一条信息
	 */
	public static void addOne(Message message) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dBAccess.getSqlSession();
			//通过SqlSession执行SQL语句
			sqlSession.insert("addOne",message);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	
//	public static List<Message> queryMessageList(String command, String description) {
//		List<Message> messageList = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://127.0.0.1:3306/wechat?useUnicode=true&characterEncoding=UTF-8", "root", "test");
//			StringBuilder sql = new StringBuilder("select id,command,description,content from message where 1=1");
//			List<String> paramList = new ArrayList<String>();
//			if (command != null && !"".equals(command.trim())) {
//				sql.append(" and command=?");
//				paramList.add(command);
//			}
//			if (description != null && !"".equals(description.trim())) {
//				sql.append(" and description like '%' ? '%'");
//				paramList.add(description);
//			}
//			PreparedStatement ps = conn.prepareStatement(sql.toString());
//			for (int i = 0; i < paramList.size(); i++) {
//				ps.setString(i + 1, paramList.get(i));
//			}
//			System.out.println(sql.toString());
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				Message message = new Message();
//				messageList.add(message);
//				message.setId(rs.getInt("id"));
//				message.setCommand(rs.getString("command"));
//				message.setDescription(rs.getString("description"));
//				message.setContent(rs.getString("content"));
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return messageList;
//	}
}
