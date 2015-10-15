<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="routine">

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
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.addroutine"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.contacts" /></h3>
<c:if test="${!empty routineList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.routine_name" /></th>
			<th><spring:message code="label.routine_html" /></th>
			<th><spring:message code="label.instrument" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${routineList}" var="routine">
			<tr>
				<td>${routine.routine_name}, ${routine.routine_html}</td>
				<td>${routine.instrument}</td>
				<td><a href="delete/${routine.id}"><spring:message code="label.delete" /></a> <a href="update/${routine.id}">Update</a> }</td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>