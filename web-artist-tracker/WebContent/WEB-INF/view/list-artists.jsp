<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>List Artists</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
	<h2>Artist Manager</h2>
	<link type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	/>

	</div>
</div>
<div id="container">
	<div id="content">
	<input type="button" value="Add Artist" onclick="window.location.href='showFormForAdd';return false;"
	class="add-button"
/>
	<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Action</th>
	<c:forEach var="tempArtist" items="${artists}">
	<c:url var="updateLink" value="/artist/showFormUpdate">
	<c:param name="artistId" value="${tempArtist.id}"/>
	</c:url>
	<c:url var="deleteLink" value="/artist/delete">
	<c:param name="artistId" value="${tempArtist.id}"/>
	</c:url>
		<tr>
			<td>${tempArtist.firstName}</td>
			<td>${tempArtist.lastName}</td>
			<td>${tempArtist.email}</td>
			<td>
			<a href="${updateLink}">Update</a>
			|
			<a href="${deleteLink}"
			onClick="if(!(confirm('Are you sure to delete this artist?'))) return false">Delete</a>
			</td>
		</tr>
	</c:forEach>>
	
	</tr>
	</table>

	</div>
</div>

</body>
</html>