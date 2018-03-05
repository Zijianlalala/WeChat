package com.imooc.bean;

/**
 * 与消息表对应的实体类
 */
public class Message {
	private int id;
	private String command;
	private String description;
	private String content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", command=" + command + ", description=" + description + ", content=" + content
				+ "]";
	}
	
	
	
}
