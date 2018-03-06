/**
 * 后台删除一条信息
 */
function deleteOne(id) {
	if (confirm("您确定要删除该条信息吗?")) {
		document.getElementById("mainForm").action = "DeleteOneServlet.action?id="
				+ id;

		document.getElementById("mainForm").submit();
	}
}
/**
 * 后台更新一条信息
 */
function myFunction(name, job) {
	alert("Welcome " + name + ", the " + job);
}
/**
 * 后台批量删除信息
 * 
 * @returns
 */
function deleteBatch() {
	if (confirm("您确定要删除所选信息吗?")) {
		document.getElementById("mainForm").action = "DeleteBatchServlet.action";

		document.getElementById("mainForm").submit();
	}
}