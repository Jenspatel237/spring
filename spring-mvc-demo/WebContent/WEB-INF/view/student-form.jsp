<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="student">
		
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			Counrty: 
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
				
			</form:select>
			<br><br>
			
			Favorite Language: 
			
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
			
			<br><br>
			
			Operating Languages: 
			
			<form:checkbox path="operatingSystems" value="Linux" /> Linux
			<form:checkbox path="operatingSystems" value="Mac Os"/> Mac Os
			<form:checkbox path="operatingSystems" value="MS Windows"/> MS Windows
			
			<br><br>
			<input type="submit" value="Submit" />
			
		</form:form>
	</body>
</html>