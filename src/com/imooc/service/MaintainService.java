package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * 维护功能的业务类
 * @author wuzijian
 *
 */
public class MaintainService {
	/**
	 * 单条删除
	 * @param id
	 */
	public void deleteOne(String id) {
		if(id!=null && !"".equals(id.trim())) {
			MessageDao.deleteOne(Integer.valueOf(id));
		}
	}
	/**
	 * 多条删除
	 * @param id
	 */
	public void deleteBatch(String[] ids) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < ids.length; i++) {
			list.add(Integer.valueOf(ids[i]));
		}
		MessageDao.deleteBatch(list);
	}
	/**
	 * 添加一条信息
	 */
	public void addOne(String command, String description, String content) {
		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);
		message.setContent(content);
		System.out.println(message.toString());
		MessageDao.addOne(message);
	}
}
