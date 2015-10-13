<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="http://localhost:8080/musicroutine/update/" commandName="routine">

	<table>
		<tr>
			<td><form:label path="routine_name">
				<spring:message code="label.routine_name" />
			</form:label></td>
			<td><form:input path="routine_name" /></td>
		</tr>
		<tr>
			<td><form:label path="routine_html">
				<spring:message code="label.routine_html" />
			</form:label></td>
			<td><form:input path="routine_html" /></td>
		</tr>
		<tr>
			<td><form:label path="instrument">
				<spring:message code="label.instrument" />
			</form:label></td>
			<td><form:input path="instrument" /></td>
		</tr>
		<tr>
			<td><form:label path="id">
				<spring:message code="label.id" />
			</form:label></td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="<spring:message code="label.addroutine"/>" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>