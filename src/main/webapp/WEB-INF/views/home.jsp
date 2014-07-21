<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>
	<title>Example :: Spring Application</title>
</head>
<body>
<h1>
	Example - Spring Application
</h1>

<P>  This is my test. <br>The time on the server is <c:out value="${serverTime}"/>. </P>
</body>
</html>
