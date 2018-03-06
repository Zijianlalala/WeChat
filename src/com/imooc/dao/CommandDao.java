package com.imooc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Command;
import com.imooc.db.DBAccess;

public class CommandDao {
	/**
	 * 查询某个命令以及其对应的内容的所有信息
	 */
	public static List<Command> queryCommandList(String name, String description) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Command> commandList = new ArrayList<>();
		try {
			sqlSession = dBAccess.getSqlSession();
			//通过SqlSession执行SQL语句
			Command command = new Command();
			command.setName(name);
			command.setDescription(description);
			commandList = sqlSession.selectList("Command.queryCommandList",command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return commandList;
	}
}
