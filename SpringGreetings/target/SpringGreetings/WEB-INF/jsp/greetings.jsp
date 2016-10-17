<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
 
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<title>Spring Greetings</title>
</head>
 
<body bgcolor='#<c:out value="${colorcode}" />'>
 
<h1>Spring Greetings</h1>
 
<c:if test="${not empty greetinglist}" >
	<c:forEach items="${greetinglist}" var="greeting">		
			<br/><b>@Anonymous</b> says<br/>	
			on <c:out value="${greeting.greetingDate}" /><br/>	
			<c:out value="${greeting.greetingText}" /><br/>			
	</c:forEach>	
</c:if>
<c:if test="${empty greetinglist}" >
	There are no greetings yet. 
</c:if>
 
<p><a href="/SpringGreetings/home/addgreeting.html">Add greeting</a><br/>
<a href="/SpringGreetings/">Home</a>
 
</body>
</html>