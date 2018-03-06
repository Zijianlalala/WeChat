<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加信息</title>
</head>
<body>
	<div>
		<form action="AddOneServlet.action">
			<table>
				<tr>
					<td>命令:</td>
					<td><input type="text" name="command2"></td>
				</tr>
				<tr>
					<td>描述:</td>
					<td><input type="text" name="description2"></td>
				</tr>
				<tr>
					<td>内容:</td>
					<td><input type="text" name="content"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="提交">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>