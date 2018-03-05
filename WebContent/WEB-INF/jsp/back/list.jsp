<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE" />
		<title>Content List</title>
		<link href="${pageContext.request.contextPath}/resources/css/all.css" rel="stylesheet" type="text/css" />
	</head>
	<body style="background: #e1e9eb;">
		<form action="List.action" id="mainForm" method="post">
			<div class="right">
				<div class="current">Current position:<a href="javascript:void(0)" style="color:#6E6E6E;">Content Management</a> &gt; Content List</div>
				<div class="rightCont">
					<p class="g_title fix">Content List <a class="btn03" href="#">Add new item</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn03" href="#">Delete an item</a></p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right"> 指令名称:</td>
								<td>
									<input name="command" type="text" class="allInput" value="${command }"/>
								</td>
								<td width="90" align="right"> 描述:</td>
								<td>
									<input name="description" type="text" class="allInput" value="${description }"/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="Query" /></td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
						<tbody>
							<tr>
								<th><input type="checkbox" id="all" onclick="#" /></th>
								<th>Number</th>
								<th>Command</th>
								<th>Description</th>
								<th>operate</th>
							</tr>
							<c:forEach items="${messageList}" var="message"
								varStatus="status">
								<tr
									<c:if test="${status.index % 2 != 0}">style="background-color:#ECF6EE;"</c:if>>
									<td><input type="checkbox" /></td>
									<td>${status.index + 1}</td>
									<td>${message.command }</td>
									<td>${message.description }</td>
									<td><a href="#">update</a>&nbsp;&nbsp;&nbsp; <a href="#">delete</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
						<div class='page fix'>
							 <b>4</b> entries
							<a href='###' class='first'>index</a>
							<a href='###' class='pre'>pre page</a>
							current NO.<span>1/1</span>page
							<a href='###' class='next'>next page</a>
							<a href='###' class='last'>last page</a>
							forward to&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;page&nbsp;
							<a href='###' class='go'>GO</a>
						</div>
					</div>
				</div>
			</div>
	    </form>
	</body>
</html>
