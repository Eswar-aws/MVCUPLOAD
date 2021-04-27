<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Files Upload</title>
</head>
<body>
<span align="center">
<h2> File Upload</h2>
<form action="upload" method="post" enctype="multipart/form-data">
<table border="0" width="80" align="center">
<tr><td>FileUpload1</td><td><input type="file" name="fileupload"></td></tr>
<tr><td>FileUpload2</td><td><input type="file" name="fileupload"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Upload"></td></tr>
</table>
</form>
</span>
</body>
</html>