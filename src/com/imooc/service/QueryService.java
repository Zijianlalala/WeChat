package com.imooc.service;

import java.util.List;
import java.util.Random;

import com.imooc.bean.Command;
import com.imooc.bean.CommandContent;
import com.imooc.bean.Message;
import com.imooc.dao.CommandDao;
import com.imooc.dao.MessageDao;
import com.imooc.util.Iconst;

/**
 * 列表相关的业务功能
 * @author wuzijian
 *
 */
public class QueryService {
	/**
	 * 查询相关业务功能
	 * @param command
	 * @param description
	 * @return
	 */
	public List<Message> queryMessageList(String command, String description){
		return MessageDao.queryMessageList(command, description);
	}
	
	/**
	 * 通过查询条件查询指令列表
	 */
	public List<Command> queryCommandList(String name, String description){
		return CommandDao.queryCommandList(name, description);
	}
	/**
	 * 通过指令查询自动回复内容
	 */
	public String queryByCommand(String name) {
		List<Command> commandList;
		if(Iconst.HELP_COMMAND.equals(name)) {
			commandList = CommandDao.queryCommandList(null, null);
			StringBuffer result = new StringBuffer();
			for(int i = 0; i < commandList.size(); i++) {
				if(i!=0) {
					result.append("<br/>");
				}
				result.append("回复["+commandList.get(i).getName()+"],可以查看" 
											+ commandList.get(i).getDescription());
			}
			return result.toString();
		}
		
		commandList = CommandDao.queryCommandList(name, null);
		if (!commandList.isEmpty()) {
			List<CommandContent> contentList = commandList.get(0).getContentList();
			int i = new Random().nextInt(contentList.size());
			return contentList.get(i).getContent();
		}
		return Iconst.NO_MATCHING_CONTENT;
	}
}
