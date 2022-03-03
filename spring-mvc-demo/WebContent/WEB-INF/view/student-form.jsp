<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName" />
	
	<br><br>
	
	Last name: <form:input path="lastName" />
	
	<br><br>
	
	<form:select path="country">
		<form:options items="${student.countryOptions}" />
		
	</form:select>
	
	<br><br>
	
	Favorite Language:
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
	
	<br><br>
	
	Operatin Systems :
	
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	MAC <form:checkbox path="operatingSystems" value="MAC"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	
	
	</form:form>



</body>



</html>