<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
	<title>Save Artist</title>
	<link type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
	<link type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-artist-style.css">
</head>
<body>
<div id="wrapper">
	<div id="header">
	<h2>Artist Manager</h2>
	
	</div>
</div>
<div id="container">
<h3>Artist Manager</h3>
<form:form action="saveArtist" modelAttribute="artist" method="POST">
<form:hidden path="id"/>
	<table>
		<tbody>
			<tr>
				<td><label>First Name:</label></td>
				<td><form:input path="firstName"/></td>
			</tr>
				<tr>
				<td><label>Last Name:</label></td>
				<td><form:input path="lastName"/></td>
			</tr>
				
			<tr>
				<td><label>Email:</label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><label>Submit</label></td>
				<td><input type="submit" value="save" class="save"/></td>
			</tr>
	
		</tbody>
	</table>
	</form:form>

			<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/artist/list">Back to List</a>
		</p>
	
	
	
</div>

</body>

</html>