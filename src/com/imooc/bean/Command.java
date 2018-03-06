package com.imooc.bean;

import java.util.List;

/**
 * 指令的实体类
 * @author wuzijian
 *
 */
public class Command {
	//命令id
	private int id;
	//命令名称
	private String name;
	//命令描述
	private String description;
	//命令对应的多条内容
	private List<CommandContent> contentList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CommandContent> getContentList() {
		return contentList;
	}
	public void setContentList(List<CommandContent> list) {
		this.contentList = list;
	}
	
	
	
	
}
