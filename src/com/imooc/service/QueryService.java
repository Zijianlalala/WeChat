package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
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
	 * 通过指令查询自动回复内容
	 */
	public String queryByCommand(String command) {
		List<Message> messages;
		if(Iconst.HELP_COMMAND.equals(command)) {
			messages = MessageDao.queryMessageList(null, null);
			StringBuffer result = new StringBuffer();
			for(int i = 0; i < messages.size(); i++) {
				if(i!=0) {
					result.append("<br/>");
				}
				result.append("回复["+messages.get(i).getCommand()+"],可以查看" 
											+ messages.get(i).getDescription());
			}
			return result.toString();
		}
		
		messages = MessageDao.queryMessageList(command, null);
		if (!messages.isEmpty()) {
			return messages.get(0).getContent();
		}
		return Iconst.NO_MATCHING_CONTENT;
	}
}
