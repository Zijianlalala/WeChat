package com.imooc.bean;

/**
 * 内容的实体类
 * 体现了一对多的关系
 * 多个内容可以对应一个指令id
 * @author wuzijian
 *
 */
public class CommandContent {
	private int id;
	private String content;
	private int command_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCommand_id() {
		return command_id;
	}
	public void setCommand_id(int command_id) {
		this.command_id = command_id;
	}
	@Override
	public String toString() {
		return "CommandContent [id=" + id + ", content=" + content + ", command_id=" + command_id + "]";
	}
	
	
	
	
	
	
}
